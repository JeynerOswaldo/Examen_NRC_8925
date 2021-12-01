package mundo;

public class Principal {

	public static void main(String[] args) {
	//Declarar un objeto
	//nombre de la clase: Telefono 
	//nombre del objeto: miTelefono
	Telefono miTelefono;
	
	//Instanciar un Objeto
    //nombre del objeto: miTelefono
	//el nombre del contrusctor es igual al nombre de la clase : Telefono();
	
	miTelefono = new Telefono();
	
	//declar e instanciar un objeto
	//nombre de la clase: Telefono 
	//nombre del objeto: miTelefono2
	//el nombre del contrusctor es igual al nombre de la clase : Telefono();
	
	Telefono miTelefono2 = new Telefono();
	
	//MENSAJE (Orden a un objeto que ejecute un metodo
	//se pone el nombre del objeto y punto (.)
	miTelefono.mostrarDatos();
	
	
}}
