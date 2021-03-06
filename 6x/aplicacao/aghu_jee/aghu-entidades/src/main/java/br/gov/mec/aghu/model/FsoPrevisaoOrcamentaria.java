package br.gov.mec.aghu.model;

// Generated 01/12/2011 14:28:55 by Hibernate Tools 3.4.0.CR1

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


import br.gov.mec.aghu.core.persistence.BaseEntityId;

/**
 * FsoPrevisoesOrcamentarias generated by hbm2java
 */
@Entity
@Table(name = "FSO_PREVISOES_ORCAMENTARIAS", schema = "AGH")
public class FsoPrevisaoOrcamentaria extends BaseEntityId<FsoPrevisaoOrcamentariaId> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5890864134370851918L;
	
	private FsoPrevisaoOrcamentariaId id;
	private FsoExercicioOrcamentario exercicioOrcamentario;
	private FsoConveniosFinanceiro convenioFinanceiro;
	private FsoNaturezaDespesa naturezaDespesa; 
	private BigDecimal valorOrcado;
	private BigDecimal valorComprometido;
	private BigDecimal valorRealizado;
	private Date criadoEm;
	private Date alteradoEm;
	private RapServidores servidor;
	private RapServidores servidorAlteracao;
	private BigDecimal valorReserva;
	private FsoGrupoNaturezaDespesa grupoNaturezaDespesa; 

	public FsoPrevisaoOrcamentaria() {
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "exoExercicio", column = @Column(name = "EXO_EXERCICIO", nullable = false, length = 7)),
			@AttributeOverride(name = "ptbCodigo", column = @Column(name = "PTB_CODIGO", nullable = false, precision = 30, scale = 0)),
			@AttributeOverride(name = "gndCodigo", column = @Column(name = "GND_CODIGO", nullable = false, precision = 6, scale = 0)),
			@AttributeOverride(name = "seqp", column = @Column(name = "SEQP", nullable = false, precision = 3, scale = 0)) })
	public FsoPrevisaoOrcamentariaId getId() {
		return this.id;
	}

	public void setId(FsoPrevisaoOrcamentariaId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "EXO_EXERCICIO", nullable = false, insertable = false, updatable = false)
	public FsoExercicioOrcamentario getExercicioOrcamentario() {
		return exercicioOrcamentario;
	}

	public void setExercicioOrcamentario(
			FsoExercicioOrcamentario exercicioOrcamentario) {
		this.exercicioOrcamentario = exercicioOrcamentario;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CVF_CODIGO")
	public FsoConveniosFinanceiro getConvenioFinanceiro() {
		return convenioFinanceiro;
	}

	public void setConvenioFinanceiro(FsoConveniosFinanceiro convenioFinanceiro) {
		this.convenioFinanceiro = convenioFinanceiro;
	}
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "NTD_CODIGO", referencedColumnName = "CODIGO"),
			@JoinColumn(name = "NTD_GND_CODIGO", referencedColumnName = "GND_CODIGO") })	
	public FsoNaturezaDespesa getNaturezaDespesa() {
		return naturezaDespesa;
	}

	public void setNaturezaDespesa(FsoNaturezaDespesa naturezaDespesa) {
		this.naturezaDespesa = naturezaDespesa;
	}

	@Column(name = "VALOR_ORCADO", precision = 20)
	public BigDecimal getValorOrcado() {
		return this.valorOrcado;
	}

	public void setValorOrcado(BigDecimal valorOrcado) {
		this.valorOrcado = valorOrcado;
	}

	@Column(name = "VALOR_COMPROMETIDO", precision = 20)
	public BigDecimal getValorComprometido() {
		return this.valorComprometido;
	}

	public void setValorComprometido(BigDecimal valorComprometido) {
		this.valorComprometido = valorComprometido;
	}

	@Column(name = "VALOR_REALIZADO", precision = 20)
	public BigDecimal getValorRealizado() {
		return this.valorRealizado;
	}

	public void setValorRealizado(BigDecimal valorRealizado) {
		this.valorRealizado = valorRealizado;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CRIADO_EM", nullable = false, length = 7)
	public Date getCriadoEm() {
		return this.criadoEm;
	}

	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "ALTERADO_EM", length = 7)
	public Date getAlteradoEm() {
		return this.alteradoEm;
	}

	public void setAlteradoEm(Date alteradoEm) {
		this.alteradoEm = alteradoEm;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "SER_MATRICULA", referencedColumnName = "MATRICULA"),
			@JoinColumn(name = "SER_VIN_CODIGO", referencedColumnName = "VIN_CODIGO") })
	public RapServidores getServidor() {
		return servidor;
	}

	public void setServidor(RapServidores servidor) {
		this.servidor = servidor;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "SER_MATRICULA_ALTERADO", referencedColumnName = "MATRICULA"),
			@JoinColumn(name = "SER_VIN_CODIGO_ALTERADO", referencedColumnName = "VIN_CODIGO") })	
	public RapServidores getServidorAlteracao() {
		return servidorAlteracao;
	}

	public void setServidorAlteracao(RapServidores servidorAlteracao) {
		this.servidorAlteracao = servidorAlteracao;
	}

	@Column(name = "VALOR_RESERVA", precision = 20)
	public BigDecimal getValorReserva() {
		return this.valorReserva;
	}

	public void setValorReserva(BigDecimal valorReserva) {
		this.valorReserva = valorReserva;
	}

	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "GND_CODIGO", insertable=false, updatable=false)
	public FsoGrupoNaturezaDespesa getGrupoNaturezaDespesa() {
		return grupoNaturezaDespesa;
	}

	public void setGrupoNaturezaDespesa(FsoGrupoNaturezaDespesa grupoNaturezaDespesa) {
		this.grupoNaturezaDespesa = grupoNaturezaDespesa;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		if (getClass() != obj.getClass()) {
			return false;
		}
		FsoPrevisaoOrcamentaria other = (FsoPrevisaoOrcamentaria) obj;
		if (id == null) {
			if (other.id != null) {
				return false;
			}
		} else if (!id.equals(other.id)) {
			return false;
		}
		return true;
	}

	public enum Fields {
		EXEC_ORCAMENTARIO("exercicioOrcamentario"),
		GRUPO_NAT_DESPZ("grupoNaturezaDespesa"),
		VALOR_ORCADO("valorOrcado"),
		VALOR_COMPROMETIDO("valorComprometido"),
		;

		private String fields;

		private Fields(String fields) {
			this.fields = fields;
		}

		@Override
		public String toString() {
			return fields;
		}
	}
}
