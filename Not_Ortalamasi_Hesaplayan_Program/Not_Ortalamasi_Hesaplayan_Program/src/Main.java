import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mat,Fizik,Kimya,Turkce,Tarih,Muzik;

        Scanner inp = new Scanner(System.in);

        System.out.print("Matematik notunuzu giriniz:");
        mat = inp.nextInt();

        System.out.print("Fizik notunuzu giriniz:");
        Fizik = inp.nextInt();

        System.out.print("Kimya notunuzu giriniz:");
        Kimya = inp.nextInt();

        System.out.print("Turkce notunuzu giriniz:");
        Turkce = inp.nextInt();

        System.out.print("Tarih notunuzu giriniz:");
        Tarih = inp.nextInt();

        System.out.print("Müzik notunuzu giriniz:");
        Muzik = inp.nextInt();

        int toplam = (mat+Fizik+Kimya+Turkce+Tarih+Muzik);
        double sonuc = toplam / 6;
        System.out.println("Ortalamanız" + sonuc);



       String yazdir = sonuc>60 ? "Sınıf Geçti" : "Sınıfta Kaldı";
        System.out.println(yazdir);


    }

}