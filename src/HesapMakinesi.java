//Kullanıcı tarafından girilen iki sayıyı dört işleme sokan hesap makinesinin java kodunuz yazınız.
import java.util.Scanner;

class HesapMakinesi {
    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        System.out.println("İşlem Yapmak İstediğiniz Birinci Sayıyı Giriniz:");
        int sayi1 = klavye.nextInt();
        System.out.println("İşlem Yapmak İstediğiniz İkinci Sayıyı Giriniz:");
        int sayi2 = klavye.nextInt();
        System.out.println("Yapmak İstediğiniz İşlemi Seçin-->Toplama(1) Çıkarma(2) Çarpma(3) Bölüm(4):");
        int secim = klavye.nextInt();
        if (secim == 1) {
            System.out.println("Toplama İsleminin Sonucu = " + (sayi1 + sayi2));
        } else if (secim == 2) {
            System.out.println("Çıkarma İsleminin Sonucu = " + (sayi1 - sayi2));
        } else if (secim == 3) {
            System.out.println("Carpma İşleminin Sonucu = " + (sayi1 * sayi2));
        } else if (secim == 4) {
            System.out.println("bölme İsleminin Sonucu = " + (sayi1 / sayi2));
        } else {
            System.out.println("Beklenmeyen Bir Sorun Oluştu Baştan Başlayınız.");
        }
    }
}