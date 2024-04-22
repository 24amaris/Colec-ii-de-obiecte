import java.util.LinkedList;

public class CosCumparaturi {
	private LinkedList<Produs> produse = new LinkedList<Produs>();
	
	public CosCumparaturi(LinkedList<Produs> produse) {
		this.produse = produse;
	}
	
	public CosCumparaturi() {
		this.produse = new LinkedList<Produs>();
	}

	public void addProdus(Produs adaugare) {
		this.produse.add(adaugare);
	}
	
	public int calculeazaTotal() {
		int pretTotal=0;
		for(Produs produs : produse) {
			pretTotal+=produs.getPret();
		}
		return pretTotal;
	}
	
	public String toString() {
		String cos="Produsele din cosul tau de cumparaturi: " + System.lineSeparator();
		Integer index=1;
		for(Produs produs : produse) {
			cos+= "[" + Integer.toString(index) + "] " + produs+System.lineSeparator();
			index++;
		}
		cos+= "Total pret: " + calculeazaTotal()+" RON";
		return cos;
	}
}

	public static void main(String[] args) {
		CosCumparaturi cos = new CosCumparaturi();
		Produs p1 = new Produs("Carte",45);
		Produs p2 = new Produs("Acuarele",18);
		Produs p3 = new Produs("Pix",2);
		cos.addProdus(p1);
		cos.addProdus(p2);
		cos.addProdus(p3);
		System.out.println(cos);
	}
