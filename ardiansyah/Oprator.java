public class Oprator {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Kamus */
		boolean Bool1, Bool2, TF;
		int i, j, hsl;
		float x, y, res;
		/* algoritma */
		System.out.println("Silahkan baca teksnya dan tambahkan perintah program di bawah ini untuk menampilkan output program");
		Bool1 = true;
		Bool2 = false;
		TF = Bool1 && Bool2; /* Boolean AND */
		System.out.println("Bool1 && Bool2 = " + TF);
		TF = Bool1 || Bool2; /* Boolean OR */
		System.out.println("Bool1 || Bool2 = " + TF);
		TF = !Bool1; /* NOT */
		System.out.println("!Bool1 = " + TF);
		TF = Bool1 ^ Bool2; /* XOR */
		System.out.println("Bool1 ^ Bool2 = " + TF);
		/* operasi numerik */
		i = 5;
		j = 2;
		hsl = i + j;
		System.out.println("i + j = " + hsl);
		hsl = i - j;
		System.out.println("i - j = " + hsl);
		hsl = i / j;
		System.out.println("i / j = " + hsl);
		hsl = i * j;
		System.out.println("i * j = " + hsl);
		hsl = i / j; /* pembagian bulat */
		System.out.println("i / j (integer) = " + hsl);
		hsl = i % j; /* sisa modulo */
		System.out.println("i % j = " + hsl);
		/* operasi numerik */
		x = 5;
		y = 5;
		res = x + y;
		System.out.println("x + y = " + res);
		res = x - y;
		System.out.println("x - y = " + res);
		res = x / y;
		System.out.println("x / y = " + res);
		res = x * y;
		System.out.println("x * y = " + res);
		/* operasi relasional numerik */
		TF = (i == j);
		System.out.println("i == j = " + TF);
		TF = (i != j);
		System.out.println("i != j = " + TF);
		TF = (i < j);
		System.out.println("i < j = " + TF);
		TF = (i > j);
		System.out.println("i > j = " + TF);
		TF = (i <= j);
		System.out.println("i <= j = " + TF);
		TF = (i >= j);
		System.out.println("i >= j = " + TF);
		/* operasi relasional numerik */
		TF = (x != y);
		System.out.println("x != y = " + TF);
		TF = (x < y);
		System.out.println("x < y = " + TF);
		TF = (x > y);
		System.out.println("x > y = " + TF);
		TF = (x <= y);
		System.out.println("x <= y = " + TF);
		TF = (x >= y);
		System.out.println("x >= y = " + TF);
	}
}