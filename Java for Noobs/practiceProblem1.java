/*Algor: 
1a) tentukan panjang side
buat rumus side
masukkan panjang side ke dlm rumus
cetak rumus

1b) tentukan lebar rectangle
tentukan panjang rectangle buat rumus luas rectangle
masukkan lebar rectangle dan panjang rectangle ke dalam rumus
cetak rumus

1c) tentukan lebar segitiga
tentukan tinggi Segitiga
tentukan alas segitiga
buat rumus luas segitiga
masukan tinggi dan alas segitiga ke dalam rumus
cetak rumus

*/
public class practiceProblem1{
	public static void main(String[] args)
	{
		//problem 1a
		double side = 3;
		double formula= (side*side);//cara simple
		double formula2 = Math.pow(side, 2);//cara yg bener
		System.out.print("Luas persegi adalah: ");
		System.out.print(formula + ", ");
		System.out.println(formula2);
		//problem 1b
		int lebarRec = 4;
		int panjangRec = 3;
		int luasRectangle = (lebarRec * panjangRec);
		System.out.print("Luas Segitiga adalah: ");
		System.out.println(luasRectangle);
		//problem 1c
		int lebarTri = 8;
		int alasTri = 2;
		int luasTri = (lebarTri * alasTri) / 2;
		System.out.println(luasTri);
		//problem 2a
		int Fahr1 = 60;
		double Cel = (Fahr1 - 32) * 5/9;
		System.out.println(Cel);
		//problem 2b
		double Fahr2 = Cel * 9/5 + 32;
		System.out.println(Fahr2); 
		//problem 3a
		double inch = 20;
		double cm = inch * 2.54;
		System.out.print("hasil konversi c inci ke cm adalah ");
		System.out.println(cm);
		//problem 3b
		double inch2 = cm * 0.39;
		System.out.print("hasil konversi cm ke inci adalah ");
		System.out.println(inch2);
	}
}