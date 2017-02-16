package com.lawrenceweetman.schrodinger;

public class SchrodingerBoolean {

    private Boolean value;

    public SchrodingerBoolean() {
        value = null;
    }

    public boolean isTrue() {
        if((value == null) || (value == true)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isFalse() {
        if((value == null) || (value == false)) {
            return true;
        } else {
            return false;
        }
    }

    public void set(boolean b) {
        value = b;
    }
}