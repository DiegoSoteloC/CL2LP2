package TestEntidades;

import java.util.List;

import Dao.ClassProductoImp;
import model.TblProductocl2;

public class TestEntidadProducto {
	
	public static void main(String[] args) {
        TblProductocl2 producto= new TblProductocl2();
 	    ClassProductoImp crud = new ClassProductoImp();
 	    /*
        producto.setNombrecl2("teclado");
        producto.setPrecioventacl2(10.20);
        producto.setPreciocompcl2(5.50);
        producto.setEstadocl2("disponible");
        producto.setDescripcl2("con rgb");

        crud.RegistrarProducto(producto);
		*/
 	    
 	    List<TblProductocl2> listado=crud.ListadoProducto();
 	    for(TblProductocl2 lis:listado){
 	    	System.out.println("nombre: "+lis.getNombrecl2()+"precioCos: "+lis.getPreciocompcl2()+"precioVen: "+lis.getPrecioventacl2()+
 	    	"estado: "+lis.getEstadocl2()+"descrip: "+lis.getDescripcl2());
 	    }
 	    
 	    
	}// fin del metodo main

}// fin de la clase 
