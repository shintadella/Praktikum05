import java.util.Scanner;

public class Kafe22 {
    public static void main(String[] args) {
        Scanner util = new Scanner(System.in);
        String menu;
        char ukuranCup;
        int jumlah;
        boolean keanggotaan;

        System.out.print("Masukkan menu: ");
        menu = util.nextLine();
        System.out.print("Masukkan ukuran cup: ");
        ukuranCup = util.next().charAt(0);
        System.out.print("Masukkan jumlah: ");
        jumlah = util.nextInt();
        System.out.print("Masukkan keanggotaan (true/false): ");
        keanggotaan = util.nextBoolean();

        double hargaMenu = 0;

        switch (menu.toLowerCase()) {
            case "kopi":
                hargaMenu = 12000;
                break;
            case "teh":
                hargaMenu = 7000;
                break;
            case "coklat":
                hargaMenu = 20000;
                break;
        }

        double totalHarga = hargaMenu * jumlah;

        switch (ukuranCup) {
            case 'S':
                break;
            case 'M':
                totalHarga += 0.25 * totalHarga;
                break;
            case 'L':
                totalHarga += 0.4 + totalHarga;
                break;
        
            default:
            System.out.println("Pilihan size hanya S,M,dan L!!");
                break;
        }

        double diskon = keanggotaan ? 0.1 : 0;
        double nominalBayar = totalHarga - (diskon * totalHarga);

        System.out.println("Item pembelian: " + jumlah + " " + menu + " dengan ukuran cup " + ukuranCup);
        System.out.println("Nominal bayar: " + nominalBayar);
    }
} 
