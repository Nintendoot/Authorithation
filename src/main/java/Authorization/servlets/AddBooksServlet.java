package Authorization.servlets;

import Authorization.model.Author;
import Authorization.model.Book;
import Authorization.storage.AuthorsInMemoryStorage;
import Authorization.storage.BooksInMemoryStorage;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet(urlPatterns = "/addBooks", name = "/servles/AddBooksServlet")
public class AddBooksServlet extends HttpServlet {
    AuthorsInMemoryStorage authors = AuthorsInMemoryStorage.getInstance();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ArrayList<Author> authors = AuthorsInMemoryStorage.getInstance().getAllAuthors();
        req.setAttribute("authors", authors);
        getServletContext().getRequestDispatcher("/pagesBooks/addBooks.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            String name = req.getParameter("name");
            String genre = req.getParameter("genre");
            String discription = req.getParameter("discription");
            int id = Integer.parseInt(req.getParameter("id"));
            String img = req.getParameter("img");

            if (AuthorsInMemoryStorage.getAuthorById(id) != null) {

                BooksInMemoryStorage.createBook(name, genre, discription, AuthorsInMemoryStorage.getAuthorById(id), img);
                resp.sendRedirect("/home");
            } else {
                resp.sendRedirect("/addAuthor");
            }
        } catch (NumberFormatException e) {

        }


    }
}
