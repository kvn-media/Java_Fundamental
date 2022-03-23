package Basic.entity;

public class Rectangle extends Shape{

    protected Double length;
    protected Double width;

    public Rectangle(Double length, Double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public Double getRound() {
        return this.length*this.width;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }

    @Override
    public Double getSurface() {
        return 2*(this.length*this.width);


    }
}
