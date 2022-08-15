// child
public class Balok extends PersegiPanjang {
    private Double height;

    public Balok(Double height, Double length, Double width) {
        // dia akan memanggil construtor parent class dengan keyword super
        super(length, width);
        this.height = height;
    }

    @Override
    public Double getSurface() {
        return 2*(this.length*this.width)+
                2*(this.length*this.height)+
                2*(this.width*this.height);
//        return super.getSurface();
    }

    public Double getHeight() {
        return height;
    }

    public Double getVolume() {
        return this.length*this.width*this.height;
    }
}
