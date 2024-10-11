import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("SAYININ TEK Mİ ÇİFT Mİ OLDUĞUNU BULMA UYGULAMASI");
        System.out.println("---------------------------------------------");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Dizinin eleman sayısını giriniz: ");
        int diziLength = scanner.nextInt();
        scanner.nextLine();

        int[] sayilar = new int[diziLength];
        for (int i = 0; i < diziLength; i++) {

            System.out.print("Dizinin "+i+". index değerini giriniz: ");
            sayilar[i] = scanner.nextInt();
            scanner.nextLine();
        }
        for(int deger : sayilar){
            tekMiCiftMi(deger);
        }

    }
    public static void tekMiCiftMi (int sayi){
        if(sayi % 2 == 0) {
            System.out.println("Sayı: "+ sayi + " çifttir.");
        }else {
            System.out.println("Sayı: "+ sayi + " tektir.");
        }
    }
}