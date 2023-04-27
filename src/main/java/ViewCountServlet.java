import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ViewCountServlet", urlPatterns = "/count")
public class ViewCountServlet extends HttpServlet {

    private int count = 0;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();

        String reset = req.getParameter("reset");

        if (reset != null) {
            count = 0;
        } else {
            count++;
        }
        out.printf("<h1>Count: %d\n</h1>", count);
    }
}
