import java.util.Scanner;
/**
 * ArrayRataNilai09
 */
public class ArrayRataNilai09 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double total1 = 0, total2 = 0;
        double ratalulus, rataTdklulus;
        int counter1 = 0, counter2;
        int Jml;

        System.out.print("Masukkan jumlah mahasiswa : ");
        Jml = sc.nextInt();
        int[] nilaiMhs= new int[Jml];

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-"+(i+1)+" : ");
            nilaiMhs[i] = sc.nextInt();
        }
        for (int i = 0; i < nilaiMhs.length; i++) {
            if (nilaiMhs[i] > 70) {
                total1 += nilaiMhs[i];
                counter1++;
                
            } else {
                total2 += nilaiMhs[i];
            }
        }

        counter2 = nilaiMhs.length - counter1;
        ratalulus = total1 / counter1;
        rataTdklulus = total2 / counter2;

        System.out.println("Jumlah mahasiswa yang lulus = " + counter1);
        System.out.println("Jumlah mahasiswa yang tidak lulus = " + counter2);
        System.out.println("Rata-rata nilai lulus = " + ratalulus);
        System.out.println("Rata-rata nilai tidak lulus = " + rataTdklulus);
        
    }
}