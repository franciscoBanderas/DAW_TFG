package controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/logout")
public class Logout extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
        throws ServletException, IOException {
        
        // Get the session associated with this request, if it exists
        HttpSession session = request.getSession(false);
        
        // Invalidate the session if it exists
        if (session != null) {
            session.invalidate();
        }
        
        // Redirect the user to a login page or any other appropriate page after logout
        response.sendRedirect("Login.jsp");
    }
}
