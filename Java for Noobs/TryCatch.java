import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TryCatch 
{
	public static void main(String[] args)
	{
		File data = new File("TryCatch.txt");
		try {
			Scanner masukan = new Scanner(data);
			while(masukan.hasNextLine()){
				System.out.print(masukan.nextLine());
			} masukan.close();
		} catch (FileNotFoundException e) {
			System.out.println("File tidak ditemukan");
			e.printStackTrace();
		}
	}
}