import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int armut,elma,domates,muz,patlican;

        System.out.print("Kaç kilo armut aldınız: ");
        armut = scanner.nextInt();

        System.out.print("Kaç kilo elma aldınız: ");
        elma = scanner.nextInt();

        System.out.print("Kaç kilo domates aldınız: ");
        domates = scanner.nextInt();

        System.out.print("Kaç kilo muz aldınız: ");
        muz = scanner.nextInt();

        System.out.print("Kaç kilo patlıcan aldınız: ");
        patlican = scanner.nextInt();

        double toplam = armut*2.14+elma*3.67+domates*1.11+muz*0.95+patlican*5;
        System.out.print("Toplam tutar: " + toplam);


    }
}
