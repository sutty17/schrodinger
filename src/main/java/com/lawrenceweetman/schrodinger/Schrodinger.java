package com.lawrenceweetman.schrodinger;

import java.util.Comparator;
import java.util.Optional;
import java.util.function.Function;

public class Schrodinger<T> implements Comparable<Schrodinger<T>> {
    private final Function<Comparator<T>, Comparator<Schrodinger<T>>> schrodingerComparatorFactory = delegateComparator -> (o1, o2) -> {
        if (o1.is(o2)) {
            return 0;
        } else {
            return delegateComparator.compare(o1.value.orElse(null), o2.value.orElse(null));
        }
    };

    Optional<T> value = Optional.empty();

    public void set(T t) {
        value = Optional.ofNullable(t);
    }

    public boolean is(Object that) {
        if(that instanceof Schrodinger) {
            return is((Schrodinger) that);
        } else {
            return !value.isPresent() || value.get().equals(that);
        }
    }

    public boolean is(Schrodinger<Object> that) {
        return !that.value.isPresent() || is(that.value.get());
    }

    public boolean isTrue() {
        return is(Boolean.TRUE);
    }

    public boolean isFalse() {
        return is(Boolean.FALSE);
    }

    public boolean isFortyTwo() {
        return is(42);
    }

    @Override
    public boolean equals(Object o) {
        if(o instanceof Schrodinger) {
            return is((Schrodinger) o);
        }
        return is(o);
    }

    @Override
    public int hashCode() {
        return value != null ? value.hashCode() : 0;
    }

    @Override
    public int compareTo(Schrodinger<T> o) {
        if(is(o)) {
            return 0;
        } else if (o.value.orElse(null) instanceof Comparable) {
            return ((Comparable<T>) value.get()).compareTo(o.value.get());
        } else {
            throw new UnsupportedOperationException("Cannot compare incomparable values. That would be silly.");
        }
    }
}
