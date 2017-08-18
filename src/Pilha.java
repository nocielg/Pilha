
public class Pilha {
	
	private Object[] elementos;
	private int quantidade = 0;
	
	public Pilha(int maximo) {
		elementos = new Object[maximo];
	}

	public boolean estaVazia() {
		// TODO Auto-generated method stub
		return quantidade == 0;
	}//teste

	public int tamanho() {
		// TODO Auto-generated method stub
		return quantidade; 
	}

	public void empilha(Object elemento) {
		if (quantidade == elementos.length)
			throw new PilhaCheiaException("Não é possível empilhar mais elementos");
		this.elementos[quantidade] = elemento;
		quantidade++;
		
	}

	public Object topo() {
		// TODO Auto-generated method stub
		return elementos[quantidade-1];
	}
	
	public Object desempilha(){
		if(estaVazia())
			throw new PilhaVaziaException("Não é possível desempilhar.");
		Object topo = topo();
		quantidade--;
		return topo;
	}

}
