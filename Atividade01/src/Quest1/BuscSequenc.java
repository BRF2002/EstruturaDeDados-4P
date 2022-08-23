package Quest1;
import java.util.Random;
import java.util.Scanner;


public class BuscSequenc {

	public static void main(String[] args) {

		    	
        Random nmrrandom = new Random();
        Scanner ler = new Scanner(System.in);
        int[] vet = new int[10];
        int busc, posicao = -1;
        System.out.println("Escreva o numero que deseja buscar: ");
        busc = ler.nextInt();

        for (int i = 0; i < vet.length; i++) {
            vet[i] = nmrrandom.nextInt(10);
            System.out.print(" " + vet[i]);
        }
        for (int i = 0; i < vet.length; i++) {
            if (busc == vet[i]) {
                posicao = i + 1;
                System.out.println("\n Numero encontrado na " + posicao + " posicao");
            }
        }
        if (posicao == -1) System.out.println("\n O numero nao foi encontrado!");

    }	             
		    }

		
		
	