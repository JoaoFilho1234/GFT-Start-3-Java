import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Digite o numero que deseja descobrir o fatorial: ");

        int numero = s.nextInt();


        for (int i = numero - 1; i >=1 ; i--){

            numero = numero*i;
        }
        System.out.println("O fatorial é "+numero);
    }
}
