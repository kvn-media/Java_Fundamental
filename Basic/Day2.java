package Basic;

public class Day2 {
    public static void main(String[] args) {
        // condition
        String lampuRambu = "hijau";
        if (lampuRambu == "merah") {
            // statement
            System.out.println("Anda harus berhenti");
        } else if (lampuRambu == "kuning") {
            System.out.println("Anda harus bersiap");
        }
        else {
            System.out.println("Anda boleh jalan");
        }
    }
}
