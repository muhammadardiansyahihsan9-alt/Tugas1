public class Oper3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Algoritma */
		boolean t = true;
		boolean f = false;
		if (t && t) { System.out.println(t && t); }
		/* true = true and true */
		if (t & t) { System.out.println(t & f); }
		/* true & true */
		if (t) { System.out.println(t); } /* true */
		if (t || t) { System.out.println(t); }
		/* true = true or true */
		if (t | f) { System.out.println(t | f); }
		/* true|false */
	}
}