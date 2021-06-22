package frgp.utn.edu.ar.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import frgp.utn.edu.ar.models.Usuario;
import frgp.utn.edu.ar.Servicios.UsuarioService;
import frgp.utn.edu.ar.ServiciosImpl.UsuarioServiceImpl;


public class LoginServlet extends HttpServlet {
	
    private static final long serialVersionUID = 1L;
    
	private UsuarioService usuarioService  = new UsuarioServiceImpl() ;

       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		  
		String usr = request.getParameter("username");
		String pss = request.getParameter("password");
	    try {
	    	Usuario usuarioValid = usuarioService.getUser(new Usuario(usr,pss));
	    	
	    	if(usuarioValid!=null){
	    		response.sendRedirect("/success.jp");
	    	}else {
	    		response.sendRedirect("/error.jp");
	    	}
			
		} catch (Exception e) {
			   e.printStackTrace();
		}
		
	}


}
