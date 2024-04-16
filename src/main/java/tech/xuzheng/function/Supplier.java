package tech.xuzheng.function;

@FunctionalInterface
public interface Supplier<T> extends Function<Unit, T> {
    default T get() {
        return apply(Unit.getInstance());
    }
}
