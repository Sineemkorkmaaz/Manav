import java.util.Scanner;

public class manav {
    
    public static void main(String[] args) {
        //Değerler
        double armut=2.14 , armutkg, elma=3.67, elmakg, domates=1.11, domateskg, muz=0.95, muzkg , patlıcan=5.00, patlıcankg , sonuc ;
    
         // kullanıcıdan veri alımı
         Scanner inp = new Scanner(System.in);
         System.out.print("Armut Kaç Kilo ? :");
         armutkg = inp.nextDouble();
         System.out.print("Elma Kaç Kilo ? :");
         elmakg = inp.nextDouble();
         System.out.print("Domates Kaç Kilo ? :");
         domateskg = inp.nextDouble();
         System.out.print("Muz Kaç Kilo ? :");
         muzkg = inp.nextDouble();
         System.out.print("Patlıcan Kaç Kilo ? :");
         patlıcankg = inp.nextDouble();

         sonuc = armut*armutkg+elma*elmakg+domates*domateskg+muz*muzkg+patlıcan*patlıcankg ;
         System.out.println("Toplam tutarınız :" + sonuc + "TL");
    }
}
