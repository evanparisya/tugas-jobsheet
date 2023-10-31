import java.util.Scanner;

/**
 * BioskopWithScanner09
 */
public class BioskopWithScanner09 {

    public static void main(String[] args) {
        
        int baris, kolom;
        String nama;
        boolean exit = true;
        Scanner input = new Scanner(System.in);
        String[][] penonton = new String[][] {
            {"***", "***"},
            {"***", "***"},
            {"***", "***"},
            {"***", "***"}
        };

    while (exit) {
        System.out.println("Menu: ");
        System.out.println("1. Input data penonton");   
        System.out.println("2. Tampilkan daftar penonton");
        System.out.println("3. Exit");
        System.out.print("Pilih menu (1/2/3): ");
        int choice = input.nextInt();
        input.nextLine();

        switch (choice) {
            case 1:
            System.out.print("Masukkan nama: ");
            nama = input.nextLine();
            System.out.print("Masukkan baris: ");
            baris = input.nextInt();
            System.out.print("Masukkan kolom: ");
            kolom = input.nextInt();
            input.nextLine();

            if (baris > 0 && baris <= penonton.length && kolom > 0 && kolom <= penonton[0].length) {
                if (penonton[baris - 1][kolom - 1] != "***") {
                    System.out.println("Kursi sudah terisi.Silahkan Masukkan Baris dan Kolom lainnya.");
                } else {
                    penonton[baris-1][kolom-1] = nama;
                    System.out.println("Kursi ada.");
                }
            } else {
                System.out.println("Kursi tidak ada.");
                
            }
            break;

            case 2:
            for (int i = 0; i < penonton.length; i++) {
                System.out.println("Penonton pada baris ke-" + (i+1) + ": " + String.join(" ", penonton[i]));
            }
            break;

            case 3:
            exit = false;
            break;

            default:
            System.out.println("Input salah");
            continue;
        }

        
        }
    }
    }
