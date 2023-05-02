import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;

@WebServlet(name = "PizzaOrderServlet", urlPatterns = "/pizza-order")
public class PizzaOrderServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("./pizza-order.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String size = req.getParameter("size");
        String crust = req.getParameter("crust");
        String sauce = req.getParameter("sauce");
        String[] toppings  = req.getParameterValues("toppings");
        String address = req.getParameter("address");

        System.out.println("size = " + size);
        System.out.println("crust = " + crust);
        System.out.println("sauce = " + sauce);
        System.out.println("toppings = " + Arrays.toString(toppings));
        System.out.println("address = " + address);

        req.getRequestDispatcher("./pizza-order.jsp").forward(req,resp);
    }
}
