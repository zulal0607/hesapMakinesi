
import java.util.Scanner;

public class hesapMakinesi {
    public static void main(String[] args) {
        int n1, n2, select;
        Scanner inp = new Scanner(System.in);

        System.out.println("1. sayıyı giriniz :");
        n1 = inp.nextInt();
        System.out.println("2. sayıyı giriniz :");
        n2 = inp.nextInt();

        System.out.println("1-toplama\n2-çıkarma\n3-çarpma\n4-bölme");
        System.out.println("seçim :");
        select = inp.nextInt();

        if (select == 1) {
            System.out.println("toplama işlemi sonucu : " + (n1 + n2));
        } else if (select == 2) {
            System.out.println("çıkarma işlemi sonucu : " + (n1 - n2));
        } else if (select == 3) {
            System.out.println("çarpma işlemi sonucu : " + (n1 * n2));
        } else if (select == 4) {
            if (n2 != 0) {
                System.out.println("bölme işlemi sonucu : " + (n1 / n2));
            }
            else{
                System.out.println("sayı 0\'a bölünemez");
            }
        } else {
            System.out.println("hatalı giriş ");
        }
    }
}