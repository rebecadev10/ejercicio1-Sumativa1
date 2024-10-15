/**
 * 
 */
package ejercicio1;

/**
 * 
 */
public class Empresa {
//	creamos atributos de la clase
	private String nombre;
	private String rubro;
	private Trabajador trabajador;
	
	
	/**
	 * 
	 */
	public Empresa(String nombre, String rubro,Trabajador trabajador) {
		// TODO Auto-generated constructor stub
		this.nombre=nombre;
		this.rubro=rubro;
		this.trabajador=trabajador;
		
	}
//	creamos nuestro metodo para mostrar la informacion, con los claculos realizaods en las otras clases 
	 public void mostrarInformacion() {
//	             definimos estas variables para mostrar en el recibo
	        String fecha = "22-10-2024";
	        String quincenaInicio = "20-10-2024";
	        String quincenaFin = "27-10-2024";

	       System.out.println(" ");
	        System.out.println("Nombre de la empresa: " + nombre + "                     Rubro: " + rubro);
	        System.out.println("Nombre del trabajador: " + trabajador.getNombre() + "                    Fecha: " + fecha);
	        System.out.println("QUINCENA TOTAL                                          " + fecha);
	        System.out.println("C.I: " + trabajador.getCedula() + "                                       Cargo: " + trabajador.getCargo().getNombre());
	        System.out.println("Quincena correspondiente a " + quincenaInicio + " al " + quincenaFin);
	        System.out.println();
	        System.out.println("Concepto   Días     Total     Deducciones      Días      Impuestos");

	        // Sueldo básico y deducciones de impuestos y descuentos
	        double salarioNeto = trabajador.calcularSalarioNeto();
	        double impuestos = trabajador.calcularImpuestos();
	        double descuentos = trabajador.calcularDescuentos();

	        // Imprimir sueldo con días trabajados y deducciones/impuestos
	        System.out.println("Sueldo       15      " + salarioNeto +
	                "      " + descuentos + "          " + "15           " + impuestos);

	        System.out.println();
	        System.out.println("Total devengado: " + salarioNeto + 
	                           "                   Total deducciones: " + (impuestos + descuentos));

	        // Calcular salario total neto
	        double salarioTotal = trabajador.calcularSalarioTotal();
	        System.out.println("NETO A COBRAR:                                              " + salarioTotal);
	        System.out.println();
	        System.out.println("Observación:");
	        System.out.println("Recibo conforme _________________________ Cédula ________________");
	        

	    }

}

