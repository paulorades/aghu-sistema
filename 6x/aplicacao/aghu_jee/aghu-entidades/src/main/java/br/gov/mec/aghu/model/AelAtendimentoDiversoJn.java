package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


import org.hibernate.annotations.Immutable;
import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.dominio.DominioOrigemAmostra;
import br.gov.mec.aghu.dominio.DominioSexo;
import br.gov.mec.aghu.dominio.DominioTipoAmostra;
import br.gov.mec.aghu.core.model.BaseJournal;

/**
 * AelAtendimentoDiversoJn generated by hbm2java
 */
@Entity
@SequenceGenerator(name="aelAtvJnSeq", sequenceName="AGH.AEL_ATV_JN_SEQ", allocationSize = 1)
@Table(name = "AEL_ATENDIMENTO_DIVERSOS_JN", schema = "AGH")
@Immutable
public class AelAtendimentoDiversoJn extends BaseJournal {

/**
	 * 
	 */
	private static final long serialVersionUID = 67180631235598157L;

	private Integer seq;
	private Date dthrInicio;
	private Date dthrFim;
	private String identificacaoAmostra;
	private String descricaoMaterial;
	private String nomePaciente;
	private DominioTipoAmostra tipoAmostra;
	private Date dtSoro;
	private AipPacientes aipPaciente;
	private AelCadCtrlQualidades aelCadCtrlQualidades;
	private AelLaboratorioExternos aelLaboratorioExternos;
	private AelDadosCadaveres aelDadosCadaveres;
	private FccCentroCustos fccCentroCustos;
	private AghEspecialidades aghEspecialidades;
	private RapServidores servidor;
	private DominioOrigemAmostra origemAmostra;
	
	private Integer prontuario;
	private Date dtNascimento;
	private DominioSexo sexo;
	private AbsCandidatosDoadores absCandidatosDoadores;
	private AbsAmostraDoacao absAmostraDoacao;
	private AelProjetoPesquisas aelProjetoPesquisas;
	
	public AelAtendimentoDiversoJn() {
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "aelAtvJnSeq")
	@Column(name = "SEQ_JN", unique = true, nullable = false)
	//@GeneratedValue(strategy = GenerationType.AUTO, generator = "")
	@Override
	public Integer getSeqJn() {
		return super.getSeqJn();
	}

	@Column(name = "SEQ", nullable = false)
	public Integer getSeq() {
		return this.seq;
	}

	public void setSeq(Integer seq) {
		this.seq = seq;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DTHR_INICIO", nullable = false, length = 7)
	public Date getDthrInicio() {
		return this.dthrInicio;
	}

	public void setDthrInicio(Date dthrInicio) {
		this.dthrInicio = dthrInicio;
	}
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "PAC_CODIGO")
	public AipPacientes getAipPaciente() {
		return this.aipPaciente;
	}

