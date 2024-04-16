package tech.xuzheng.function;

@FunctionalInterface
public interface Executable extends Function<Unit, Unit> {
    default void execute() {
        apply(Unit.getInstance());
    }
}
