package main;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="cliente")

public class Cliente implements Serializable {
	private static final long serialVersionUID = 1L;
	@Column(name = "id_Cliente")
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idCliente;
	
	@Column
	private String nome;
	
	@Column(length = 15, unique = true)
	private String cpf;
	
	@Column
	private String email;
	
	@Column
	private String bairro;
	
	@Column
	private String datanasc;
	
	@Column
	private String telefone;
	
	@Column
	private String sexo;
	
	public Cliente() {
		// TODO Auto-generated constructor stub
	}

	public Cliente(Long idCliente, String nome, String cpf, String email, String bairro, String datanasc,
			String telefone, String sexo) {
		super();
		this.idCliente = idCliente;
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
		this.bairro = bairro;
		this.datanasc = datanasc;
		this.telefone = telefone;
		this.sexo = sexo;
	}

	public Long getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Long idCliente) {
		this.idCliente = idCliente;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getDatanasc() {
		return datanasc;
	}

	public void setDatanasc(String datanasc) {
		this.datanasc = datanasc;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	@Override
	public String toString() {
		return "Cliente [idCliente=" + idCliente + ", nome=" + nome + ", cpf=" + cpf + ", email=" + email + ", bairro="
				+ bairro + ", datanasc=" + datanasc + ", telefone=" + telefone + ", sexo=" + sexo + "]";
	}
	
	
	
	
	
	
	
	
	

}
