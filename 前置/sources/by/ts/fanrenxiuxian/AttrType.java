package by.ts.fanrenxiuxian;

import net.minecraft.nbt.NBTTagCompound;

/* loaded from: 前置-mc1.12.2-1.2.5.jar:by/ts/fanrenxiuxian/AttrType.class */
public interface AttrType<T> {
    public static final AttrType<Integer> INT = new AttrType<Integer>() { // from class: by.ts.fanrenxiuxian.AttrType.1
        @Override // by.ts.fanrenxiuxian.AttrType
        public void setData(NBTTagCompound playerData, String name, Integer defaultValue) {
            playerData.func_74768_a(name, defaultValue.intValue());
        }

        @Override // by.ts.fanrenxiuxian.AttrType
        public void setStringData(NBTTagCompound playerData, String name, String value) {
            setData(playerData, name, Integer.valueOf(Integer.parseInt(value)));
        }

        @Override // by.ts.fanrenxiuxian.AttrType
        public void setRandData(NBTTagCompound playerData, String name) {
            setData(playerData, name, Integer.valueOf((int) (Math.random() * 10.0d)));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // by.ts.fanrenxiuxian.AttrType
        public Integer getData(NBTTagCompound playerData, String name) {
            return Integer.valueOf(playerData.func_74762_e(name));
        }
    };
    public static final AttrType<Long> LONG = new AttrType<Long>() { // from class: by.ts.fanrenxiuxian.AttrType.2
        @Override // by.ts.fanrenxiuxian.AttrType
        public void setData(NBTTagCompound playerData, String name, Long defaultValue) {
            playerData.func_74772_a(name, defaultValue.longValue());
        }

        @Override // by.ts.fanrenxiuxian.AttrType
        public void setStringData(NBTTagCompound playerData, String name, String value) {
            setData(playerData, name, Long.valueOf(Long.parseLong(value)));
        }

        @Override // by.ts.fanrenxiuxian.AttrType
        public void setRandData(NBTTagCompound playerData, String name) {
            setData(playerData, name, Long.valueOf((long) (Math.random() * 10.0d)));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // by.ts.fanrenxiuxian.AttrType
        public Long getData(NBTTagCompound playerData, String name) {
            return Long.valueOf(playerData.func_74763_f(name));
        }
    };
    public static final AttrType<Float> FLOAT = new AttrType<Float>() { // from class: by.ts.fanrenxiuxian.AttrType.3
        @Override // by.ts.fanrenxiuxian.AttrType
        public void setData(NBTTagCompound playerData, String name, Float defaultValue) {
            playerData.func_74776_a(name, defaultValue.floatValue());
        }

        @Override // by.ts.fanrenxiuxian.AttrType
        public void setStringData(NBTTagCompound playerData, String name, String value) {
            setData(playerData, name, Float.valueOf(Float.parseFloat(value)));
        }

        @Override // by.ts.fanrenxiuxian.AttrType
        public void setRandData(NBTTagCompound playerData, String name) {
            setData(playerData, name, Float.valueOf((float) (Math.random() * 10.0d)));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // by.ts.fanrenxiuxian.AttrType
        public Float getData(NBTTagCompound playerData, String name) {
            return Float.valueOf(playerData.func_74760_g(name));
        }
    };
    public static final AttrType<Double> DOUBLE = new AttrType<Double>() { // from class: by.ts.fanrenxiuxian.AttrType.4
        @Override // by.ts.fanrenxiuxian.AttrType
        public void setData(NBTTagCompound playerData, String name, Double defaultValue) {
            playerData.func_74780_a(name, defaultValue.doubleValue());
        }

        @Override // by.ts.fanrenxiuxian.AttrType
        public void setStringData(NBTTagCompound playerData, String name, String value) {
            setData(playerData, name, Double.valueOf(Double.parseDouble(value)));
        }

        @Override // by.ts.fanrenxiuxian.AttrType
        public void setRandData(NBTTagCompound playerData, String name) {
            setData(playerData, name, Double.valueOf(Math.random() * 10.0d));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // by.ts.fanrenxiuxian.AttrType
        public Double getData(NBTTagCompound playerData, String name) {
            return Double.valueOf(playerData.func_74769_h(name));
        }
    };
    public static final AttrType<String> STRING = new AttrType<String>() { // from class: by.ts.fanrenxiuxian.AttrType.5
        @Override // by.ts.fanrenxiuxian.AttrType
        public void setData(NBTTagCompound playerData, String name, String defaultValue) {
            playerData.func_74778_a(name, defaultValue);
        }

        @Override // by.ts.fanrenxiuxian.AttrType
        public void setStringData(NBTTagCompound playerData, String name, String value) {
            setData(playerData, name, value);
        }

        @Override // by.ts.fanrenxiuxian.AttrType
        public void setRandData(NBTTagCompound playerData, String name) {
            setData(playerData, name, String.valueOf(Math.random() * 10.0d));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // by.ts.fanrenxiuxian.AttrType
        public String getData(NBTTagCompound playerData, String name) {
            return playerData.func_74779_i(name);
        }
    };
    public static final AttrType<Boolean> BOOLEAN = new AttrType<Boolean>() { // from class: by.ts.fanrenxiuxian.AttrType.6
        @Override // by.ts.fanrenxiuxian.AttrType
        public void setData(NBTTagCompound playerData, String name, Boolean defaultValue) {
            playerData.func_74757_a(name, defaultValue.booleanValue());
        }

        @Override // by.ts.fanrenxiuxian.AttrType
        public void setStringData(NBTTagCompound playerData, String name, String value) {
            setData(playerData, name, Boolean.valueOf(Boolean.parseBoolean(value)));
        }

        @Override // by.ts.fanrenxiuxian.AttrType
        public void setRandData(NBTTagCompound playerData, String name) {
            setData(playerData, name, (Boolean) true);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // by.ts.fanrenxiuxian.AttrType
        public Boolean getData(NBTTagCompound playerData, String name) {
            return Boolean.valueOf(playerData.func_74767_n(name));
        }
    };

    void setData(NBTTagCompound nBTTagCompound, String str, T t);

    void setStringData(NBTTagCompound nBTTagCompound, String str, String str2);

    void setRandData(NBTTagCompound nBTTagCompound, String str);

    T getData(NBTTagCompound nBTTagCompound, String str);
}
