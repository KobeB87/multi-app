/**
 * 
 */
package com.dictao;

/**
 * @author ademola
 *
 */
public class Dictao {
	/**
	 * Numéro de dossier recherché
	 */
	private String numeroDossier;

	public String toString() {
		return this.getNumeroDossier();
	}

	/**
	 * @return the numeroDossier
	 */
	public String getNumeroDossier() {
		return numeroDossier;
	}

	/**
	 * @param numeroDossier the numeroDossier to set
	 */
	public void setNumeroDossier(String numeroDossier) {
		this.numeroDossier = numeroDossier;
	}

}
