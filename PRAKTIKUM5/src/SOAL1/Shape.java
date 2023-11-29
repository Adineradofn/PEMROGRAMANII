package SOAL1;
abstract class Shape {
    protected String shapeName;
    public Shape(String name) {
        shapeName = name;
    }
    protected abstract double area();
    public String toString() {
        return shapeName;
    }
}