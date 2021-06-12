/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trab1;

import java.util.LinkedHashSet;

/**
 *
 * @author Edylson
 */
public abstract class Membro {
    protected int id;
    private String nome;
    private LinkedHashSet<Projeto> projetos;

    public Membro(int i, String n) {
        nome = n;
        id = i;
        projetos = new LinkedHashSet<>();
    }

    public boolean associarProjeto(Projeto p) {

        System.out.println("Projeto: " + p + " associado ao membro: " + this.nome + " id: " + this.id);
        projetos.add(p);
        return p.associarMembro(this);
    }

    public abstract boolean adicionarAoSaldo(double val);

    @Override
    public String toString() {
        return "Membro id:" + id + ", nome: " + nome;
    }

}
