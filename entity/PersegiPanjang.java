// parent
public class PersegiPanjang {
    protected Double length;
    protected Double width;

    public PersegiPanjang(Double length, Double width) {
        this.length = length;
        this.width = width;
    }

    protected Double getSurface() {
        return length * width;
    }
}
