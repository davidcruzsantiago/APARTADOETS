import java.util.Random;

public class Optimizacion {

    private static boolean esPrimo(int n) {
        boolean resultado = true;
        if (n == 0)
            return false;
        else {
            for (int i = n - 1; i > 1; i--) {
                if (n % i == 0)
                    return false;
            }
        }
        return resultado;
    }

    private static int FacToriaL(int numero) {
        if (numero < 0){ return 0;}
        int resultado = 1;
        int i = numero;
        while (i > 1) {
            resultado *= i;
            i--;
        }
        return resultado;
    }

    public static void main(String[] args) {
        Random r = new Random();
        int Valor = r.nextInt(9);
            if (Valor == 0)
                System.out.println("0 NO ES PRIMO NI NO PRIMO");
            else {
                boolean primo = esPrimo(Valor);
                if (primo) {
                    System.out.println(Valor + " ES PRIMO");
                    System.out.println("Y SU FACTORIAL ES: " + FacToriaL(Valor));
                } else {
                    System.out.println(Valor + " NO ES PRIMO");
                    System.out.println("Y SU FACTORIAL ES: " + FacToriaL(Valor));
                }
                if (Valor % 2 == 0) {
                    System.out.println("Y ADEMÁS ES PAR");
                } else {
                    System.out.println("Y ADEMÁS ES IMPAR");
                }

                if (Valor > 4 && Valor < 8) {
                    System.out.println("Y ESTÁ COMPRENDIDO ENTRE 4 Y 8");
                }
            }
        System.out.println("FIN DEL PROGRAMA");
    }
}

