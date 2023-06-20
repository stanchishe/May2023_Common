package OOP_part2.Abstraction;

public abstract class TwoDShape {
    private int verticesCount;

    public TwoDShape(int verticesCount) {
        this.verticesCount = verticesCount;
    }

    public int getVerticesCount() {
        return verticesCount;
    }

    public int getNumberOfDimensions() {
        return 2;
    }

    public abstract double calculateArea();
}
