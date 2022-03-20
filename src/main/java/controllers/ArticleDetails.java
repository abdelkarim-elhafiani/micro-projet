package controllers;

import jdbc.CrudImp;
import models.Article;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet(name = "Article", value = "/article")
public class ArticleDetails extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        CrudImp crudImpl = new CrudImp();
        Article article = null;
        try {
            article = crudImpl.getArticleByNum(Integer.parseInt(request.getParameter("num")));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        request.setAttribute("article",article);
        request.getRequestDispatcher("article.jsp").forward(request, response);


    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
