package com.lawrenceweetman.schrodinger;

public class SchrodingerBoolean {

    private Boolean value;

    public SchrodingerBoolean() {
        value = null;
    }

    public boolean isTrue() {
        return (value == null) || (value == Boolean.TRUE);
    }

    public boolean isFalse() {
        return (value == null) || (value == Boolean.FALSE);
    }

    public void set(boolean b) {
        value = Boolean.valueOf(b);
    }
}