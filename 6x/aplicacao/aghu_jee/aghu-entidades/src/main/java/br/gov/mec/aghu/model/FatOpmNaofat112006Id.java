package br.gov.mec.aghu.model;

// Generated 15/03/2011 13:46:58 by Hibernate Tools 3.2.5.Beta

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * FatOpmNaofat112006Id generated by hbm2java
 */
@Embeddable
public class FatOpmNaofat112006Id implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = 99643234872581549L;
	private String sigla;
	private String especialidade;
	private Long codTabela;
	private String descricao;
	private BigDecimal quantidade;
	private BigDecimal valorApres;

	public FatOpmNaofat112006Id() {
	}

	public FatOpmNaofat112006Id(String sigla, String especialidade,
			Long codTabela, String descricao, BigDecimal quantidade,
			BigDecimal valorApres) {
		this.sigla = sigla;
		this.especialidade = especialidade;
		this.codTabela = codTabela;
		this.descricao = descricao;
		this.quantidade = quantidade;
		this.valorApres = valorApres;
	}

	@Column(name = "SIGLA", length = 3)
	@Length(max = 3)
	public String getSigla() {
		return this.sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	@Column(name = "ESPECIALIDADE", length = 45)
	@Length(max = 45)
	public String getEspecialidade() {
		return this.especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	@Column(name = "COD_TABELA", precision = 10, scale = 0)
	public Long getCodTabela() {
		return this.codTabela;
	}

	public void setCodTabela(Long codTabela) {
		this.codTabela = codTabela;
	}

	@Column(name = "DESCRICAO", length = 100)
	@Length(max = 100)
	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Column(name = "QUANTIDADE", precision = 22, scale = 0)
	public BigDecimal getQuantidade() {
		return this.quantidade;
	}

	public void setQuantidade(BigDecimal quantidade) {
		this.quantidade = quantidade;
	}

	@Column(name = "VALOR_APRES", precision = 22, scale = 0)
	public BigDecimal getValorApres() {
		return this.valorApres;
	}

	public void setValorApres(BigDecimal valorApres) {
		this.valorApres = valorApres;
	}
	

	// ##### GeradorEqualsHashCodeMain #####
	@Override
	public int hashCode() {
		HashCodeBuilder umHashCodeBuilder = new HashCodeBuilder();
		umHashCodeBuilder.append(this.getDescricao());
		umHashCodeBuilder.append(this.getQuantidade());
		umHashCodeBuilder.append(this.getEspecialidade());
		umHashCodeBuilder.append(this.getSigla());
		umHashCodeBuilder.append(this.getValorApres());
		umHashCodeBuilder.append(this.getCodTabela());
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
		if (!(obj instanceof FatOpmNaofat112006Id)) {
			return false;
		}
		FatOpmNaofat112006Id other = (FatOpmNaofat112006Id) obj;
		EqualsBuilder umEqualsBuilder = new EqualsBuilder();
		umEqualsBuilder.append(this.getDescricao(), other.getDescricao());
		umEqualsBuilder.append(this.getQuantidade(), other.getQuantidade());
		umEqualsBuilder.append(this.getEspecialidade(), other.getEspecialidade());
		umEqualsBuilder.append(this.getSigla(), other.getSigla());
		umEqualsBuilder.append(this.getValorApres(), other.getValorApres());
		umEqualsBuilder.append(this.getCodTabela(), other.getCodTabela());
		return umEqualsBuilder.isEquals();
	}
	// ##### GeradorEqualsHashCodeMain #####
	
}
