import java.util.Scanner;

/**
 * NestedLoop_2341720179
 */
public class NestedLoop_2341720179 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] temps = new double [2][7];

        for (int i = 0; i < temps.length; i++) {
            System.out.println("Kota ke-" + i);
            for (int j = 0; j < temps[0].length; j++) {
                System.out.print("Hari ke-" + (j + 1) + ": ");
                temps[i][j] = sc.nextDouble();
            }
            System.out.println();
        }

        for (int i = 0; i < temps.length; i++) {
            System.out.print("Kota ke-" + (i + 1) + ": ");
            for (double tempHari : temps[i]) {
                System.out.print(tempHari + " ");
            }
            System.out.println();    
        }

        for(int i=0; i<temps.length; i++){
            double total = 0;
            for(double tempHari : temps[i]){
                total += tempHari;
            }
            double rataRata = total / temps[i].length;
            System.out.println("Rata-rata Kota " + (i+1) + ": " + rataRata);
        }
    }
}
