import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "ViewProfileServlet", urlPatterns = "/profile")
public class ViewProfileServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        HttpSession session = request.getSession();

        // Setting request object attr named "username" with the value of the session attr named "user"
//        String username = (String) session.getAttribute("user");
//        request.setAttribute("username", username);

        if (session.getAttribute("user") == null) {
            response.sendRedirect("/login");
            return;
        } else {
            request.getRequestDispatcher("/WEB-INF/profile.jsp").forward(request, response);
        }

    }

}
