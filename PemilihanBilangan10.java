import java.util.Scanner;
/**
 * PemilihanBilangan10
 */
public class PemilihanBilangan10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan sebuah angka: ");
        int angka = sc.nextInt();

        String hasil;
        hasil = (angka % 2 == 0) ? "Bilangan genap" : "Bilangan ganjil";
        System.out.println(angka + " adalah " + hasil);
    }
}