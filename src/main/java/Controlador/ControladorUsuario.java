package Controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.ClassUsuarioImp;
import model.TblUsuariocl2;

/**
 * Servlet implementation class ControladorUsuario
 */
@WebServlet("/login")
public class ControladorUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControladorUsuario() {
        super();
        // TODO Auto-generated constructor stub
    }//fin del controlador

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("FormLogin.jsp").forward(request, response);
	}//fin del metodo doget

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ClassUsuarioImp crud = new ClassUsuarioImp();

        String usuario = request.getParameter("usuario");
        String password = request.getParameter("password");

        TblUsuariocl2 user = crud.validarUsuario(usuario, password);
        if(user !=null){
            request.getRequestDispatcher("index.jsp").forward(request, response);
        }else{
            request.setAttribute("error", "Usuario o contraseņa incorrectos");
            request.getRequestDispatcher("FormLogin.jsp").forward(request, response);
        }
	}//fin del metodo dopost

}
