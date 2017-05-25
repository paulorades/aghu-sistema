package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;


import org.hibernate.validator.constraints.Length;

/**
 * CentroResultado generated by hbm2java
 */
@Entity
@Table(name = "CENTRO_RESULTADO", schema = "AGH", uniqueConstraints = @UniqueConstraint(columnNames = "cr"))
public class CentroResultado implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8769739405897797348L;
	private Double codCr;
	private String descricao;
	private Double cr;
	private Character ativo;
	private Double codCli;

	public CentroResultado() {
	}

	public CentroResultado(Double codCr, String descricao, Double cr, Double codCli) {
		this.codCr = codCr;
		this.descricao = descricao;
		this.cr = cr;
		this.codCli = codCli;
	}

	public CentroResultado(Double codCr, String descricao, Double cr, Character ativo, Double codCli) {
		this.codCr = codCr;
		this.descricao = descricao;
		this.cr = cr;
		this.ativo = ativo;
		this.codCli = codCli;
	}

	@Id
	@Column(name = "COD_CR", unique = true, nullable = false, precision = 17, scale = 17)
	public Double getCodCr() {
		return this.codCr;
	}

	public void setCodCr(Double codCr) {
		this.codCr = codCr;
	}

	@Column(name = "DESCRICAO", nullable = false, length = 60)
	@Length(max = 60)
	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Column(name = "CR", unique = true, nullable = false, precision = 17, scale = 17)
	public Double getCr() {
		return this.cr;
	}

	public void setCr(Double cr) {
		this.cr = cr;
	}

	@Column(name = "ATIVO", length = 1)
	public Character getAtivo() {
		return this.ativo;
	}

	public void setAtivo(Character ativo) {
		this.ativo = ativo;
	}

	@Column(name = "COD_CLI", nullable = false, precision = 17, scale = 17)
	public Double getCodCli() {
		return this.codCli;
	}

	public void setCodCli(Double codCli) {
		this.codCli = codCli;
	}

	public enum Fields {

		COD_CR("codCr"),
		DESCRICAO("descricao"),
		CR("cr"),
		ATIVO("ativo"),
		COD_CLI("codCli");

		private String fields;

		private Fields(String fields) {
			this.fields = fields;
		}

		@Override
		public String toString() {
			return this.fields;
		}

	}


	// ##### GeradorEqualsHashCodeMain #####
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((getCodCr() == null) ? 0 : getCodCr().hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof CentroResultado)) {
			return false;
		}
		CentroResultado other = (CentroResultado) obj;
		if (getCodCr() == null) {
			if (other.getCodCr() != null) {
				return false;
			}
		} else if (!getCodCr().equals(other.getCodCr())) {
			return false;
		}
		return true;
	}
	// ##### GeradorEqualsHashCodeMain #####

}