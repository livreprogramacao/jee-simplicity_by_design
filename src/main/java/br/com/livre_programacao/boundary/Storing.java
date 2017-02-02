/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.livre_programacao.boundary;

import br.com.livre_programacao.control.PessoaStore;
import br.com.livre_programacao.pessoa.entity.Pessoa;
import javax.ejb.Asynchronous;
import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 *
 * @author user
 */
@Stateless
public class Storing {

    @Inject
    PessoaStore pessoaStore;

    @Asynchronous
    public void store(Pessoa formulario) {
        System.out.format("\n=== Debug ===\nStoring.store() : Pessoa %s", formulario);
        pessoaStore.store(formulario);
    }

}