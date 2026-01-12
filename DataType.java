import java.util.* ;
class DataType{
	static void dataTypes(int a, float b, double c, long l, byte d){
		double p =c/b;
		double q = b / a;
		double r = c /a;
		double m = r + l;
		int s = a/d;

		System.out.println(p + " " + q + " " + r + " " + m +" " + s);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		float b = sc.nextFloat();
		double c = sc.nextDouble();
		long l = sc.nextLong();
		byte d = sc.nextByte();

		dataTypes(a,b,c,l,d);
		sc.close();
	}
}
