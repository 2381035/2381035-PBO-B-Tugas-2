import java.util.Scanner;

public class Tugas2 {
    public static void DaftarMenu(Scanner input) {
        System.out.println("Aplikasi menghitung Luas dan Keliling bangun datar");
        System.out.println("1. Persegi");
        System.out.println("2. Persegi Panjang");
        System.out.println("3. Lingkaran");
        System.out.print("Masukkan Pilihan Anda: ");
    }
    public static void SisiPersegi(Scanner input) {
        System.out.print("Masukkan Sisi Persegi: ");
        double sisiPersegi = input.nextDouble();
        double luasPersegi = MenghitungLuasPersegi(sisiPersegi);
        double kelilingPersegi = MenghitungKelilingPersegi(sisiPersegi);
        System.out.println("Luas Persegi: " + luasPersegi);
        System.out.println("Keliling Persegi: " + kelilingPersegi);
    }

    public static double MenghitungLuasPersegi(double sisiPersegi) {
        return sisiPersegi * sisiPersegi;
    }

    public static double MenghitungKelilingPersegi(double sisiPersegi) {
        return 4 * sisiPersegi;
    }

    public static void PanjangDanLebarPersegiPanjang(Scanner input) {
        System.out.print("Masukkan Panjang Persegi Panjang: ");
        double panjang = input.nextDouble();
        System.out.print("Masukkan Lebar Persegi Panjang: ");
        double lebar = input.nextDouble();
        double luasPersegiPanjang = hitungLuasPersegiPanjang(panjang, lebar);
        double kelilingPersegiPanjang = hitungKelilingPersegiPanjang(panjang, lebar);
        System.out.println("Luas Persegi Panjang: " + luasPersegiPanjang);
        System.out.println("Keliling Persegi Panjang: " + kelilingPersegiPanjang);
    }

    public static double hitungLuasPersegiPanjang(double panjang, double lebar) {
        return panjang * lebar;
    }

    public static double hitungKelilingPersegiPanjang(double panjang, double lebar) {
        return 2 * (panjang + lebar);
    }

    public static void Lingkaran(Scanner input) {
        System.out.print("Masukkan Jari-jari Lingkaran: ");
        double jariJari = input.nextDouble();
        double luasLingkaran = hitungLuasLingkaran(jariJari);
        double kelilingLingkaran = hitungKelilingLingkaran(jariJari);
        System.out.println("Luas Lingkaran: " + luasLingkaran);
        System.out.println("Keliling Lingkaran: " + kelilingLingkaran);
    }

    public static double hitungLuasLingkaran(double jariJari) {
        final double phi = Math.PI;
        return phi * (jariJari * jariJari);
    }

    public static double hitungKelilingLingkaran(double jariJari) {
        final double phi = Math.PI;
        return 2 * phi * jariJari;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DaftarMenu(input);
        int pilihan = input.nextInt();

        switch (pilihan) {
            case 1:
                SisiPersegi(input);
                break;
            case 2:
                PanjangDanLebarPersegiPanjang(input);
                break;
            case 3:
                Lingkaran(input);
                break;
            default:
                System.out.print("Masukkan Angka yang benar!");
                break;
        }

        input.close();
    }
}