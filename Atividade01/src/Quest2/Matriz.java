package Quest2;

import java.util.Random;

public class Matriz {

	public static void main(String[] args) {
		
		int menorInt=99, maiorInt=0;
        int [][] vet =  new int[3][4];
        Random nmrrandom = new Random();
        for (int i = 0; i < vet.length; i++) {
            for (int j = 0; j < vet[i].length; j++) {
                vet[i][j] = nmrrandom.nextInt();
                System.out.printf("%d\t",vet[i][j]);
                if(menorInt>vet[i][j])menorInt=vet[i][j];
                if(maiorInt<vet[i][j])maiorInt=vet[i][j];
            }
            System.out.print("\n");
        }
        System.out.println("O menor valor da matriz: "+menorInt);
        System.out.println("O maior valor da matriz: "+maiorInt);
    }
}


