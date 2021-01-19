package Authorization.servlets;

import Authorization.model.Person;
import Authorization.storage.InMemory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/reg",name = "RegistrationServlet")
public class RegistrationServlet extends HttpServlet {
    final private static InMemory memory=new InMemory();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        String name=req.getParameter("name");
        String surname=req.getParameter("surname");
        String age=req.getParameter("age");
        String location=req.getParameter("country");
        String login=req.getParameter("login");
        String password=req.getParameter("password");

        Person person=new Person(name,surname,Integer.parseInt(age),login,password,location);
            memory.addPerson(person);
           res.sendRedirect("/home");


    }
}
