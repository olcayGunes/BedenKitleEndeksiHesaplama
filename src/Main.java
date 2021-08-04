import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double boy, kilo, sonuc;

        System.out.print("Boy (m): ");
        boy = input.nextDouble();

        System.out.print("Kilo (kg): ");
        kilo = input.nextDouble();

        sonuc = kilo / Math.pow(boy,2);

        System.out.println("Vücut Kitle Endeksiniz: " + sonuc);
    }
}
