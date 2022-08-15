// polymorfisme -> poly adalah banyak, morfisme adalah bentuk
// extends dari class abstract maupun class biasa
// extends hanya bisa 1 tidak bisa lebih
// dia hanya bisa punya 1 parent
public class Circle extends Shape {
    public Integer r;
    private final Double pi = 3.14;

    public Circle(Integer r) {
        this.r = r;
    }

    @Override
    public Double getRound() {
        return null;
    }

    @Override
    public Double getSurface() {
        return null;
    }
}
