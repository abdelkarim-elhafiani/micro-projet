package jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import models.Article;
import models.Categorie;
import models.Client;


public class CrudImp implements Crud{
    @Override
    public int insertClient(Client c ) {
        Connexion cn = new Connexion();

        Statement stm = cn.getStm();
        int rt2 = 0;
        try {
                String sql2 = "INSERT INTO client (nom,prenom,email,adresse,motPass) VALUES('"+ c.getNom() + "','" + c.getPrenom() + "','" + c.getEmail()+"','" +c.getAdresse()+ "','" +c.getMotPasse()+"');";
                rt2 = stm.executeUpdate(sql2);
            

        } catch (Exception e) {
            e.printStackTrace();
        }
        return rt2;

    }
    @Override
    public Client login(String nom, String password) throws SQLException {
        Connexion cn = new Connexion();

        Statement stm = cn.getStm();
        String sql1 = "Select nom,motPass from client where  nom='"+nom+"' and motPass='"+password+"';";
        ResultSet result=stm.executeQuery(sql1);
        if(result.next()){
            System.out.println("eala slamtek");
        }
        System.out.println("teste");

        return null;



    }

    @Override
    public Article getArticleByNum(int num) throws SQLException {
        Connexion cn = new Connexion();

        Statement stm = cn.getStm();
        String sql1 = "Select * from article where codeArticle="+num+";";
        ResultSet result=stm.executeQuery(sql1);
        if(result.next()){
            return new Article(result.getInt("codeArticle"),result.getString("designation"),result.getInt("prix"),result.getInt("stock"),new Categorie(result.getString("categorie")),result.getString("photo"));
        }
        System.out.println("no article");

        return null;
    }


}
