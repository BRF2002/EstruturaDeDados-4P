package Ex1;

public class ordem {

	 private numero primeiro_posicao;

	    private numero ultimo_posicao;

	    private int tamanho;

	    public ordem(){
	        this.tamanho = 0;
	    }

	    public int getTamanho() {
	        return tamanho;
	    }

	    public void adicionar(int novoValor){

	    	numero novo_numero = new numero(novoValor);

	        if (this.primeiro_posicao == null && this.ultimo_posicao == null){
	            this.primeiro_posicao = novo_numero;
	            this.ultimo_posicao = novo_numero;
	        }else{

	            this.ultimo_posicao.setProximo(novo_numero);
	            this.ultimo_posicao = novo_numero;

	        }

	        this.tamanho++;

	    }

	    public int get_valor_na_posicao(int posicao){

	    	numero atual = this.primeiro_posicao;

	        for(int i=0; i < posicao; i++){

	            if (atual.getProximo() != null){

	                atual = atual.getProximo();

	            }

	        }

	        return atual.getValor_numero();
}
}
