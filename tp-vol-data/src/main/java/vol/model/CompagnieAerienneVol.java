package vol.model;

public class CompagnieAerienneVol {

	private CompagnieAerienne compagnieAerienne;
	private Vol vol;
	private String numero;
	private short ouvert;
	
	public CompagnieAerienneVol(){
		
	}
	
	public CompagnieAerienneVol(String numero, short ouvert) {
		this.numero = numero;
		this.ouvert = ouvert;
	}

	

	public String getNumero() {
		return numero;
	}

	public short getOuvert() {
		return ouvert;
	}

	public Vol getVol() {
		return vol;
	}

	public short isOuvert() {
		return ouvert;
	}

	public CompagnieAerienne getCompagnieAerienne() {
		return compagnieAerienne;
	}
	
	public void setCompagnieAerienne(CompagnieAerienne compagnieAerienne) {
		this.compagnieAerienne = compagnieAerienne;
	}
	
	public void setNumero(String numero) {
		this.numero = numero;
	}

	public void setOuvert(short ouvert) {
		this.ouvert = ouvert;
	}

	public void setVol(Vol vol) {
		this.vol = vol;
	}

	@Override
	public String toString() {
		return "CompagnieAerienneVol [ compagnieAerienne="
				+ compagnieAerienne + ", vol=" + vol + ", numero=" + numero + ", ouvert=" + ouvert + "]";
	}

}
