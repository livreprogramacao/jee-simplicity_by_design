/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.livre_programacao.pessoa.entity;

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
    private String cpf;
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
}
