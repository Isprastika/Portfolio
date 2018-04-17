public class Metode{
	public static void main(String[] args){
		int a = 1;
		int b = 2;
		int jum = add(a, b);
		System.out.print(jum);
		String firstName = "Mimi";
		String secName = "Mutia";
		String hasil = addString(firstName, secName);
		System.out.println(hasil);
	}

	public static int add(int x, int y){
	return x + y;
	}

	public static String addString(String x, String y){
	return x + y;
	}
}
