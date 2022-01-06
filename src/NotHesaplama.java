//Kullanıcı tarafından girilen vize ve final notunun ortalamasını hesaplayan java kodunu yazınız.
import java.util.Scanner;

class NotHesaplama {

    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        System.out.println("Vize Notunuzu Giriniz:");
        double vize = klavye.nextDouble();
        System.out.println("Final Notunuzu Giriniz:");
        double fınal = klavye.nextDouble();

        if (fınal < 50)
            System.out.println("Büte Kaldınız.");

        else {
            double not = (vize * 0.4) + (fınal * 0.6);
            System.out.println("Not Ortalamanız:" + not);

            if (not < 50) {
                System.out.println("Kaldınız.");
            } else if (not > 50) {
                System.out.println("Tebrikler Geçtiniz.");
            }
        }
    }
}
