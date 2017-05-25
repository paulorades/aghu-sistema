package br.gov.mec.aghu.model;

// Generated 15/03/2012 09:48:20 by Hibernate Tools 3.4.0.CR1

import java.math.BigDecimal;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

import org.hibernate.annotations.Immutable;
import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.dominio.DominioSituacao;
import br.gov.mec.aghu.core.persistence.BaseEntityId;

/**
 * VAelGrade generated by hbm2java
 */
@Entity
@Table(name = "V_AEL_GRADE_AGHU", schema = "AGH")
@Immutable
public class VAelGrade extends BaseEntityId<VAelGradeId> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8199943950840316710L;
	private VAelGradeId id;
	private DominioSituacao sitGrade;
	private String descrGrupoEx;
	private String numSala;
	private String nomeFunc;
	private String sitGrupo;
	private Short sala;
	private BigDecimal grupoExame;
	private String siglaExame;
	private Integer matExame;
	private Short unfExame;
	private Integer matriculaSer;
	private Short vinculoSer;
	private Short salaSeq;
	


	public VAelGrade() {
	}

	public VAelGrade(VAelGradeId id) {
		this.id = id;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "grade", column = @Column(name = "GRADE", precision = 4, scale = 0)),
			@AttributeOverride(name = "seqGrade", column = @Column(name = "SEQ_GRADE", precision = 7, scale = 0)),
			@AttributeOverride(name = "sitGrupoEx", column = @Column(name = "SIT_GRUPO_EX", length = 1))})
	public VAelGradeId getId() {
		return this.id;
	}

	public void setId(VAelGradeId id) {
		this.id = id;
	}

	@Column(name = "SIT_GRADE", nullable = false, length = 1)
	@Enumerated(EnumType.STRING)
	public DominioSituacao getSitGrade() {
		return this.sitGrade;
	}

	public void setSitGrade(DominioSituacao sitGrade) {
		this.sitGrade = sitGrade;
	}

	@Column(name = "DESCR_GRUPO_EX", length = 60)
	@Length(max = 60)
	public String getDescrGrupoEx() {
		return this.descrGrupoEx;
	}

	public void setDescrGrupoEx(String descrGrupoEx) {
		this.descrGrupoEx = descrGrupoEx;
	}

	@Column(name = "NUM_SALA", length = 10)
	@Length(max = 10)
	public String getNumSala() {
		return this.numSala;
	}

	public void setNumSala(String numSala) {
		this.numSala = numSala;
	}

	@Column(name = "NOME_FUNC", length = 4000)
	@Length(max = 4000)
	public String getNomeFunc() {
		return this.nomeFunc;
	}

	public void setNomeFunc(String nomeFunc) {
		this.nomeFunc = nomeFunc;
	}

	@Column(name = "SIT_GRUPO", length = 1)
	@Length(max = 1)
	public String getSitGrupo() {
		return this.sitGrupo;
	}

	public void setSitGrupo(String sitGrupo) {
		this.sitGrupo = sitGrupo;
	}

	@Column(name = "SALA", precision = 4, scale = 0)
	public Short getSala() {
		return this.sala;
	}

	public void setSala(Short sala) {
		this.sala = sala;
	}
	
	@Column(name = "GRUPO_EXAME", precision = 22, scale = 0)
	public BigDecimal getGrupoExame() {
		return this.grupoExame;
	}

	public void setGrupoExame(BigDecimal grupoExame) {
		this.grupoExame = grupoExame;
	}
	
	@Column(name = "SIGLA_EXAME", length = 5)
	@Length(max = 5)
	public String getSiglaExame() {
		return this.siglaExame;
	}

	public void setSiglaExame(String siglaExame) {
		this.siglaExame = siglaExame;
	}
	
	@Column(name = "MAT_EXAME", precision = 5, scale = 0)
	public Integer getMatExame() {
		return this.matExame;
	}

	public void setMatExame(Integer matExame) {
		this.matExame = matExame;
	}

	@Column(name = "UNF_EXAME", precision = 4, scale = 0)
	public Short getUnfExame() {
		return this.unfExame;
	}

	public void setUnfExame(Short unfExame) {
		this.unfExame = unfExame;
	}

	@Column(name = "MATRICULA_SER", precision = 7, scale = 0)
	public Integer getMatriculaSer() {
		return this.matriculaSer;
	}

	public void setMatriculaSer(Integer matriculaSer) {
		this.matriculaSer = matriculaSer;
	}

	@Column(name = "VINCULO_SER", precision = 3, scale = 0)
	public Short getVinculoSer() {
		return this.vinculoSer;
	}

	public void setVinculoSer(Short vinculoSer) {
		this.vinculoSer = vinculoSer;
	}

	@Column(name = "SALA_SEQ", precision = 3, scale = 0)
	public Short getSalaSeq() {
		return this.salaSeq;
	}

	public void setSalaSeq(Short salaSeq) {
		this.salaSeq = salaSeq;
	}
	
	public enum Fields {

				SEQ_GRADE("id.seqGrade"),GRADE("id.grade"),SALA_SEQ("salaSeq"),DESC_GRUPO("descrGrupoEx"),
				SIGLA_EXAME("siglaExame"),NOME_FUNC("nomeFunc"),SIT_GRADE("sitGrade"),SIT_GRUPO_EX("id.sitGrupoEx");

		private String fields;

		private Fields(String fields) {
			this.fields = fields;
		}

		@Override
		public String toString() {
			return this.fields;
		}
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
		if (this == obj){
			return true;
		}
		if (obj == null){
			return false;
		}
		if (getClass() != obj.getClass()){
			return false;
		}
		VAelGrade other = (VAelGrade) obj;
		if (id == null) {
			if (other.id != null){
				return false;
			}
		} else if (!id.equals(other.id)){
			return false;
		}
		return true;
	}

	
	
	
}