	public void setAipPaciente(AipPacientes aipPaciente) {
		this.aipPaciente = aipPaciente;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DTHR_FIM", length = 7)
	public Date getDthrFim() {
		return this.dthrFim;
	}

	public void setDthrFim(Date dthrFim) {
		this.dthrFim = dthrFim;
	}

	@Column(name = "IDENTIFICACAO_AMOSTRA", length = 20)
	@Length(max = 20)
	public String getIdentificacaoAmostra() {
		return this.identificacaoAmostra;
	}

	public void setIdentificacaoAmostra(String identificacaoAmostra) {
		this.identificacaoAmostra = identificacaoAmostra;
	}

	@Column(name = "DESCRICAO_MATERIAL", length = 240)
	@Length(max = 240)
	public String getDescricaoMaterial() {
		return this.descricaoMaterial;
	}

	public void setDescricaoMaterial(String descricaoMaterial) {
		this.descricaoMaterial = descricaoMaterial;
	}

	@Column(name = "NOME_PACIENTE", length = 60)
	@Length(max = 60)
	public String getNomePaciente() {
		return this.nomePaciente;
	}

	public void setNomePaciente(String nomePaciente) {
		this.nomePaciente = nomePaciente;
	}

	@Column(name = "TIPO_AMOSTRA", length = 1)
	@Enumerated(EnumType.STRING)
	public DominioTipoAmostra getTipoAmostra() {
		return this.tipoAmostra;
	}

	public void setTipoAmostra(DominioTipoAmostra tipoAmostra) {
		this.tipoAmostra = tipoAmostra;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DT_SORO", length = 7)
	public Date getDtSoro() {
		return this.dtSoro;
	}

	public void setDtSoro(Date dtSoro) {
		this.dtSoro = dtSoro;
	} 

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "PJQ_SEQ")
	public AelProjetoPesquisas getAelProjetoPesquisas() {
		return this.aelProjetoPesquisas;
	}

	public void setAelProjetoPesquisas(AelProjetoPesquisas aelProjetoPesquisas) {
		this.aelProjetoPesquisas = aelProjetoPesquisas;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CCQ_SEQ")
	public AelCadCtrlQualidades getAelCadCtrlQualidades() {
		return aelCadCtrlQualidades;
	}

	public void setAelCadCtrlQualidades(AelCadCtrlQualidades aelCadCtrlQualidades) {
		this.aelCadCtrlQualidades = aelCadCtrlQualidades;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "LAE_SEQ")
	public AelLaboratorioExternos getAelLaboratorioExternos() {
		return aelLaboratorioExternos;
	}

	public void setAelLaboratorioExternos(
			AelLaboratorioExternos aelLaboratorioExternos) {
		this.aelLaboratorioExternos = aelLaboratorioExternos;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "DDV_SEQ")
	public AelDadosCadaveres getAelDadosCadaveres() {
		return aelDadosCadaveres;
	}

	public void setAelDadosCadaveres(AelDadosCadaveres aelDadosCadaveres) {
		this.aelDadosCadaveres = aelDadosCadaveres;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CCT_CODIGO")
	public FccCentroCustos getFccCentroCustos() {
		return this.fccCentroCustos;
	}

	public void setFccCentroCustos(FccCentroCustos fccCentroCustos) {
		this.fccCentroCustos = fccCentroCustos;
	}
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ESP_SEQ")
	public AghEspecialidades getAghEspecialidades() {
		return this.aghEspecialidades;
	}

	public void setAghEspecialidades(AghEspecialidades aghEspecialidades) {
		this.aghEspecialidades = aghEspecialidades;
	}


	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "SER_MATRICULA", referencedColumnName = "MATRICULA", nullable = false),
			@JoinColumn(name = "SER_VIN_CODIGO", referencedColumnName = "VIN_CODIGO", nullable = false) })
	public RapServidores getServidor() {
		return this.servidor;
	}

	public void setServidor(RapServidores servidor) {
		this.servidor = servidor;
	}
	

	@Column(name = "ORIGEM_AMOSTRA", nullable = false, length = 1)
	@Enumerated(EnumType.STRING)
	public DominioOrigemAmostra getOrigemAmostra() {
		return this.origemAmostra;
	}

	public void setOrigemAmostra(DominioOrigemAmostra origemAmostra) {
		this.origemAmostra = origemAmostra;
	}

	@Column(name = "PRONTUARIO", precision = 8, scale = 0)
	public Integer getProntuario() {
		return this.prontuario;
	}

	public void setProntuario(Integer prontuario) {
		this.prontuario = prontuario;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DT_NASCIMENTO", length = 7)
	public Date getDtNascimento() {
		return this.dtNascimento;
	}

	public void setDtNascimento(Date dtNascimento) {
		this.dtNascimento = dtNascimento;
	}

	@Column(name = "SEXO", length = 1)
	@Enumerated(EnumType.STRING)
	public DominioSexo getSexo() {
		return this.sexo;
	}

	public void setSexo(DominioSexo sexo) {
		this.sexo = sexo;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CAD_SEQ")
	public AbsCandidatosDoadores getAbsCandidatosDoadores() {
		return absCandidatosDoadores;
	}

	public void setAbsCandidatosDoadores(AbsCandidatosDoadores absCandidatosDoadores) {
		this.absCandidatosDoadores = absCandidatosDoadores;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "AMD_DCA_BOL_NUMERO", referencedColumnName = "DCA_BOL_NUMERO"),
			@JoinColumn(name = "AMD_DCA_BOL_BSA_CODIGO", referencedColumnName = "DCA_BOL_BSA_CODIGO"),
			@JoinColumn(name = "AMD_DCA_BOL_DATA", referencedColumnName = "DCA_BOL_DATA"),
			@JoinColumn(name = "AMD_SEQP", referencedColumnName = "SEQP") })
	public AbsAmostraDoacao getAbsAmostraDoacao() {
		return this.absAmostraDoacao;
	}

	public void setAbsAmostraDoacao(AbsAmostraDoacao absAmostraDoacao) {
		this.absAmostraDoacao = absAmostraDoacao;
	}
}
