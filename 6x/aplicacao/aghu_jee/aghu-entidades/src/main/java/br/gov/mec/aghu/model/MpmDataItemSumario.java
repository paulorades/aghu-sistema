package br.gov.mec.aghu.model;

// Generated 14/09/2010 17:49:55 by Hibernate Tools 3.2.5.Beta

import java.util.Date;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


import br.gov.mec.aghu.core.persistence.BaseEntityId;

/**
 * MpmDataItemSumario generated by hbm2java
 */
@Entity
@Table(name = "MPM_DATA_ITEM_SUMARIOS", schema = "AGH")
public class MpmDataItemSumario extends BaseEntityId<MpmDataItemSumarioId> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3520377761678685855L;
	private MpmDataItemSumarioId id;
	private MpmItemPrescricaoSumario itemPrescricaoSumarios;
	private Date data;
	private String valor;//Alterado de dominio para string por causa do bug #21836. Dominio ainda é utilizado nas regras de negocio

	public MpmDataItemSumario() {
	}

	public MpmDataItemSumario(MpmDataItemSumarioId id,
			MpmItemPrescricaoSumario itemPrescricaoSumarios, Date data,
			String valor) {
		this.id = id;
		this.itemPrescricaoSumarios = itemPrescricaoSumarios;
		this.data = data;
		this.valor = valor;
	}

	@EmbeddedId
	@AttributeOverrides( {
			@AttributeOverride(name = "apaAtdSeq", column = @Column(name = "APA_ATD_SEQ", nullable = false, precision = 7, scale = 0)),
			@AttributeOverride(name = "apaSeq", column = @Column(name = "APA_SEQ", nullable = false, precision = 8, scale = 0)),
			@AttributeOverride(name = "ituSeq", column = @Column(name = "ITU_SEQ", nullable = false, precision = 8, scale = 0)),
			@AttributeOverride(name = "seqp", column = @Column(name = "SEQP", nullable = false, precision = 5, scale = 0)) })
	public MpmDataItemSumarioId getId() {
		return this.id;
	}

	public void setId(MpmDataItemSumarioId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ITU_SEQ", nullable = false, insertable = false, updatable = false)
	public MpmItemPrescricaoSumario getItemPrescricaoSumarios() {
		return itemPrescricaoSumarios;
	}

	public void setItemPrescricaoSumarios(
			MpmItemPrescricaoSumario itemPrescricaoSumarios) {
		this.itemPrescricaoSumarios = itemPrescricaoSumarios;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DATA", nullable = false, length = 7)
	public Date getData() {
		return this.data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	@Column(name = "VALOR", nullable = false, length = 1)
	public String getValor() {
		return this.valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}
	
	public enum Fields {
		ID("id"), 
		ID_APA_ATD_SEQ("id.apaAtdSeq"),
		ID_APA_SEQ("id.apaSeq"),
		ID_ITU_SEQ("id.ituSeq"),
		ID_SEQP("id.seqp"),
		VALOR("valor"), DATA("data"), ITU_SEQ("itemPrescricaoSumarios");

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
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof MpmDataItemSumario)) {
			return false;
		}
		MpmDataItemSumario other = (MpmDataItemSumario) obj;
		if (getId() == null) {
			if (other.getId() != null) {
				return false;
			}
		} else if (!getId().equals(other.getId())) {
			return false;
		}
		return true;
	}
	// ##### GeradorEqualsHashCodeMain #####

}
