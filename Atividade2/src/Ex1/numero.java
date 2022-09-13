package Ex1;

public class numero {

    private int valor_numero;

    private numero proximo;



    public numero(int novoValor){
        this.valor_numero = novoValor;
    }

    public int getValor_numero() {
        return valor_numero;
    }

    public void setValor_numero(int valor_elemento) {
        this.valor_numero = valor_elemento;
    }

    public numero getProximo() {
        return proximo;
    }

    public void setProximo(numero proximo) {
        this.proximo = proximo;
    }

}

