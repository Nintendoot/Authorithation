package Authorization.servlets;

import Authorization.model.Book;
import Authorization.storage.BooksInMemoryStorage;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet(urlPatterns = "/home")
public class HomeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
     ArrayList<Book> books=BooksInMemoryStorage.getInstance().getAllBook();
     req.setAttribute("books",books);
        getServletContext().getRequestDispatcher("/pagesAuthorization/index.jsp").forward(req,resp);
    }


}
