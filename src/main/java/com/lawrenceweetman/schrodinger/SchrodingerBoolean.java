package com.lawrenceweetman.schrodinger;

import java.util.Optional;

public class SchrodingerBoolean {

    private Optional<Boolean> value = Optional.empty();

    public boolean isTrue() {
        return value.orElse(Boolean.TRUE).equals(Boolean.TRUE);
    }

    public boolean isFalse() {
        return value.orElse(Boolean.FALSE).equals(Boolean.FALSE);
    }

    public void set(boolean b) {
        value = Optional.of(b);
    }
}