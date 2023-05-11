package com.aula17.chamada.turma;

import com.aula17.chamada.professor.*;
import com.aula17.chamada.aluno.DadosCadastroAluno;
import com.aula17.chamada.aluno.DadosListagemAluno;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Table(name = "turmas")
@Entity(name = "Turma")
public class Turma {
	
	@Id @GeneratedValue(strategy = GenerationType.UUID)
	private String id;
	private String modulo;

	@Column(insertable=false, updatable=false)
	private String professor_id;
	
	public Turma() {
		
	}

	public Turma(DadosCadastroTurma dados) {
		this.modulo = dados.modulo();
	}

	public String getModulo() {
		return modulo;
	}

	public void setModulo(String modulo) {
		this.modulo = modulo;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getId() {
		return id;
	}

	public void atualizarNome(DadosListagemTurma dados) {
		this.modulo = dados.modulo();
	}

	// Relaciomento (Muitos para um) com a Class Professor
	@ManyToOne() 
	@JoinColumn(name="professor_id") 
	private Professor professor;
	
	//Precisamos do metodo get para retornar (mostrar) a informaçâo
	public Professor getProfessor() {
		return this.professor;
	}
}
