//Kullanıcı tarafından girilen sayının faktöriyelini hesaplayan programın java kodunu yazınız.

import java.util.Scanner;

class Faktöriyel {
    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        int faktoriyel = 1;
        System.out.println("Hangi Sayıyının Faktöriyelini Almak İstiyorsunuz:");
        int sayi = klavye.nextInt();
        for (int i = 1; i <= sayi; i++) {
            faktoriyel = faktoriyel * i;
        }
        System.out.println("İşlemin Sonucu--->" + faktoriyel);
    }
}