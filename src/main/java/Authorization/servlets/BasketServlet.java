package Authorization.servlets;

import Authorization.model.Basket;
import Authorization.model.Book;
import Authorization.storage.BooksInMemoryStorage;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/basket")
public class BasketServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("id");
        Book byId = BooksInMemoryStorage.getById(Integer.parseInt(id));
        Basket basket = (Basket) req.getSession().getAttribute("basket");
        basket.addBook(byId);
       getServletContext().getRequestDispatcher("/home").forward(req,resp);
    }
}
