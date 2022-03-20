package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


public class Connexion {
    private Connection conn;
    private Statement stm;

    public Connection getConn() {
        return conn;
    }

    public Statement getStm() {
        return stm;
    }

    public Connexion(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/microproject","root","karimHF77814");
            stm=conn.createStatement();
        }catch(Exception e){
            e.printStackTrace();;
        }
    }
}
