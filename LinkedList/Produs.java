public class Produs {
	
	private String nume;
	private int pret;
	
	public Produs(String nume, int price) {
		this.nume = nume;
		this.pret = pret;
	}
	
	public String getNume() {
		return nume;
	}
	
	public double getPret() {
		return pret;
	}
    
    public String toString() {
		return this.nume+" ( "+this.pret+" RON ) ";
	}
}