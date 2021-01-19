package Authorization.servlets;

import Authorization.model.Person;
import Authorization.storage.InMemory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet(urlPatterns = "/all")
public class FindAllPerson extends HttpServlet {
  private final  InMemory memory=new InMemory();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        ArrayList<Person> personArrayList= (ArrayList<Person>) memory.AllPerson();
        req.getSession().setAttribute("personList",personArrayList);
        getServletContext().getRequestDispatcher("/pagesAuthorization/PersonList.jsp").forward(req,res);
    }
}
