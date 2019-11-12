/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sd.ativiadethread.pkg1;

import dao.DadoDAO;
import java.sql.SQLException;
import modelo.Dado;

/**
 *
 * @author caique
 */
public class SDAtiviadeThread1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException {
        // TODO code application logic here

        DadoDAO dao = new DadoDAO();

        int cont = 1;
        long t0 = System.currentTimeMillis();
        while (cont <= 10000) {
            Dado ex = new Dado(cont);

            try {
                dao.insert(ex);
                dao.update(ex.getID());
                dao.delete(ex.getID());
                cont++;
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        long t1 = System.currentTimeMillis();
        long tempoTotal = t1 - t0;

        System.out.println("Tempo : " + tempoTotal);
    }

}
