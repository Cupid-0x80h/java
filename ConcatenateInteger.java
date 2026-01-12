import java.util.Scanner;
public class ConcatenateInteger {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
    
        String c = Integer.toString(a) + Integer.toString(b);
        System.out.println(c);
        sc.close();
    }

}
