package jdbc;


import models.Article;
import models.Client;

import java.sql.SQLException;

public interface Crud {
     int insertClient(Client c );
     Client login(String nom,String prenom) throws SQLException;

    Article getArticleByNum(int num) throws SQLException;
}
