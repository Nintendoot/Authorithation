package Authorization.servlets;

import Authorization.model.Author;
import Authorization.storage.AuthorsInMemoryStorage;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/linkAuthor")
public class linkAuthorServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id=Integer.parseInt(req.getParameter("id"));
        Author author=AuthorsInMemoryStorage.getAuthorById(id);
        req.setAttribute("Author",author);
        getServletContext().getRequestDispatcher("/pagesBooks/AuthorView.jsp").forward(req,resp);
    }

}
