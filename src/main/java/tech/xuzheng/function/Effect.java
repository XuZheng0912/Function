package tech.xuzheng.function;

@FunctionalInterface
public interface Effect<T> {
    void effect(T t);
}
