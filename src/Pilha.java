
public class Pilha {
	
	private Object[] elementos = new Object[10];
	private int quantidade;
	public Object desempilha;//

	public boolean estaVazia() {
		// TODO Auto-generated method stub
		return (quantidade == 0);
	}

	public int tamanho() {
		// TODO Auto-generated method stub
		return quantidade; //
	}

	public void empilha(Object elemento) {
		this.elementos[quantidade] = elemento;
		quantidade++;
		
	}

	public Object topo() {
		// TODO Auto-generated method stub
		Object topo = topo();
		quantidade--;
		return topo;
	}

}
