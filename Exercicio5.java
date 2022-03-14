import java.util.Scanner;


public class Exercicio5 {

    public static void main(String [] args){

        int num;

        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite um número: ");
        num = leitura.nextInt();

        while (num > 1){
            if (num % 2 == 0){
                num = num / 2;
            }
            else{
                num = 3 * num + 1;
            }

        System.out.print(num + " -> ");
        leitura.close();
        
            }
        
        }
        
    }
    

