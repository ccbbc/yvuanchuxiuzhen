package org.spongepowered.tools.obfuscation.mapping.common;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import javax.annotation.processing.Filer;
import javax.annotation.processing.Messager;
import javax.lang.model.element.Element;
import javax.tools.Diagnostic;
import javax.tools.FileObject;
import javax.tools.StandardLocation;
import org.spongepowered.tools.obfuscation.mapping.IMappingWriter;

/* loaded from: 核心-mc1.12.2-0.0.2.jar:org/spongepowered/tools/obfuscation/mapping/common/MappingWriter.class */
public abstract class MappingWriter implements IMappingWriter {
    private final Messager messager;
    private final Filer filer;

    public MappingWriter(Messager messager, Filer filer) {
        this.messager = messager;
        this.filer = filer;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public PrintWriter openFileWriter(String fileName, String description) throws IOException {
        if (fileName.matches("^.*[\\\\/:].*$")) {
            File outFile = new File(fileName);
            outFile.getParentFile().mkdirs();
            this.messager.printMessage(Diagnostic.Kind.NOTE, "Writing " + description + " to " + outFile.getAbsolutePath());
            return new PrintWriter(outFile);
        }
        FileObject outResource = this.filer.createResource(StandardLocation.CLASS_OUTPUT, "", fileName, new Element[0]);
        this.messager.printMessage(Diagnostic.Kind.NOTE, "Writing " + description + " to " + new File(outResource.toUri()).getAbsolutePath());
        return new PrintWriter(outResource.openWriter());
    }
}
