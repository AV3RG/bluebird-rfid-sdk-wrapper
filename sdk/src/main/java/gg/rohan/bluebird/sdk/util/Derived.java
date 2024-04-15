package gg.rohan.bluebird.sdk.util;

import org.jetbrains.annotations.NotNull;

public interface Derived<T> {
    @NotNull
    T value();
}
