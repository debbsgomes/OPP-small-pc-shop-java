package trabalho_oo_uva;

public class Computador {
	
	private int memoriaRam;
	private int ssd;
	private String placaMae;
	private float preco;
	private boolean estoque;
	
	public Computador(int memoriaRam, int ssd, String placaMae, float preco, boolean estoque) {
		super();
		this.memoriaRam = memoriaRam;
		this.ssd = ssd;
		this.placaMae = placaMae;
		this.preco = preco;
		this.estoque = estoque;
	}
	
	public Computador() {
		
	}
	
	public int getMemoriaRam() {
		return memoriaRam;
	}
	public void setMemoriaRam(int memoriaRam) {
		this.memoriaRam = memoriaRam;
	}
	public int getSsd() {
		return ssd;
	}
	public void setSsd(int ssd) {
		this.ssd = ssd;
	}
	public String getPlacaMae() {
		return placaMae;
	}
	public void setPlacaMae(String placaMae) {
		this.placaMae = placaMae;
	}
	public float getPreco() {
		return preco;
	}
	public void setPreco(float preco) {
		this.preco = preco;
	}
	public boolean isEstoque() {
		return estoque;
	}
	public void setEstoque(boolean estoque) {
		this.estoque = estoque;
	}

	public String imprimir() {
		return "[memoriaRam=" + memoriaRam + ", ssd=" + ssd + ", placaMae=" + placaMae + ", preco=" + preco
				+ ", estoque=" + estoque + "]";
	}
	
}

