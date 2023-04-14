package svl;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;


public class svlPresidencial extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public svlPresidencial() {
        super();
        // TODO Auto-generated constructor stub
    }

    private void processRequest(HttpServletRequest request, HttpServletResponse response) throws IOException {
    	response.setCharacterEncoding("UTF-8");
        HttpSession session = request.getSession();
    	dao.OnpeDAO daoOnpe =new dao.OnpeDAO();

        String id = request.getParameter("id");
        Object data = null;

        data = daoOnpe.getPresidencial();

        session.setAttribute("id", id);
        session.setAttribute("data",data);
        
        response.sendRedirect("presidencial.jsp");
	}
    

    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		processRequest(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		processRequest(request, response);
	}

}
