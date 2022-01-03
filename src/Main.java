import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner=new Scanner(System.in);
        int a;
        int b;
        System.out.println("Birinci sayı: ");
        a=scanner.nextInt();
        System.out.println("İkinci sayı: ");
        b=scanner.nextInt();
        double h=Math.sqrt(a*a+b*b);
        System.out.println("Hipotenüs: "+ h);

    }
}
