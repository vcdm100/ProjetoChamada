package com.aula17.chamada.matricula;

import com.aula17.chamada.aluno.Aluno;
import com.aula17.chamada.matricula.DTO.DadosCadastroMatricula;
import com.aula17.chamada.turma.Turma;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import jakarta.persistence.Table;

@Table(name = "matriculas")
@Entity(name = "Matricula")
public class Matricula {
	
	@Id @GeneratedValue(strategy = GenerationType.UUID)
	private String id;
	
	@Column(insertable=false, updatable=false)
	private String aluno_id;
	
	@Column(insertable=false, updatable=false)
	private String turma_id;
	
	@ManyToOne() 
	@MapsId("alunoId")
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
	
	public Matricula() {
		
	}
	
	public Matricula(DadosCadastroMatricula dados) {
		this.turma_id = dados.turma_id();
		this.aluno_id = dados.aluno_id();
	}
}
