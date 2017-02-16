package com.lawrenceweetman.schrodinger;

public class SchrodingerBoolean {

    private Boolean value;

    public SchrodingerBoolean() {
        value = null;
    }

    public boolean isTrue() {
        if((value == null) || (value == Boolean.TRUE)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isFalse() {
        if((value == null) || (value == Boolean.FALSE)) {
            return true;
        } else {
            return false;
        }
    }

    public void set(boolean b) {
        value = Boolean.valueOf(b);
    }
}