package OOP;

public class Day4 {
    // OOP -> suatu pemprograman berorientasi kepada objek
    // OOP -> PBO (Pemprograman Berbasis Objek)
    // class -> namingnya pascalCase
    public static void main(String[] args) {
        // untuk membuat sebuah objek kita panggil class nya
        // membuat objek dengan keyword new
        OOP.Car sedan = new OOP.Car("biru", "toyota", "corolla all new ae112");
//        sedan.color = "biru";
//        sedan.brand = "toyota";
//        sedan.type = "corolla all new ae112";
//        sedan.fillFuel(10);
        sedan.setFuel(10);
        sedan.setColor("Biru");
//        sedan.startEngine();
        System.out.println(sedan.toString());
//        System.out.println(sedan.toString());

        // access modifier
        // modifier     class     package     subclass     allPackage
        // public         Y          Y            Y             Y
        // private        Y          N            N             N
        // protected      Y          Y            Y             N
        // default        Y          Y            N             N


    }
}
