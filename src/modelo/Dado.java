/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author caique
 */
public class Dado {

    private int ID;
    private boolean UP;
    private boolean DE;

    public Dado(int ID, boolean UP, boolean DE) {
        this.ID = ID;
        this.UP = UP;
        this.DE = DE;
    }

    public Dado(int ID) {
        this.ID = ID;

    }

    public Dado() {

    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public boolean isUP() {
        return UP;
    }

    public void setUP(boolean UP) {
        this.UP = UP;
    }

    public boolean isDE() {
        return DE;
    }

    public void setDE(boolean DE) {
        this.DE = DE;
    }

    @Override
    public String toString() {
        return "Dado{" + "ID=" + ID + ", UP=" + UP + ", DE=" + DE + '}';
    }

}
