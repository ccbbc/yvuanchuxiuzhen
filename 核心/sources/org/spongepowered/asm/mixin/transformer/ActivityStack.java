package org.spongepowered.asm.mixin.transformer;

/* loaded from: 核心-mc1.12.2-0.0.2.jar:org/spongepowered/asm/mixin/transformer/ActivityStack.class */
public class ActivityStack {
    public static final String GLUE_STRING = " -> ";
    private final Activity head;
    private Activity tail;
    private String glue;

    /* loaded from: 核心-mc1.12.2-0.0.2.jar:org/spongepowered/asm/mixin/transformer/ActivityStack$Activity.class */
    public class Activity {
        public String description;
        Activity last;
        Activity next;

        Activity(Activity last, String description) {
            if (last != null) {
                last.next = this;
            }
            this.last = last;
            this.description = description;
        }

        public void append(String text) {
            this.description = this.description != null ? this.description + text : text;
        }

        public void append(String textFormat, Object... args) {
            append(String.format(textFormat, args));
        }

        public void end() {
            if (this.last != null) {
                ActivityStack.this.end(this);
                this.last = null;
            }
        }

        public void next(String description) {
            if (this.next != null) {
                this.next.end();
            }
            this.description = description;
        }

        public void next(String descriptionFormat, Object... args) {
            if (descriptionFormat == null) {
                descriptionFormat = "null";
            }
            next(String.format(descriptionFormat, args));
        }
    }

    public ActivityStack() {
        this(null, GLUE_STRING);
    }

    public ActivityStack(String root) {
        this(root, GLUE_STRING);
    }

    public ActivityStack(String root, String glue) {
        Activity activity = new Activity(null, root);
        this.tail = activity;
        this.head = activity;
        this.glue = glue;
    }

    public void clear() {
        this.tail = this.head;
        this.head.next = null;
    }

    public Activity begin(String description) {
        Activity activity = new Activity(this.tail, description != null ? description : "null");
        this.tail = activity;
        return activity;
    }

    public Activity begin(String descriptionFormat, Object... args) {
        if (descriptionFormat == null) {
            descriptionFormat = "null";
        }
        Activity activity = new Activity(this.tail, String.format(descriptionFormat, args));
        this.tail = activity;
        return activity;
    }

    void end(Activity activity) {
        this.tail = activity.last;
        this.tail.next = null;
    }

    public String toString() {
        return toString(this.glue);
    }

    public String toString(String glue) {
        if (this.head.description == null && this.head.next == null) {
            return "Unknown";
        }
        StringBuilder sb = new StringBuilder();
        Activity activity = this.head;
        while (true) {
            Activity activity2 = activity;
            if (activity2 != null) {
                if (activity2.description != null) {
                    sb.append(activity2.description);
                    if (activity2.next != null) {
                        sb.append(glue);
                    }
                }
                activity = activity2.next;
            } else {
                return sb.toString();
            }
        }
    }
}
