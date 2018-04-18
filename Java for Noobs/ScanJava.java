import java.util.Scanner;

public class ScanJava{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Masukkan angka 1: ");
		int angka1 = input.nextInt();
		System.out.println("Masukkan angka 2: ");
		int angka2 = input.nextInt();
		System.out.print("Hasil penjumlahan ");
		System.out.println(angka1 + angka2);
	}
}