//Girilen öğrenci numarasının uzunluğunu kontrol edip hangi sene üniversiteye giriş yaptığını ve kaçıncı olarak yerleştiğini ekrana yazdıran programın java kodunu yazınız.
import java.util.Scanner;

public class ÖğrenciNoTanıma {
    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        System.out.println("Öğrenci Numaranızı Giriniz:");
        String ogrencino = klavye.next();
        if (ogrencino.length() == 9) {
            int girissenesi = Integer.parseInt(ogrencino.substring(0, 2));
            System.out.println("Giriş Senesi ---> 20" + girissenesi);
            int siralama = Integer.parseInt(ogrencino.substring(6, 9));
            System.out.println("Bölüm Sıralaması ---> " + siralama);
        }
        else{
            System.out.println("Eksik Yada Yanlış Bir Numara Girdiniz.");
        }
    }
}
