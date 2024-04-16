package tech.xuzheng.function;

public final class Unit {
    private static final Unit unit = new Unit();

    private Unit() {

    }

    public static Unit getInstance() {
        return unit;
    }

    @Override
    public int hashCode() {
        return 1;
    }

    @Override
    public boolean equals(Object obj) {
        return (obj instanceof Unit);
    }

    @Override
    public String toString() {
        return "unit";
    }
}
