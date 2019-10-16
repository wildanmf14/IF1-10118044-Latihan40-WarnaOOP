package latihan.warna;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Warna warna = new Warna();
		Scanner reader = new Scanner(System.in);
		int pilih = 0;
		warna.showPilihan();
		System.out.print("PILIH WARNAFAVORITMU : ");
		String favorit = reader.next().toUpperCase();
		System.out.print("NAMA KAMU : ");
		String nama = reader.next();
		System.out.print("\n===HASIL TEST KEPRIBADIAN " + nama + "===" + "\nWarna Favoritmu Adalah ");
		warna.pilihPilihan(pilih, favorit);
		warna.printFavorit(pilih, favorit);
		reader.close();
				

	}

}
