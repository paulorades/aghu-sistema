package br.gov.mec.aghu.dominio;

import br.gov.mec.aghu.core.dominio.Dominio;

public enum DominioPontuacaoCribMaximoEb implements Dominio {
	//Pontuação da Ficha CRIB para máximo EB nas primeiras 12 horas
	
	/**
	 * <= -15,0
	 */
	POSITIVO_3(3),
	/**
	 * -10,0 A -14,9
	 */
	POSITIVO_2(2),
	/**
	 * -7,0 A -9,9
	 */
	POSITIVO_1(1),
	/**
	 * > -7,0
	 */
	ZERO(0);

	private int value;

	private DominioPontuacaoCribMaximoEb(int value) {
		this.value = value;
	}

	@Override
	public int getCodigo() {
		return value;
	}

	@Override
	public String getDescricao() {
		switch (this) {
		
		case POSITIVO_3:
			return "3";
		case POSITIVO_2:
			return "2";
		case POSITIVO_1:
			return "1";
		case ZERO:
			return "0";
		default:
			return "";
		}
	}

}