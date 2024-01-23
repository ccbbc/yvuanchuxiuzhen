package org.spongepowered.asm.service;

/* loaded from: 核心-mc1.12.2-0.0.2.jar:org/spongepowered/asm/service/ServiceInitialisationException.class */
public class ServiceInitialisationException extends RuntimeException {
    private static final long serialVersionUID = 1;

    public ServiceInitialisationException() {
    }

    public ServiceInitialisationException(String message) {
        super(message);
    }

    public ServiceInitialisationException(Throwable cause) {
        super(cause);
    }

    public ServiceInitialisationException(String message, Throwable cause) {
        super(message, cause);
    }
}
