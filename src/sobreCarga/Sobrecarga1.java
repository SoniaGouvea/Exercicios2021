package sobreCarga;

public class Sobrecarga1 {
    public static void main(String[] args) {



        int resultado = 0;
        double result = 0.0;

        Calculo1 calc = new Calculo1();

        resultado = calc.soma(10, 5);

        System.out.println("O resultado é:" + resultado);

        result = calc.soma(5.5, 6.7);

        System.out.println("O result e: " + result);
    }

}

