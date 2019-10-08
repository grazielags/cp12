package br.com.voffice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
 
@Table(name="livro")
@Entity
public class LivroModel {
 
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private Integer id;
 
	private String nome;

	private String autor;

	@Column(name="ano_edicao")
	private Integer anoEdicao;

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public Integer getAnoEdicao() {
		return anoEdicao;
	}
	public void setAnoEdicao(Integer anoEdicao) {
		this.anoEdicao = anoEdicao;
	}
 
}