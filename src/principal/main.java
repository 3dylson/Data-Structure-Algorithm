/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import trab1.CI;

/**
 * @ @author Edylson
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CI ci = new CI();

        ci.addColaborador(0, "Pedro");
        ci.addColaborador(1, "Luis");
        ci.addColaborador(2, "José");

        ci.addMIntegrado(3, "Carla");
        ci.addMIntegrado(4, "Carlos");
        ci.addMIntegrado(5, "Joao");

        ci.addProjeto(0, 5000.0);
        ci.addProjeto(1, 200.56);

        ci.associarMembroAProjeto(3, 0);
        ci.associarMembroAProjeto(4, 0);
        ci.associarMembroAProjeto(1, 0);
        ci.associarMembroAProjeto(0, 1);
        ci.associarMembroAProjeto(2, 1);
        ci.associarMembroAProjeto(5, 1);

        ci.distribuirVerbaPorMIntegrados(0);
        ci.distribuirVerbaPorMIntegrados(1);

        // ci.membrostoString();

        System.out.println(ci.membrostoString().replace(",", "\n"));

    }

}
