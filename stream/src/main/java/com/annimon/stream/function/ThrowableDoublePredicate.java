package com.annimon.stream.function;

/**
 * Represents a {@code double}-valued predicate (function with boolean type result).
 *
 * @param <E> the type of the exception
 * @since 1.1.7
 * @see DoublePredicate
 */
@FunctionalInterface
public interface ThrowableDoublePredicate<E extends Throwable> {

    /**
     * Tests the value for satisfying predicate.
     *
     * @param value  the value to be tests
     * @return {@code true} if the value matches the predicate, otherwise {@code false}
     * @throws E an exception
     */
    boolean test(double value) throws E;
}