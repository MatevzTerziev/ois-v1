import java.util.Scanner;

public class Gravitacija{
    public static void main(String[] args){
        /*Scanner sc = new Scanner(System.in);
        double v = sc.nextDouble();
		*/
		double C = 6.674 * Math.pow(10,-11);
        double M = 5.972 * Math.pow(10,24);
        double r = 6.371 * Math.pow(10,6);
        double v = 10;

        double a = (C*M)/((r+v)*(r+v));
        System.out.println(a);
		
		System.out.println("Visina: " + v + " Pospešek: " + a);
    }
}