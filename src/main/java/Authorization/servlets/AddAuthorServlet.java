package Authorization.servlets;

import Authorization.model.Book;
import Authorization.storage.AuthorsInMemoryStorage;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/addAuthor")
public class AddAuthorServlet extends HomeServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.sendRedirect("/pagesBooks/addAuthor.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       String name=req.getParameter("name");
       String surname=req.getParameter("surname");
       String discription=req.getParameter("discription");


        AuthorsInMemoryStorage.createAuthor(name,surname,discription);
        resp.sendRedirect("/addBooks");
    }
}
