package Ex1;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	
		 ordem fila_normal = new ordem();
	     ordem fila_prioridade = new ordem();



	        for(int i=0; i < 200; i++) {
	            if(i%2==0){
	                fila_normal.adicionar(i);
	            }else{
	                fila_prioridade.adicionar(i);
	            }
	        }

	        for(int i=0; i < fila_prioridade.getTamanho(); i++) {
	            System.out.println(fila_prioridade.get_valor_na_posicao(i));
	            }

}
}