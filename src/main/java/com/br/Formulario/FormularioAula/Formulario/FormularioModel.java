package com.br.Formulario.FormularioAula.Formulario;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class FormularioModel {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long Id;
  private String Nomes;
  private String Cpf;
  private Integer Telefone;

  public FormularioModel(Long id, String nomes, String cpf, Integer telefone) {
    Id = id;
    Nomes = nomes;
    Cpf = cpf;
    Telefone = telefone;
  }

  public FormularioModel() {
  }

  public Long getId() {
    return Id;
  }

  public void setId(Long id) {
    Id = id;
  }

  public String getNomes() {
    return Nomes;
  }

  public void setNomes(String nomes) {
    Nomes = nomes;
  }

  public String getCpf() {
    return Cpf;
  }

  public void setCpf(String cpf) {
    Cpf = cpf;
  }

  public Integer getTelefone() {
    return Telefone;
  }

  public void setTelefone(Integer telefone) {
    Telefone = telefone;
  }

  @Override
  public String toString() {
    return "FormularioModel{" +
            "Id=" + Id +
            ", Nomes='" + Nomes + '\'' +
            ", Cpf='" + Cpf + '\'' +
            ", Telefone=" + Telefone +
            '}';
  }
}
