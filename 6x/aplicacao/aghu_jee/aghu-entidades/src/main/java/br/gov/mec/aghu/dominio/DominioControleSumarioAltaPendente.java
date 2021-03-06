package br.gov.mec.aghu.dominio;

import br.gov.mec.aghu.core.dominio.Dominio;

public enum DominioControleSumarioAltaPendente implements Dominio {
	/**
	 * Elaborado e não recebido
	 */
	E,
	/**
	 * Não elaborado
	 */
	N,
	/**
	 * Recebido
	 */
	R;

	@Override
	public int getCodigo() {
		return this.ordinal();
	}

	@Override
	public String getDescricao() {
		switch (this) {
		case E:
			return "Elaborado e não recebido";
		case N:
			return "Não elaborado";
		case R:
			return "Recebido";
		default:
			return "";
		}
	}

}
