/**
 * 
 */
package ejercicio1;

/**
 * 
 */
//clase heredada de contrato, aqui establecemos el tipo de contrato y su descuento
 class ContratoFijo extends Contrato {

    
	 public ContratoFijo() {
			
		    this.setTipo("Fijo");
			 this.setPorcentajeDescuento(10); // Definimos un descuento del 10% para contratos fijos
			  
		}


   
	 public double calcularDescuentoFijo(double salarioNeto) {
	        return salarioNeto * (this.calcularPorcentajeDescuento() / 100); // Aplica el porcentaje de descuento para el contrato fijo
	    }

	    public double calcularPorcentajeDescuento() {
	        return 10; // 10% de descuento fijo
	    }

	    @Override
	    public double calcularImpuestos(double salarioNeto) {
	        return salarioNeto * 0.15; // Impuesto del 15%
	    }
}

