/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trab1;

/**
 *
 * @author Edylson
 */
public class Colaborador extends Membro {

    public Colaborador(int i, String n) {
        super(i, n);
    }

    @Override
    public boolean adicionarAoSaldo(double val) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public String toString() {
        return super.toString() + " - Colaborador";
    }

}
