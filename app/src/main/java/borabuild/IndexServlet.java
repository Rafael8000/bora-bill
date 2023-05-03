package borabuild;

 import java.io.IOException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name="IndexServlet", urlPatterns = "/")
public class IndexServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException  {
       // response.getWriter().println("Oi servlet");
       // response.getWriter().close();
       request.getRequestDispatcher("home.jsp").forward(request, response);
    }
    
}
