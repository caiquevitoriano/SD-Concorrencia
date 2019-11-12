/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import modelo.Dado;

/**
 *
 * @author caique
 */
public class DadoDAO {

    public void insert(Dado dado) throws SQLException, ClassNotFoundException {
        Connection con = null;
        try {
            con = ConFactory.getConnection();
            String sql = "INSERT INTO dado (id, up, de) VALUES (?,?,?)";
            PreparedStatement statement = con.prepareStatement(sql);
            statement.setInt(1, dado.getID());
            statement.setBoolean(2, false);
            statement.setBoolean(3, false);

            statement.executeUpdate();
        } finally {
            if (con != null) {
                con.close();
            }
        }
    }

    public void update(int id) throws SQLException, ClassNotFoundException {
        Connection con = null;
        try {
            con = ConFactory.getConnection();
            String sql = "UPDATE dado SET up=? WHERE id=? ";
            PreparedStatement statement = con.prepareStatement(sql);
            statement.setBoolean(1, true);
            statement.setInt(2, id);

            statement.executeUpdate();
        } finally {
            if (con != null) {
                con.close();
            }
        }
    }

    public void delete(int id) throws SQLException, ClassNotFoundException {
        Connection con = null;
        try {
            con = ConFactory.getConnection();
            String sql = "UPDATE dado SET de=? WHERE id=?";
            PreparedStatement statement = con.prepareStatement(sql);
            statement.setBoolean(1, true);
            statement.setInt(2, id);
            statement.executeUpdate();
        } finally {
            if (con != null) {
                con.close();
            }
        }
    }

}
