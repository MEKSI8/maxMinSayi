import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Kaç tane sayı gireceksiniz: ");
        int total = input.nextInt();
        int min=999999;
        int max=-99999;

        for (int i = 0; i <total ; i++) {
            System.out.print((i+1)+". sayı: ");
            int sayi = input.nextInt();
            if (sayi>max){
                max=sayi;
            }
            if (sayi<min){
                min=sayi;
            }
        }

        System.out.print("En büyük sayı: "+max);
        System.out.println();
        System.out.print("En küçük sayı: "+min);

    }
}