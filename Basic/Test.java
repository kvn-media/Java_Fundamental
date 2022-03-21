package Basic;

public class Test {
        public static void main(String args[]) {
            boolean isDead = false;
            boolean isSufficient = false;
//            if (isDead) {
//                System.out.println("Server sedang down");
//            } else {
//                if (isSufficient) {
//                    System.out.println("Anda berhasil mengambil uang");
//                } else {
//                    System.out.println("Uang tidak mencukupi");
//                }
//            }

//            // guard clause
//            if (isDead) {
//                System.out.println("Server sedang down");
//                return;
//            }
//            if (isSufficient) {
//                System.out.println("Uang tidak mencukupi");
//                return;
//            }
//            System.out.println("Anda berhasil mengambil uang");

            int tanggal = 26;
            int bulan = 8;
            int tahun = 2002;
            switch (bulan) {
                case 1:
                    System.out.println(tanggal + "" + "Januari" + "" + tahun);
                    break;
                case 8:
                    System.out.println(tanggal + "" + "Agustus" + "" + tahun);
                    break;
                default:
                    System.out.println("Bulan tidak tersedia");
            }

            // dari jam 8 s/d 11 -> saat belajar atau 13 s/d 17 -> saat belajar
            // selain itu jam istirahat
//            int jam = 17;
//            if ((jam >= 8 && jam <= 11) && (jam >= 13 && jam <= 17)) {
//                System.out.println("Waktu belajar");
//            } else {
//                if (jam == 17) {
//                    System.out.println("Jam Pulang");
//                }
//                System.out.println("Jam istirahat");
//            }
        }

//            int jam = 12;
//            if ((jam >= 8 && jam <= 11) || (jam >= 13 && jam <= 17)) {
//                System.out.println("Waktu belajar");
//            } else {
//                System.out.println("Jam istirahat");
//            }
}


//    public static void main(String[] args) {
//        // operator
//        //assignment
////        int angka = 4;
////        System.out.println(angka %= 3 += 2);
//        // angka = angka + 2 -> +=
//        // angka = angka * 2 -> *=
//        // bitwise
//        // |
//        int number1 = 12, number2 = 25, result;
//        // 01100 -> 2^0 2^1 2^3 2^2 2^3 -> 0 2 + 4 + 8 + 16 -> 12
//        // 11001 -> 0
//        // 01000 -> &
//        result = number1 | number2;
//        System.out.println(result);
//        // &
//    }
//    public static void main(String[] args) {
////        String name1 = "reza";
////        String name2 = "syahid";
////        int angka = 10;
////        int angka2 = 10;
//        // operator relational
////        Integer angka = 10;
////        Integer angka2 = 12;
////        System.out.println(angka2 < angka);
//        // logika operator
//        // && || !
//        // &&
//        // T && T = T
//        // T && F = F
//        // F && T = F
//        // F && F = F
////        System.out.println(10 >= 10 && (11 > 10));
//        // T && F = F
//
//        // ||
//        // T || T = T
//        // T || F = T
//        // F || T = T
//        // F || F = F
//        System.out.println(10 >= 10 || !(11 <= 10) && false || (100 > 90));
//        // T || F && T || T
//        // T
//
//        // T || F && false || T
//        // F || T
//        // T
////        System.out.println(10 < 8);
//    }
//    public static void main(String[] args) {
//        // Operator
//        // Arithmatic
//        // number++ -> past increment
//        // ++number -> pre increment
//        int number = 2;
////        System.out.println(++number); // 0
//        System.out.println(number--);
////        System.out.println(number++); // 1
////        number++; // 2 + 1
////        System.out.println(number); // 3
//    }

