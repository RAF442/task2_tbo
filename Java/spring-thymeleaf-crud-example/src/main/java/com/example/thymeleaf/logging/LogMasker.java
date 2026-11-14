package com.example.thymeleaf.logging;

public final class LogMasker {

    private LogMasker() {
    }

    /** Masks only the log representation; the original value is never modified. */
    public static String mask(Object value) {
        return value == null ? null : "*".repeat(value.toString().length());
    }
}
