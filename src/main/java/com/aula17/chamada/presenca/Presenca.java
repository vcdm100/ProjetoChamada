package com.aula17.chamada.presenca;

import com.aula17.chamada.aluno.Aluno;
import com.aula17.chamada.turma.Turma;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import jakarta.persistence.Table;

@Table(name = "presencas")
@Entity(name = "Presenca")
public class Presenca {
	
	@Id @GeneratedValue(strategy = GenerationType.UUID)
	private String id;
	private boolean falta = false;
	
	@Column(insertable=false, updatable=false)
	private String aluno_id;
	
	@Column(insertable=false, updatable=false)
	private String turma_id;
	
	public Presenca () {
		
	}
	
	@ManyToOne() 
	@MapsId("alunoId")
	@JoinColumn(name="aluno_id") 
	private Aluno aluno;
	
	@ManyToOne() 
	@MapsId("turmaId")
	private Turma turma;
	
	public Aluno getAluno() {
		return this.aluno;
	}
	
	public Turma getTurma() {
		return this.turma;
	}
	
	public String getId() {
		return id;
	}
	
	public Presenca(ChamadaPresenca dados) {
		this.setFalta(dados.falta());
	}

	public boolean getFalta() {
		return falta;
	}

	public void setFalta(boolean falta) {
		this.falta = falta;
	}
	
}
