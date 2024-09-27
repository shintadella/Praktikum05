import java.util.Scanner;

/**
 * Pecahanbilangan
 */
public class PemilihanBilangan22 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan sebuah angka: ");
        int angka = sc.nextInt();

        String 
        hasil = angka %2 == 0 ? "Angka bilangan genap":"Angka bilangan ganjil";
        System.out.println("Angka "+angka+"termasuk"+hasil);

        sc.close();

    }
}