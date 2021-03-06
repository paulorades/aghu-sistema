package br.gov.mec.aghu.model;

// Generated 12/12/2011 11:45:14 by Hibernate Tools 3.4.0.CR1

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;


import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.core.persistence.BaseEntityId;

/**
 * SceHistoricoFechMensal generated by hbm2java
 */
@Entity
@Table(name = "SCE_HISTORICO_FECH_MENSAL", schema = "AGH")
public class SceHistoricoFechamentoMensal extends BaseEntityId<SceHistoricoFechamentoMensalId> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5236274798989829691L;
	private SceHistoricoFechamentoMensalId id;
	private String descricao;
	private Integer quantidadeRegistrosProcessados;
	private String ocorrencia;
	private Boolean fechamentoConcluido;


	public SceHistoricoFechamentoMensal() {
	}

	public SceHistoricoFechamentoMensal(SceHistoricoFechamentoMensalId id) {
		this.id = id;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "dataCompetencia", column = @Column(name = "DT_COMPETENCIA", nullable = false, length = 29)),
			@AttributeOverride(name = "dataGeracao", column = @Column(name = "DT_GERACAO", nullable = false, length = 29)),
			@AttributeOverride(name = "etapa", column = @Column(name = "ETAPA", nullable = false)),
			@AttributeOverride(name = "version", column = @Column(name = "VERSION", nullable = false))})
	public SceHistoricoFechamentoMensalId getId() {
		return this.id;
	}

	public void setId(SceHistoricoFechamentoMensalId id) {
		this.id = id;
	}
	
	@Column(name = "DESCRICAO", length = 60)
	@Length(max = 60)
	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Column(name = "QTDE_REG_PROCESSADOS")
	public Integer getQuantidadeRegistrosProcessados() {
		return quantidadeRegistrosProcessados;
	}
	
	public void setQuantidadeRegistrosProcessados(Integer quantidadeRegistrosProcessados) {
		this.quantidadeRegistrosProcessados = quantidadeRegistrosProcessados;
	}

	@Column(name = "OCORRENCIA", length = 60)
	@Length(max = 60)
	public String getOcorrencia() {
		return this.ocorrencia;
	}

	public void setOcorrencia(String ocorrencia) {
		this.ocorrencia = ocorrencia;
	}

	@Column(name = "IND_FECH_CONCLUIDO", length = 1)
	@org.hibernate.annotations.Type(type = "br.gov.mec.aghu.core.persistence.type.BooleanUserType")
	public Boolean getFechamentoConcluido() {
		return fechamentoConcluido;
	}
	
	public void setFechamentoConcluido(Boolean fechamentoConcluido) {
		this.fechamentoConcluido = fechamentoConcluido;
	}
	
	public enum Fields {
		ID("id"),
		DATA_COMPETENCIA("id.dataCompetencia"),
		DATA_GERACAO("id.dataGeracao"),
		ETAPA("id.etapa"),
		DESCRICAO("descricao"),
		QUANTIDADE_REGISTROS_PROCESSADOS("quantidadeRegistrosProcessados"),
		OCORRENCIA("ocorrencia"),
		FECHAMENTO_CONCLUIDO("fechamentoConcluido");

		private String fields;

		private Fields(String fields) {
			this.fields = fields;
		}

		@Override
		public String toString() {
			return fields;
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
		if (!(obj instanceof SceHistoricoFechamentoMensal)) {
			return false;
		}
		SceHistoricoFechamentoMensal other = (SceHistoricoFechamentoMensal) obj;
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
