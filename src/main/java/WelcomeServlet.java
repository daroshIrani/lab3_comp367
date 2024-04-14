import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/welcome") // This annotation maps the servlet to the URL pattern /welcome
public class WelcomeServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
       
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Set response content type
        response.setContentType("text/html");

        // Get PrintWriter object
        PrintWriter out = response.getWriter();

        // Write HTML response content
        out.println("<html><body>");
        out.println("<h1>Welcome to COMP367</h1>");
        out.println("</body></html>");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // For POST requests, simply call the doGet() method to handle the response
        doGet(request, response);
    }
}
