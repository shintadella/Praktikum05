import java.util.Scanner;

/**
 * Pecahanbilangan
 */
public class PemilihanBilangan22 {

    public static void main(String[] args) {
        Scanner utill = new Scanner(System.in);
        System.out.println("Masukkan sebuah angka: ");
        int angka = utill.nextInt();

        String 
        hasil = angka %2 == 0 ? "Angka bilangan genap":"Angka bilangan ganjil";
        System.out.println("Angka "+angka+"termasuk"+hasil);
        // if (angka%2==0)
        // {
        //     System.out.println("angka"+angka+"termasuk bilangan genap");
        // }
        // else 
        // {
        //     System.out.println("Angka"+angka+"termasuk bilangan ganjil");
        // }

        utill.close();

    }
}