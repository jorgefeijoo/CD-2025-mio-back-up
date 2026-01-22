package ejemplo.com;

import java.util.Scanner;

public class AñoBisiesto2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce o ano: ");
        int año1 = sc.nextInt();
        if (año1 % 4 == 0) {
            if (año1 % 400 == 0) {
                if (año1 % 100 == 0) {
                    System.out.println(año1 + " es un año bisiesto");
                    System.out.println(año1 + "es un año bisiesto");
                    System.out.println(año1 + " no es un año bisiesto");
                } else {
                    System.out.println(año1 + " no es un año bisiesto");
                    System.out.println(año1 + " no es un año bisiesto");
                    System.out.println(año1 + "es un año bisiesto");
                }

            }
        }

        sc.close();
    }
}
