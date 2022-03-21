package Basic;

import java.util.Scanner;

public class Day3 {
    public static void main(String[] args) {
        // scanner
        // instance -> Scanner library membantu untuk melakukan input melalui terminal
        // new adalah keyword, new adalah untuk membuat sebuah kerangka menjadi sebuah wujud asli
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Masukan nama anda : ");
//        String name = sc.nextLine();
//        System.out.println("Masukan umur anda : ");
//        int age = sc.nextInt();
//        System.out.printf("Nama anda adalah %s & umur anda adalah %d", name, age);
        // loop
        // 1. inisialisasi, 2. kondisi, 3. increment
//        System.out.println("START");
//        for (int i = 1; i <= 5 ; i++) {
//            if (i == 4) {
////                continue; // melanjutkan sampai angka 5 ketika sudah di 4 tapi ke increment
//                break;
//            }
//            System.out.println(i);
//        }
//        System.out.println("FINISH");
//        int i = 10;
        // 1234
        // 1234
        // 1234
        // loop 1 untuk mendapatkan baris
//        for (int i = 0; i < 3; i++) {
//            // statement
//            // loop 2 untuk mendapatkan kolom
//            for (int j = 1; j <= 5; j++) {
//                System.out.print(j);
//            }
//            System.out.println();
//        }
        // while
//        int angka = 0;
//        while (angka <= 5) {
//            System.out.println(angka);
//            angka++;
//        }
//        while (true) {
//            System.out.println("Input angka : ");
//            int number = sc.nextInt();
//            if (number == 1) System.out.println("Pilihan pertaman");
//            if (number == 2) System.out.println("Pilihan kedua");
//            if (number == 3) break;
//        }

        // do while
//        System.out.println("Input angka : ");
//        int number = sc.nextInt(); // 0
//        do {
//            System.out.println("number " + number); // 0
//            number++; // 1
//        }while (number < 5);
        // array
        // kumpulan data, array di java itu fix length
//        String[] spearhead = {"Theo", "Anju", "Kurena", "Shin"};
//        // re-assign
//        spearhead[0] = "Shin";
//        // foreach
//        for (String friend : spearhead) {
//            System.out.println(spearhead);
//        }
        // array 2 dimensi
//        int[][] numbers = {
//                {1,2,3},
//                {4,5,6},
//                {7,8,9}
//        };
//        for (int i = 0; i < numbers.length; i++) {
//            for (int j = 0; j < numbers[i].length; j++) {
//                System.out.print(numbers[i][j]);
//            }
//            System.out.println();
//        }
        // static method dan non static method
        // access modifier -> public, private, protected, default
        // static method -> apabila kita ingin menggunakan sebuah method yang static itu
        // non-static -> kita perlu instance terlebih dahulu
        // kita tidak perlu melakukan instance dengan keyword new
        // return type -> balikan sebuah nilai
        // nama method
        Day3 day3 = new Day3();
        day3.greeting();
    }

    // method
    public void greeting() {
        System.out.println("hello");
    }
}
