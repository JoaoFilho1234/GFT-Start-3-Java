import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Digite o número de 0 a 10 que deseja ver a tabuada: ");

        int numero = s.nextInt();

        System.out.println("Tabuada do número "+ numero);

        for(int i = 0; i<=10 ; i++) {
            System.out.println(numero + " X " + i + " = " + numero*i);
        }






    }
}
