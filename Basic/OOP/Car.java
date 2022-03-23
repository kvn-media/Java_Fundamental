package Basic.OOP;

public class Car {
    // attribute
    private String color;
    private String brand;
    private String type;
    private Integer fuel;

    // constructor -> method khusus yang di eksekusi pada saat pembuatan objek ( instance )
    // biasanya method ini di gunakan untuk inisialisasi / mempersiapakan data objek

    public Car(String color, String brand, String type) {
        this.color = color;
        this.brand = brand;
        this.type = type;
        this.fuel = 0;
    }

    public void fillFuel(int fuel) {
        this.fuel = this.fuel + fuel;
    }

    // method milik car
    public void startEngine() {
        if (this.fuel > 0) {
            System.out.println("Vroom....Vroom");
        } else {
            System.out.println("Bensin Kosong");
        }

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getFuel() {
        return fuel;
    }

    public void setFuel(Integer fuel) {
        this.fuel = fuel;
    }

    // method non static

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", brand='" + brand + '\'' +
                ", type='" + type + '\'' +
                ", fuel=" + fuel +
                '}';
    }
}
