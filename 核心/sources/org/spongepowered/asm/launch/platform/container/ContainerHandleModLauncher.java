package org.spongepowered.asm.launch.platform.container;

import java.nio.file.Path;
import java.util.List;
import java.util.Map;

/* loaded from: 核心-mc1.12.2-0.0.2.jar:org/spongepowered/asm/launch/platform/container/ContainerHandleModLauncher.class */
public class ContainerHandleModLauncher extends ContainerHandleVirtual {

    /* loaded from: 核心-mc1.12.2-0.0.2.jar:org/spongepowered/asm/launch/platform/container/ContainerHandleModLauncher$Resource.class */
    public class Resource extends ContainerHandleURI {
        private String name;
        private Path path;

        public Resource(String name, Path path) {
            super(path.toUri());
            this.name = name;
            this.path = path;
        }

        public String getName() {
            return this.name;
        }

        public Path getPath() {
            return this.path;
        }

        @Override // org.spongepowered.asm.launch.platform.container.ContainerHandleURI
        public String toString() {
            return String.format("ContainerHandleModLauncher.Resource(%s:%s)", this.name, this.path);
        }
    }

    public ContainerHandleModLauncher(String name) {
        super(name);
    }

    public void addResource(String name, Path path) {
        add(new Resource(name, path));
    }

    public void addResources(List<Map.Entry<String, Path>> resources) {
        for (Map.Entry<String, Path> resource : resources) {
            addResource(resource.getKey(), resource.getValue());
        }
    }

    @Override // org.spongepowered.asm.launch.platform.container.ContainerHandleVirtual
    public String toString() {
        return String.format("ModLauncher Root Container(%x)", Integer.valueOf(hashCode()));
    }
}
