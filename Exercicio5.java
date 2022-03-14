import java.util.Scanner;


public class Exercicio5 {

    public static void main(String [] args){

        int num;

        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite um número: ");
        num = leitura.nextInt();

        if (num % 2 == 0){
            num = num / 2;
        }else{
            num = 3 * num + 1;
        }
        while (num != 40){
            System.out.println("Digite um número: ");
            num = leitura.nextInt();

        }
        System.out.println(num);
    }
    
}
