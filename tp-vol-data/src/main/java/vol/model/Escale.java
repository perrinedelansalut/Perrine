/**
 * 
 */
package vol.model;

import java.sql.Time;
import java.util.Date;

/**
 * @author ajc
 *
 */
public class Escale {

	
	private Date dateDepart;
	private Date dateArrivee;
	private Time heureDepart;
	private Time heureArrivee;
	private Vol vol;


	
	private Aeroport aeoroport;

	public Escale() {

		this.dateDepart = null;
		this.dateArrivee = null;
		this.heureDepart = null;
		this.heureArrivee = null;

	}

	public Date getDateArrivee() {
		return dateArrivee;
	}

	public Date getDateDepart() {
		return dateDepart;
	}

	public Time getHeureArrivee() {
		return heureArrivee;
	}

	public Time getHeureDepart() {
		return heureDepart;
	}

	public void setDateArrivee(Date dateArrivee) {
		this.dateArrivee = dateArrivee;
	}

	public void setDateDepart(Date dateDepart) {
		this.dateDepart = dateDepart;
	}

	public void setHeureArrivee(Time heureArrivee) {
		this.heureArrivee = heureArrivee;
	}

	public void setHeureDepart(Time heureDepart) {
		this.heureDepart = heureDepart;
	}
	
	public Vol getVol() {
		return vol;
	}

	public void setVol(Vol vol) {
		this.vol = vol;
	}

	public Aeroport getAeoroport() {
		return aeoroport;
	}

	public void setAeoroport(Aeroport aeoroport) {
		this.aeoroport = aeoroport;
	}

	@Override
	public String toString() {
		return "Escale [dateDepart=" + dateDepart + ", dateArrivee=" + dateArrivee + ", heureDepart=" + heureDepart
				+ ", heureArrivee=" + heureArrivee + ", vol=" + vol + ", aeoroport="
				+ aeoroport + "]";
	}



}
