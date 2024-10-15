/**Ejercicio numero 1 sueldo de trabajador de acuerdo a horas trabajadas Rebeca rodriguez CI:30.051.282 Programacion II UBA SAN ANTONIO DE LOS ALTOS
 * 
 */
package ejercicio1;

//import sumativa1.Trabajador;

/**
 * 
 */
public class Main {

	/**
	 * 
	 */
	public Main() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		creamos nuestros objetos de contrato, cargo trabajador y empresa, pasando cada una de los valores correspondientes, presentaremos dos casos, de acuerdo al tipo de contrato
		//contrato fijo
		Contrato tipoContrato=new ContratoFijo();
		Cargo cargoAsignado = new Cargo("gerente",5 );
		Trabajador trabajador = new Trabajador("rebeca",30051282,20.5,cargoAsignado,tipoContrato);
		Empresa newEmpresa= new Empresa("TextiPrint", "Textil",trabajador);
		Contrato tipoContrato1=new ContratoTemporal();
		Cargo cargoAsignado1 = new Cargo("pasante",3 );
		Trabajador trabajador1 = new Trabajador("Luis",29555450,10,cargoAsignado1,tipoContrato1);
		Empresa newEmpresa1= new Empresa("TextiPrint", "Textil",trabajador1);
//empleado con contrato fijo
		newEmpresa.mostrarInformacion();
//		empleado con contrato temporal
		newEmpresa1.mostrarInformacion();
	}

}
