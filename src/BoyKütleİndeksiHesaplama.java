//Kullanıcı tarafından girilen bilgilerle BKİ(Boy Kütle İndeksi) hesaplayan programın java kodunu yazınız.
import java.util.Scanner;

class BoyKütleİndeksiHesaplama {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Boyunuzu Giriniz:");
        float boy = scan.nextFloat();
        System.out.print("Kilonuzu Giriniz:");
        float kilo = scan.nextFloat();

        float bki = kilo / (boy * boy);
        System.out.println("Beden Kitle İndeksiniz:" + bki);
    }

}