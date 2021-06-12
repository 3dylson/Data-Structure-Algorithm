package trab1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Edylson
 */
public class MIntegrado extends Membro {

    private double saldo;

    public MIntegrado(int i, String n) {
        super(i, n);
        saldo = 0;
    }

    @Override
    public boolean adicionarAoSaldo(double val) {
        if (val < 0) {
            System.out.println("Saldo nao adicionado valor invalido: " + val);
            return false;

        } else {
            saldo += val;
            System.out.println("Saldo adicionado ao MIntegrado val: " + val);
            return true;
        }
    }

    @Override
    public String toString() {
        return super.toString() + " - Membro Integrado -" + " Saldo: " + saldo;
    }

}
