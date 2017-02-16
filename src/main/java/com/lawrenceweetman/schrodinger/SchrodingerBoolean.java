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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SchrodingerBoolean that = (SchrodingerBoolean) o;

        return value != null ? value.equals(that.value) : that.value == null;
    }

    @Override
    public int hashCode() {
        return value != null ? value.hashCode() : 0;
    }
}