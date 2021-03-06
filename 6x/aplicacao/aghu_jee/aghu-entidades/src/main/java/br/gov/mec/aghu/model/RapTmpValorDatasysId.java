package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * RapTmpValorDatasysId generated by hbm2java
 */
@Embeddable
public class RapTmpValorDatasysId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3389957766459202443L;
	private Integer matricula;
	private String nome;
	private String valor;
	private String situacao;
	private Integer version;

	public RapTmpValorDatasysId() {
	}

	public RapTmpValorDatasysId(Integer version) {
		this.version = version;
	}

	public RapTmpValorDatasysId(Integer matricula, String nome, String valor, String situacao, Integer version) {
		this.matricula = matricula;
		this.nome = nome;
		this.valor = valor;
		this.situacao = situacao;
		this.version = version;
	}

	@Column(name = "MATRICULA")
	public Integer getMatricula() {
		return this.matricula;
	}

	public void setMatricula(Integer matricula) {
		this.matricula = matricula;
	}

	@Column(name = "NOME", length = 50)
	@Length(max = 50)
	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Column(name = "VALOR", length = 12)
	@Length(max = 12)
	public String getValor() {
		return this.valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	@Column(name = "SITUACAO", length = 1)
	@Length(max = 1)
	public String getSituacao() {
		return this.situacao;
	}

	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}

	@Column(name = "VERSION", nullable = false)
	public Integer getVersion() {
		return this.version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}


	// ##### GeradorEqualsHashCodeMain #####
	@Override
	public int hashCode() {
		HashCodeBuilder umHashCodeBuilder = new HashCodeBuilder();
		umHashCodeBuilder.append(this.getVersion());
		umHashCodeBuilder.append(this.getSituacao());
		umHashCodeBuilder.append(this.getMatricula());
		umHashCodeBuilder.append(this.getNome());
		umHashCodeBuilder.append(this.getValor());
		return umHashCodeBuilder.toHashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof RapTmpValorDatasysId)) {
			return false;
		}
		RapTmpValorDatasysId other = (RapTmpValorDatasysId) obj;
		EqualsBuilder umEqualsBuilder = new EqualsBuilder();
		umEqualsBuilder.append(this.getVersion(), other.getVersion());
		umEqualsBuilder.append(this.getSituacao(), other.getSituacao());
		umEqualsBuilder.append(this.getMatricula(), other.getMatricula());
		umEqualsBuilder.append(this.getNome(), other.getNome());
		umEqualsBuilder.append(this.getValor(), other.getValor());
		return umEqualsBuilder.isEquals();
	}
	// ##### GeradorEqualsHashCodeMain #####
	
}
