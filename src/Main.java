
// Ali Eren KÖSE 28/02/2024 02:51

import java.util.Scanner;
public class Main {
    // Recursive metot ile üs hesapla
    public static int exponential(int base, int exponent){
        if(exponent==0){
            return 1;
        } else{
            int result = base* exponential(base,exponent-1);
            return result;
        }
    }

    public static void main(String[] args) {
        // üs ve taban bilgilerini iste sisteme kaydet
        Scanner input = new Scanner(System.in);
        System.out.print("Taban sayısını giriniz : ");
        int base = input.nextInt();
        System.out.print("Tavan sayısını giriniz : ");
        int exponent = input.nextInt();
        // hesapla ve sonucu yazdır
        System.out.print("Sonuç : "+ exponential(base,exponent));
    }
}