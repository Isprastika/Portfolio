public class Array{
	public static void main(String[] args){
		//cara paling sederhana
		int a = 1;
		int b = 2;
		int c = 3;

		int[] x = new int[3];
		x[0] = a;
		x[1] = b;
		x[2] = c;
		System.out.println(x[0]);
		System.out.println(x[1]);
		System.out.println(x[2]);

		//cara sederhana
		int d = 1;
		int e = 2;
		int f = 3;

		int y[] = {d, e, f};
		System.out.println(y[0]);
		System.out.println(y[1]);
		System.out.println(y[2]); 

		//cara advanced
		int g[] = {1, 2, 3};
		for(int i = 0; i < g.length; i++){
			System.out.println(g[i]);
		}
	}
}