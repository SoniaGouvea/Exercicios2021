import java.util.Scanner;

public class FaixaDeValor {
         public static void main(String[] args) {
            Scanner entrada = new Scanner(System.in);
            System.out.println("Digite numero A: ");
            int a = entrada.nextInt();
            System.out.println("Numero digitado: " + a);
            int x,y,z;

            System.out.println("Digite o numero x: ");
            x = entrada.nextInt();
            System.out.println("Digite o numero y: ");
            y = entrada.nextInt();
            System.out.println("Digite o numero z: ");
            z = entrada.nextInt();

            System.out.println("x: " + x);
            System.out.println("y: " + y);
            System.out.println("z: " + z);

            System.out.println("Soma: " + (x+y+z));

            if((x+y+z)>1000) {
                System.out.println("Superior a 1000");
            } else {
                System.out.println("Inferior ou igual a 1000");
            }
            int t;

            t = (x+y+z);

            if (( t > 0 ) && (t < 300)) {
                System.out.println("Faixa 300");

            } else if ((t > 300) && (t < 600)) {
                System.out.println("Faixa 600");
            } else {
                System.out.println("Faixa 1000");
            }

            entrada.close();
        }
}
