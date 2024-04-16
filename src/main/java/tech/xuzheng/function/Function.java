package tech.xuzheng.function;

@FunctionalInterface
public interface Function<T, R> {
    R apply(T t);
}
