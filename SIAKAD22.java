import java.util.Scanner;
/**
 * SIAKAD22
 */
public class SIAKAD22 {

    public static void main(String[] args) {
        Scanner util = new Scanner(System.in);
        String nama,nim;
        char kelas;
        byte absen;
        double nilaikuis,nilaitugas,nilaiujian,nilaiakhir;
        // Data diri mahasiswa
        System.out.println("_________________________DATA DIRI MAHASISWA_________________");
        System.out.print("Masukkan Nama\t\t: ");
        nama = util.nextLine();
        System.out.print("Masukkan Nim\t\t: ");
        nim = util.nextLine();
        System.out.print("Masukkan kelas\t\t: ");
        kelas = util.nextLine().charAt(0);
        System.out.print("Masukkan nomor absen\t: ");
        absen = util.nextByte();

        // nilai mahasiswa
        System.out.println("________________________NILAI MAHASISWA____________________");
        System.out.print("Masukkan nilai kuis\t: ");
        nilaikuis = util.nextDouble();
        System.out.print("Masukkan nilai tugas\t: ");
        nilaitugas = util.nextDouble();
        System.out.print("Masukkan nilai ujian\t: ");
        nilaiujian = util.nextDouble();

        System.out.println("____________________________________Maka___________________________\n");
        nilaiakhir = (nilaikuis+nilaitugas+nilaiujian)/3;
        System.out.println("Mahasiswa dengan nama "+nama+" NIM = "+nim+ " kelas = " +kelas+ " No.absen ="+absen);
        System.out.println("Nilai akhir\t\t:" +nilaiakhir);

        String nilaihuruf,kualifikasi;
        double nilaisetara;

        if (80 < nilaiakhir && nilaiakhir <= 100) {
            nilaihuruf = "A";
            nilaisetara = 4.0;
            kualifikasi = "Sangat Baik";
        } else if (73 < nilaiakhir && nilaiakhir <= 80) {
            nilaihuruf = "B+";
            nilaisetara = 3.5;
            kualifikasi = "Lebih dari Baik";
        } else if (65 < nilaiakhir && nilaiakhir <= 73) {
            nilaihuruf = "B";
            nilaisetara = 3.0;
            kualifikasi = "Baik";
        }else if (60 < nilaiakhir && nilaiakhir <= 65) {
            nilaihuruf = "C+";
            nilaisetara = 2.5;
            kualifikasi = "Lebih dari Cukup";
        }else if (50 < nilaiakhir && nilaiakhir <= 60) {
            nilaihuruf = "C";
            nilaisetara = 2.0;
            kualifikasi = "Cukup";
        }else if (39 < nilaiakhir && nilaiakhir <= 50) {
            nilaihuruf = "D";
            nilaisetara = 1.0;
            kualifikasi = "Kurang";
        }else {
            nilaihuruf = "E";
            nilaisetara = 0.0;
            kualifikasi = "Gagal";
        }
        System.out.println("Nilai Huruf\t\t: "+nilaihuruf);
        System.out.println("Nilai Setara\t\t: "+nilaisetara);
        System.out.println("kualifikasi\t\t: "+kualifikasi);

    }
}