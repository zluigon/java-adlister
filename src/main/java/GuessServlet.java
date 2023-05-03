import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;

@WebServlet(name = "GuessServlet", urlPatterns = "/guess")
public class GuessServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("./guess.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String guess = req.getParameter("guess");
        int num = (int) (Math.random() * 3) + 1;
        String numStr = Integer.toString(num);

        System.out.println("numStr = " + numStr);

        String[] limit = {"1", "2", "3"};
        int index = Arrays.asList(limit).indexOf(guess);
        System.out.println("index = " + index);

        if (index != -1) {
            if (guess.equals(numStr)) {
                resp.sendRedirect("/correct");
            } else {
                resp.sendRedirect("/incorrect");
            }
        } else {
            resp.sendRedirect("/guess");
        }
    }
}
