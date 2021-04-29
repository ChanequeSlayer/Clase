package sobrecharge;

import java.util.Scanner;

public class Sobrecharge {

    public static void main(String[] args) {
        Scanner write = new Scanner(System.in);
        String saludo = write.next();
        int numI = write.nextInt();
        int num1 = write.nextInt();
        int num2 = write.nextInt();
        int num3 = write.nextInt();
        sobre obt1 = new sobre();
        obt1.test();
        obt1.test(num1);
        obt1.test(num1, num2);
        System.out.println("Hola "+obt1.test(num1, num2, num3));
        sobre obt2 = new sobre(numI,saludo);
    }

}
