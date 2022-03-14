import java.util.Scanner;

public class Exercicio6{

    public static void main(String [] args){

        Scanner leitura = new Scanner(System.in);

        int idade;
        int vetor [] = new int [10];
        int cont = 0;
        
        

        System.out.println("Digite a idade para a conversão: ");
        idade = leitura.nextInt();


        while (idade >= 2){
            
            System.out.println("idade = " + idade);
            vetor[cont] = idade % 2;
            cont ++;
            idade = idade / 2;

        }
        vetor[cont] = idade;
        for (int tamanho = cont; tamanho >= 0; tamanho--){

            System.out.print(vetor[tamanho]);

        }
        


    }
}