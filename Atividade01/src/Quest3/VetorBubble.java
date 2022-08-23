package Quest3;

import java.util.Random;
import java.util.Scanner;

public class VetorBubble {

	public static void main(String[] args) {
		
		 Random random = new Random();
	     Scanner ler = new Scanner(System.in);
	     int[] vet = new int[50];
	     int busc, aux=0;
	   
	     
	     for (int i=0; i<vet.length;i++) vet[i]= random.nextInt(0, 10);
	 		

	     
	     for(int i = 0; i<vet.length; i++){
	 		for(int j = 0; j<vet.length - 1; j++){
	 			if(vet[j] > vet[j + 1]){
	 				aux = vet[j];
	 				vet[j] = vet[j+1];
	 				vet[j+1] = aux;
	 			}
	 		}
	 	}
	     
	     
	     for (int i=0; i<vet.length;i++) System.out.println(vet[i]);
	     
	     System.out.println("Escreva o numero que deseja buscar: ");
	     
	     busc = ler.nextInt();

	 				int inicio = 0, fim = vet.length - 1, meio;
	 		        
	 				
	 			 while (inicio <= fim) {
	 		            meio = (inicio + fim) / 2;
	 		            if (vet[meio] == busc) {
	 		                meio++;
	 		                System.out.println("Numero encontrado na posicao numero " + meio);
	 		                break;
	 		            } else if (vet[meio] < busc) {
	 		                inicio = meio + 1;
	 		            }else {
	 		                fim = meio - 1;
	 		            }
	 		           if (inicio > fim) {
	 		                System.out.println("Esse numero nao foi encontrado"); 
	 		            }

	}
}
}
