//Kullanıcı tarafından girilen iki sayının arasındaki sayıların toplamını ekrana yazdıran java kodunu yazınız.
import java.util.Scanner;

class GirilenİkiSayıArasındakilerinToplamı {
    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        System.out.println("Başlangıç Sayısı:");
        int sayi1 = klavye.nextInt();
        System.out.println("Bitiş Sayısı:");
        int sayi2 = klavye.nextInt();
        int toplam = 0;
        for (int i = sayi1; i <= sayi2; ++i) {
            toplam = toplam + i;
        }
        System.out.println("Girilen İlk Sayı-->" + sayi1);
        System.out.println("Girilen Son Sayı-->" + sayi2);
        System.out.println("Arasındaki Sayıların Toplamı-->" + toplam);
    }
}