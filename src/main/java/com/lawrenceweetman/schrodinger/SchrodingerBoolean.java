package com.lawrenceweetman.schrodinger;

import java.util.Optional;

public class SchrodingerBoolean {

    public static final SchrodingerBoolean CLOSED = new SchrodingerBoolean();
    public static final SchrodingerBoolean TRUE = new SchrodingerBoolean();
    static {
        TRUE.set(true);
    }
    public static final SchrodingerBoolean FALSE = new SchrodingerBoolean();
    static {
        FALSE.set(false);
    }

    private Optional<Boolean> value = Optional.empty();

    public boolean isTrue() {
        return is(Boolean.TRUE);
    }

    public boolean isFalse() {
        return is(Boolean.FALSE);
    }

    public boolean is(boolean b) {
        return value.orElse(b).equals(b);
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