package br.gov.mec.aghu.model;

// Generated 08/02/2010 17:25:25 by Hibernate Tools 3.2.5.Beta

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;


import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * AbsRegSanguineoPacientesId generated by hbm2java
 */
@Embeddable
public class AbsRegSanguineoPacientesId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6584901335721938128L;
	private Integer pacCodigo;
	private Date dthrRegistro;

	public AbsRegSanguineoPacientesId() {
	}

	public AbsRegSanguineoPacientesId(Integer pacCodigo, Date dthrRegistro) {
		this.pacCodigo = pacCodigo;
		this.dthrRegistro = dthrRegistro;
	}

	@Column(name = "PAC_CODIGO", nullable = false, precision = 8, scale = 0)
	public Integer getPacCodigo() {
		return this.pacCodigo;
	}

	public void setPacCodigo(Integer pacCodigo) {
		this.pacCodigo = pacCodigo;
	}

	@Column(name = "DTHR_REGISTRO", nullable = false, length = 7)
	public Date getDthrRegistro() {
		return this.dthrRegistro;
	}

	public void setDthrRegistro(Date dthrRegistro) {
		this.dthrRegistro = dthrRegistro;
	}

	@Override
	public boolean equals(Object other) {
		if ((this == other)) {
			return true;
		}
		if ((other == null)) {
			return false;
		}
		if (!(other instanceof AbsRegSanguineoPacientesId)) {
			return false;
		}
		AbsRegSanguineoPacientesId castOther = (AbsRegSanguineoPacientesId) other;

		return this.getPacCodigo() != null && this.getPacCodigo().equals(castOther.getPacCodigo()) &&
				this.getDthrRegistro() != null && this.getDthrRegistro().equals(castOther.getDthrRegistro()); 
	}

	@Override
	public int hashCode() {
		int result = 17;

		result = 37 * result + (this.getPacCodigo() == null ? 0 : this.getPacCodigo().hashCode());  
		result = 37 * result + (this.getDthrRegistro() == null ? 0 : this.getDthrRegistro().hashCode());
		return result;
	}
}