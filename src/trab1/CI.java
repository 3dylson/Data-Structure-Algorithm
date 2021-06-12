/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trab1;

import java.util.TreeMap;

/**
 *
 * @author Edylson Frederico | nº: 39221 | Engenharia Informática
 * 
 */
public class CI {

    private TreeMap<Integer, Membro> membros;
    private TreeMap<Integer, Projeto> projetos;

    public CI() {

        membros = new TreeMap<>();
        projetos = new TreeMap<>();
    }

    /**
     * Adiciona proj
     * 
     * @param id  proj id
     * @param fin proj financiamento
     */
    public void addProjeto(int id, double fin) {
        if (!projetos.containsKey(id)) {

            projetos.put(id, new Projeto(id, fin));
            System.out.println("Projeto " + id + ", financiamento: " + fin + " adicionado!");
        } else {
            System.out.println("Projeto " + id + ", ja existe!");
        }
    }

    /**
     * Adiciona Membros Integrados
     * 
     * @param id   MI id
     * @param nome Membro Int
     */

    public boolean addMIntegrado(int id, String nome) {
        if (membros.containsKey(id)) {

            System.out.println("Membro id: " + id + ", ja existe!");
            return false;
        } else {

            membros.put(id, new MIntegrado(id, nome));
            System.out.println("M. Integrado id: " + id + ", nome: " + nome + " adicionado");
            return true;
        }
    }

    /**
     * Adiciona Colaborador
     * 
     * @param id  Colaborador id
     * @param fin Nome Colaborador
     */
    public boolean addColaborador(int id, String nome) {
        if (membros.containsKey(id)) {

            System.out.println("Membro id: " + id + ", ja existe!");
            return false;
        } else {
            membros.put(id, new Colaborador(id, nome));
            System.out.println("Colaborador id: " + id + ", nome: " + nome + " adicionado");
            return true;
        }
    }

    /**
     * Adiciona Membro ao proj
     * 
     * @param idMemb id do membro
     * @param idProj id do Projeto
     */
    public boolean associarMembroAProjeto(int idMemb, int idProj) {
        if (membros.containsKey(idMemb) && projetos.containsKey(idProj)) {
            Membro m = membros.get(idMemb);
            Projeto p = projetos.get(idProj);

            m.associarProjeto(p);

            return true;
        } else {
            System.out.println("Membro ou Projeto nao existe!");
            return false;
        }

    }

    /**
     * Divisão da verba por MIntegrados
     * 
     * @param idProj id do Projeto
     */

    public boolean distribuirVerbaPorMIntegrados(int idProj) {
        if (projetos.containsKey(idProj)) {
            Projeto p = projetos.get(idProj);

            p.distribuirVerbaPorMIntegrados();

            return true;
        } else {
            System.out.println("Projeto nao existe! ID: " + idProj);
            return false;
        }

    }

    public String membrostoString() {

        return membros.values().toString();
    }

}
