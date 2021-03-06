package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Version;


import org.apache.commons.lang3.builder.EqualsBuilder;

import br.gov.mec.aghu.core.persistence.BaseEntityId;


/**
 * ScoSolicitacaoCompraServico generated by hbm2java
 */
@Entity
@Table(name = "SCO_SOLICITACAO_COMPRA_SERVICO", schema = "AGH")
public class ScoSolicitacaoCompraServico extends BaseEntityId<ScoSolicitacaoCompraServicoId> implements java.io.Serializable, Cloneable {

	private static final long serialVersionUID = -5208347527875951477L;
	private ScoSolicitacaoCompraServicoId id;
	private Integer version;
	private ScoSolicitacaoDeCompra scoSolicitacaoDeCompra;
	private ScoSolicitacaoServico scoSolicitacaoServico;

	public ScoSolicitacaoCompraServico() {
	}

	public ScoSolicitacaoCompraServico(ScoSolicitacaoCompraServicoId id, ScoSolicitacaoDeCompra scoSolicitacaoDeCompra,
			ScoSolicitacaoServico scoSolicitacaoServico) {
		this.id = id;
		this.scoSolicitacaoDeCompra = scoSolicitacaoDeCompra;
		this.scoSolicitacaoServico = scoSolicitacaoServico;
	}

	@EmbeddedId
	@AttributeOverrides({ 
		@AttributeOverride(name = "slcNumero", column = @Column(name = "SLC_NUMERO", nullable = false)),
		@AttributeOverride(name = "slsNumero", column = @Column(name = "SLS_NUMERO", nullable = false)) })
	public ScoSolicitacaoCompraServicoId getId() {
		return this.id;
	}

	public void setId(ScoSolicitacaoCompraServicoId id) {
		this.id = id;
	}

	@Version
	@Column(name = "VERSION", nullable = false)
	public Integer getVersion() {
		return this.version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "SLC_NUMERO", nullable = false, insertable = false, updatable = false)
	public ScoSolicitacaoDeCompra getScoSolicitacaoDeCompra() {
		return this.scoSolicitacaoDeCompra;
	}

	public void setScoSolicitacaoDeCompra(ScoSolicitacaoDeCompra scoSolicitacaoDeCompra) {
		this.scoSolicitacaoDeCompra = scoSolicitacaoDeCompra;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "SLS_NUMERO", nullable = false, insertable = false, updatable = false)
	public ScoSolicitacaoServico getScoSolicitacaoServico() {
		return this.scoSolicitacaoServico;
	}

	public void setScoSolicitacaoServico(ScoSolicitacaoServico scoSolicitacaoServico) {
		this.scoSolicitacaoServico = scoSolicitacaoServico;
	}

	public enum Fields {
		ID("id"),
		VERSION("version"),
		SCO_SOLICITACAO_DE_COMPRA("scoSolicitacaoDeCompra"),
		SCO_SOLICITACAO_SERVICO("scoSolicitacaoServico"),
		SLC_NUMERO("id.slcNumero"), 
		SLS_NUMERO("id.slsNumero");

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
		result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
		return result;
	}
	
	/*@Override
	public boolean equals(Object other) {
		if (!(other instanceof ScoSolicitacaoCompraServico)){
			return false;
		}
		ScoSolicitacaoCompraServico castOther = (ScoSolicitacaoCompraServico) other;
		
		return this.getScoSolicitacaoDeCompra().equals(castOther.getScoSolicitacaoDeCompra()) 
				&& this.getScoSolicitacaoServico().equals(castOther.getScoSolicitacaoServico()); 
		
	}*/
	
	@Override
	public boolean equals(Object other) {
		if (other instanceof ScoSolicitacaoCompraServico) {
			ScoSolicitacaoCompraServico castOther = (ScoSolicitacaoCompraServico) other;
			return new EqualsBuilder().append(
					this.getScoSolicitacaoDeCompra().getNumero(),
					castOther.getScoSolicitacaoDeCompra().getNumero())
					.isEquals()
					&& new EqualsBuilder().append(
							this.getScoSolicitacaoServico().getNumero(),
							castOther.getScoSolicitacaoServico().getNumero())
							.isEquals();
		} else {
			return false;
		}
	}
	// ##### GeradorEqualsHashCodeMain #####
	
	@Override
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
}