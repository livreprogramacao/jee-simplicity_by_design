/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.livre_programacao.pessoa.entity;

import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.SEQUENCE;
import javax.persistence.Id;

/**
 *
 * @author user
 */
public class Pessoa {
    
    @Id 
    @GeneratedValue(strategy = SEQUENCE, generator = "PESSOA_SEQ") 
    @Column(name = "PESSOA_ID", nullable = false)
    private Long id;
    
    private String nome;
    private String endereco;
    private String complemento;
    private String cidade;
    private String estado;
    private String cep;
    private String telefone;
    private String cpf;// JPA specification
    private String rg;
    private String hobby1;
    private String hobby2;
    private String hobby3;
    private String hobby4;
    private String hobby5;
    private String esporte1;
    private String esporte2;
    private String esporte3;
    private String esporte4;
    private String esporte5;
    private String alimento1;
    private String alimento2;
    private String alimento3;
    private String alimento4;
    private String alimento5;

    public Pessoa() {
        // JPA specification
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + Objects.hashCode(this.id);
        return hash;
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
        final Pessoa other = (Pessoa) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "id=" + id + ", nome=" + nome + ", endereco=" + endereco + ", complemento=" + complemento + ", cidade=" + cidade + ", estado=" + estado + ", cep=" + cep + ", telefone=" + telefone + ", cpf=" + cpf + ", rg=" + rg + ", hobby1=" + hobby1 + ", hobby2=" + hobby2 + ", hobby3=" + hobby3 + ", hobby4=" + hobby4 + ", hobby5=" + hobby5 + ", esporte1=" + esporte1 + ", esporte2=" + esporte2 + ", esporte3=" + esporte3 + ", esporte4=" + esporte4 + ", esporte5=" + esporte5 + ", alimento1=" + alimento1 + ", alimento2=" + alimento2 + ", alimento3=" + alimento3 + ", alimento4=" + alimento4 + ", alimento5=" + alimento5 + '}';
    }

}
