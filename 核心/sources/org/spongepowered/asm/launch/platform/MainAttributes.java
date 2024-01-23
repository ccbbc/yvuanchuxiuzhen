package org.spongepowered.asm.launch.platform;

import com.google.common.io.ByteSource;
import com.google.common.io.Files;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.util.HashMap;
import java.util.Map;
import java.util.jar.Attributes;
import java.util.jar.JarFile;
import java.util.jar.Manifest;

/* loaded from: 核心-mc1.12.2-0.0.2.jar:org/spongepowered/asm/launch/platform/MainAttributes.class */
public final class MainAttributes {
    private static final Map<URI, MainAttributes> instances = new HashMap();
    protected final Attributes attributes;

    private MainAttributes() {
        this.attributes = new Attributes();
    }

    private MainAttributes(File jar) {
        this.attributes = getAttributes(jar);
    }

    public final String get(String name) {
        if (this.attributes != null) {
            return this.attributes.getValue(name);
        }
        return null;
    }

    private static Attributes getAttributes(File codeSource) {
        Attributes attributes;
        Attributes attributes2;
        if (codeSource == null) {
            return null;
        }
        if (codeSource.isFile() && (attributes2 = getJarAttributes(codeSource)) != null) {
            return attributes2;
        }
        if (codeSource.isDirectory() && (attributes = getDirAttributes(codeSource)) != null) {
            return attributes;
        }
        return new Attributes();
    }

    private static Attributes getJarAttributes(File jar) {
        JarFile jarFile = null;
        try {
            jarFile = new JarFile(jar);
            Manifest manifest = jarFile.getManifest();
            if (manifest != null) {
                Attributes mainAttributes = manifest.getMainAttributes();
                if (jarFile != null) {
                    try {
                        jarFile.close();
                    } catch (IOException e) {
                    }
                }
                return mainAttributes;
            }
            if (jarFile != null) {
                try {
                    jarFile.close();
                } catch (IOException e2) {
                    return null;
                }
            }
            return null;
        } catch (IOException e3) {
            if (jarFile != null) {
                try {
                    jarFile.close();
                } catch (IOException e4) {
                    return null;
                }
            }
            return null;
        } catch (Throwable th) {
            if (jarFile != null) {
                try {
                    jarFile.close();
                } catch (IOException e5) {
                    throw th;
                }
            }
            throw th;
        }
    }

    private static Attributes getDirAttributes(File dir) {
        File manifestFile = new File(dir, "META-INF/MANIFEST.MF");
        if (manifestFile.isFile()) {
            ByteSource source = Files.asByteSource(manifestFile);
            InputStream inputStream = null;
            try {
                inputStream = source.openBufferedStream();
                Manifest manifest = new Manifest(inputStream);
                Attributes mainAttributes = manifest.getMainAttributes();
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException e) {
                    }
                }
                return mainAttributes;
            } catch (IOException e2) {
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException e3) {
                        return null;
                    }
                }
                return null;
            } catch (Throwable th) {
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException e4) {
                        throw th;
                    }
                }
                throw th;
            }
        }
        return null;
    }

    public static MainAttributes of(File jar) {
        return of(jar.toURI());
    }

    public static MainAttributes of(URI uri) {
        MainAttributes attributes = instances.get(uri);
        if (attributes == null) {
            attributes = new MainAttributes(new File(uri));
            instances.put(uri, attributes);
        }
        return attributes;
    }
}
