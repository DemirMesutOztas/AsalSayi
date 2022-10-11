import java.util.*;

public class AsalSayi {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int sayi=3;
        boolean durum;

        System.out.println("1 ile 100 arasındaki  asal sayılar:");

        while(sayi <101)
        {

            durum = false;
            for(int i = 2; i < sayi; i++)
            {
                if(sayi % i == 0) {
                    durum =true;

                }
            }
            if(durum == false) {
                if(sayi==3)
                    System.out.print("2 ");
                System.out.print(sayi+" ");
            }
            sayi++;
        }

    }
}