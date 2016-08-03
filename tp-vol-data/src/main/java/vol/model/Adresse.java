/**
 * 
 */
package vol.model;

/**
 * @author ajc
 *
 */
public class Adresse {

	private String adresse;

	private String codePostal;
	private String ville;
	private String pays;

	public Adresse() {
		// TODO Auto-generated constructor stub
	}

	public String getAdresse() {
		return adresse;
	}

	public String getCodePostal() {
		return codePostal;
	}
	
	public String getPays() {
		return pays;
	}

	public String getVille() {
		return ville;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}

	public void setPays(String pays) {
		this.pays = pays;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	@Override
	public String toString() {
		return "Adresse [adresse=" + adresse + ", codePostal=" + codePostal + ", ville=" + ville + ", pays=" + pays
				+ "]";
	}

}
