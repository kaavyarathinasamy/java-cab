package org.web.servelet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//import org.web.serv.UsersService;
import org.web.service.SignupService;

/**
 * Servlet implementation class signupServelet
 */
@WebServlet("/signupServelet")
public class SignupServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SignupServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try(PrintWriter out=response.getWriter()){
			String name=request.getParameter(name);
			String username=request.getParameter(username);
			String password=request.getParameter(password);
			String emailid=request.getParameter(emailid);
			//studentId = Integer.parseInt(request.getParameter("StudentId"));
			long uphno=Long.parseLong(request.getParameter("uphno"));
			long gphno=Long.parseLong(request.getParameter("gphno"));
			String dateofbirth=request.getParameter(dateofbirth);
			String gender=request.getParameter(gender);
			if (username == null || username.isEmpty() || password == null || password.isEmpty() || name == null || name.isEmpty()||emailid == null || emailid.isEmpty() ||uphno == null || uphno.isEmpty() ||gphno == null || gphno.isEmpty() ||dateofbirth == null || dateofbirth.isEmpty() ||gender == null || gender.isEmpty()) {
				out.println("user's details are needed to be filled  provide this service");
			} else {
				SignupService.insert(username, password, name,emailid,uphno,gphno,dateofbirth,gender);
				out.println("User Registered. <a href='signup.html'>Login</a> with new user here");
			}
		}
	}
}
