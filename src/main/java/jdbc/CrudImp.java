package jdbc;

import java.sql.Connection;
import java.sql.Statement;
import java.util.List;

import models.Client;


public class CrudImp implements Crud{
    @Override
    public int insertClient(Client c ) {
        Connexion cn = new Connexion();
        Connection conn = cn.getConn();
        Statement stm = cn.getStm();
        int rt2 = 0;
        try {
          
                String sql = "USE microproject ";
                int rt1 = stm.executeUpdate(sql);
                String sql2 = "INSERT INTO client (nom,prenom,email,adresse,motPass) VALUES('"+ c.getNom() + "','" + c.getPrenom() + "','" + c.getEmail()+ "','" +c.getMotPasse()+"');";
                rt2 = stm.executeUpdate(sql2);
            
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rt2;

    }

}
