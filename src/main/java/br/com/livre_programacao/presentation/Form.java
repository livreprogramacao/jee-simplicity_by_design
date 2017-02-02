/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.livre_programacao.presentation;

import br.com.livre_programacao.boundary.Storing;
import br.com.livre_programacao.pessoa.entity.Pessoa;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author user
 */
@Named
@RequestScoped
public class Form {

    @Inject
    Storing ms;

    private Pessoa formulario = new Pessoa();

    public List<Pessoa> getFormularios() {
        return ms.getFormularios();
    }

    public Pessoa getFormulario() {
        //System.out.println("getFormulario()");
        return formulario;
    }

    public void save() {
        System.out.format("\n=== Debug ===\nForm.save() : Pessoa %s", formulario);
        ms.store(formulario);
    }

}
