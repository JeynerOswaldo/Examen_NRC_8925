package mundo;

public class Telefono {

	
	//Atributos (Caracteristicas)
	
	private int id;
	private String marca;
	private String modelo;
	private Double precio;
	
	// Metodo constructor Sin parametros 
	
	public Telefono() {
		
		//inicializar atributos
		id =001;
		marca= "Samsug";
		modelo ="S20";
		precio =4000.0;
	}
	
	//Metodo constructor con parametros 
	//VERRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR
	
	
	//Metodos (Funcionalidad del Objeto)
	
	public void mostrarDatos () {
		
	//instruciones del metodo 
		
	System.out.println("Datos del Telefono");
	System.out.println("ID:" + id);
	System.out.println("Marca:" + marca);
	System.out.println("Modelo:" + modelo);
	System.out.println("Precio:" + precio);
		
	}
	
}
