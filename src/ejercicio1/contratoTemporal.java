package ejercicio1;

class ContratoTemporal extends Contrato {

   

    
    public ContratoTemporal() {
    	  this.setTipo("Temporal");
			 this.setPorcentajeDescuento(5); // Definimos un descuento del 5% para contratos fijos
	}

   
    public double calcularDescuentoFijo(double salarioNeto) {
        return salarioNeto * (this.calcularPorcentajeDescuento() / 100); // Aplica el porcentaje de descuento para el contrato fijo
    }

    public double calcularPorcentajeDescuento() {
        return 5; // 5% de descuento fijo
    }

    @Override
    public double calcularImpuestos(double salarioNeto) {
        return salarioNeto * 0.10; // Impuesto del 10%
    }
}
