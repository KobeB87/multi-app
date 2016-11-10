/**
 * 
 */
package com.formiz.bean;

/**
 * @author ademola
 *
 */
public class Formiz {
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
