package Controlador;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.ClassProductoImp;
import model.TblProductocl2;

/**
 * Servlet implementation class ControladorProducto
 */
public class ControladorProducto extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControladorProducto() {
        super();
        // TODO Auto-generated constructor stub
    }//fin del controlador

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		TblProductocl2 producto=new TblProductocl2();
		ClassProductoImp crud=new ClassProductoImp();
		List<TblProductocl2> listadoproducto=crud.ListadoProducto();
		request.setAttribute("listadodeproductos", listadoproducto);
		request.getRequestDispatcher("/ListarProducto.jsp").forward(request, response);
	}//fin del metodo doget

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
		//recuperamos valores del formulario
		String nombre=request.getParameter("nombre");
		Double precioVen=Double.parseDouble(request.getParameter("precioVen"));
		Double precioCos=Double.parseDouble(request.getParameter("precioCos"));
		String estado=request.getParameter("estado");
		String descrip=request.getParameter("descrip");
		//instanciar
		TblProductocl2 producto=new TblProductocl2();
		ClassProductoImp crud=new ClassProductoImp();
		//asignamos valores
		producto.setNombrecl2(nombre);
		producto.setPrecioventacl2(precioVen);
		producto.setPreciocompcl2(precioCos);
		producto.setEstadocl2(estado);
		producto.setDescripcl2(descrip);
		crud.RegistrarProducto(producto);
		List<TblProductocl2> listadoprod=crud.ListadoProducto();
		request.setAttribute("listado", listadoprod);
		request.getRequestDispatcher("/RegistrarProducto.jsp").forward(request, response);
		
	}//fin del metodo dopost

}
