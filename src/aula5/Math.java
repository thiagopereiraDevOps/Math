package aula5;

public class Math {
    public static void main(String[] args) {
        double A, B, C;
        double x = 9.0;
        double y = 4.0;
        double z = -8.0;

        A = Math.pow(x,y);
        B = Math.abs(x);
        C = Math.abs(z);

        System.out.println(x + " elevado a " + y + " = " + A);
        System.out.println("O valor absoluto de " + x + " = " + B);
        System.out.println("O valor absoluto de " + z + " = " + C);
        System.out.println("#############################################");
        System.out.println(" ");

        double D = Math.ceil(4.9);
        double E = Math.floor(4.2);
        double F = Math.round(5.7);

        System.out.println("arrendonda pra cima: " + D);
        System.out.println("arrendonda pra baixo: " + E);
        System.out.println("arrendonda aritmeticamente: " + F);
    }
}