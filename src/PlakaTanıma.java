//Kullanıcı tarafından girilen plakanın uzunluğunu kontrol edip hangi ile ait olduğunu ekrana yazdıran programın java kodunu yazınız.
import java.util.Scanner;

public class PlakaTanıma {
    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        System.out.println("Plakanızın Tamamını Arada Hiç Boşluk Bırakmadan Giriniz:");
        String plaka = klavye.next();
        int alankodu = Integer.parseInt(plaka.substring(0, 2));
        String[] sehir = {"Adana", "Adıyaman", "Afyonkarahisar", "Ağrı", "Amasya", "Ankara", "Antalya", "Artvin", "Aydın", "Balıkesir", "Bilecik", "Bingöl", "Bitlis", "Bolu", "Burdur", "Bursa", "Çanakkale", "Çankırı", "Çorum", "Denizli", "Diyarbakır", "Edirne", "Elazığ", "Erzincan", "Erzurum", "Eskişehir", "Gaziantep", "Giresun", "Gümüşhane", "Hakkari", "Hatay", "Isparta", "Mersin", "İstanbul", "İzmir", "Kars", "Kastamonu", "Kayseri", "Kırklareli", "Kırşehir", "Kocaeli", "Konya", "Kütahya", "Malatya", "Manisa", "Kahramanmaraş", "Mardin", "Muğla", "Muş", "Nevşehir", "Niğde", "Ordu", "Rize", "Sakarya", "Samsun", "Siirt", "Sinop", "Sivas", "Tekirdağ", "Tokat", "Trabzon", "Tunceli", "Şanlıurfa", "Uşak", "Van", "Yozgat", "Zonguldak", "Aksaray", "Bayburt", "Karaman", "Kırıkkale", "Batman", "Şırnak", "Bartın", "Ardahan", "Iğdır", "Yalova", "Karabük", "Kilis", "Osmaniye", "Düzce"};
        if (plaka.length() == 7) {
            System.out.println(sehir[alankodu - 1] + "---> İline Ait Plaka:)");
        } else if (plaka.length() == 8) {
            System.out.println(sehir[alankodu - 1] + "---> İline Ait Plaka:)");
        } else {
            System.out.println("Yanlış Bir Plaka Tuşladınız Kontrol Edip Tekrar Deneyiniz.");
        }
    }
}