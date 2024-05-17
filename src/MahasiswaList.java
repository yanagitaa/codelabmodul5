import java.util.ArrayList;
import java.util.Scanner;

public class MahasiswaList {
    public static void main(String[] args) {
        ArrayList<String> mahasiswa = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String input;

        while (true) {
            System.out.print("Masukkan nama mahasiswa (atau 'selesai' untuk berhenti): ");
            input = scanner.nextLine();

            if (input.equalsIgnoreCase("selesai")) {
                break;
            }

            try {
                if (input.trim().isEmpty()) {
                    throw new IllegalArgumentException("Nama tidak boleh kosong");
                } else {
                    mahasiswa.add(input);
                }
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println("Daftar nama mahasiswa:");
        for (int i = 0; i < mahasiswa.size(); i++) {
            System.out.println("Nama ke-" + (i + 1) + ": " + mahasiswa.get(i));
        }

        scanner.close();
    }
}