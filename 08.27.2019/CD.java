package domaci08272019;

public class CD extends AlbumArtikal{
	
	public CD(Album album, String izdavac, double cena, int kolicina) {
		super(album, izdavac, cena, kolicina);
	}

	@Override
	public String ime() {
		StringBuilder sb = new StringBuilder();
		sb.append(album.getIzvodjac() + " - ");
		sb.append(album.getNaziv() + " (CD)");
		return sb.toString();
	}

}
