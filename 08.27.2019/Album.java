package domaci08272019;

import java.util.Date;


public class Album {
	private String naziv;
	private String izvodjac;
	private Date datum;
	private MuzickaNumera[] nizPesama;
	private int brPesama = 0;
	
	public Album(String naziv, String izvodjac, Date datum) {
		super();
		this.naziv = naziv;
		this.izvodjac = izvodjac;
		this.datum = datum;
		nizPesama = new MuzickaNumera[5];
		
	}
	
	public void dodaj(MuzickaNumera a) {
		if (brPesama == nizPesama.length) {
			System.out.println("Vec postoji 5 numera");
		}
		else {
			nizPesama[brPesama] = a;
			brPesama++;
		}
	}
	public void dodaj(String naziv, String trajanje) {
		MuzickaNumera nova = new MuzickaNumera (naziv, this.izvodjac, trajanje);
				//System.out.println(nova.toString());
		this.dodaj(nova);
				
	}

	public String getNaziv() {
		return naziv;
	}

	public String getIzvodjac() {
		return izvodjac;
	}
	public MuzickaNumera getMuzickaNumera(int index) {
		return this.nizPesama[index];

	}
	public MuzickaNumera getMuzickaNumera(String ime) {
		MuzickaNumera nova = new MuzickaNumera();
		for (int i = 0; i < nizPesama.length; i++) {
            if (this.nizPesama[i].getNaziv().equals(ime)) {
                nova= this.nizPesama[i];
                break;
            }
          
        }
		return nova;
	}
	public String toString () {
		String s = "";
		s += izvodjac + " - " + naziv + ":[";
		for (int i = 0; i < nizPesama.length; i++) {
			if (this.nizPesama[i] != null) 
				s += "\n\t" + this.nizPesama[i];
			
		}
		s += "\n];";
		return s;
	}

}
