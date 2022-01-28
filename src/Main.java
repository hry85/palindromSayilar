import java.util.Scanner;
public class Main {

    static boolean isPalindrom(int number){
        int temp = number, reverseNumber = 0, lastNumber;
        while (temp != 0){
            System.out.println("==============");
            System.out.println("Sayi => " +temp);

            lastNumber = temp % 10;
            System.out.println("Son basamak => " +lastNumber);

            reverseNumber = (reverseNumber * 10) + lastNumber;
            System.out.println("Yeni sayi => " +reverseNumber);

            System.out.println("Yeni temp => " +temp);
            temp /= 10;
        }
        if (number == reverseNumber){
            return true;
        }else {
            return false;
        }

    }

    public static void main(String[] args) {
        System.out.println(isPalindrom(202));

    }
}
