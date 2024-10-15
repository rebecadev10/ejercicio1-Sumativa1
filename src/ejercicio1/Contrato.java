/**
 * 
 */
package ejercicio1;

/**
 * 
 */public class Contrato {
	    private String tipo;
	    private double porcentajeDescuento;
	    public Contrato() {
	        this.tipo = " Indefinido";
	        this.porcentajeDescuento=0;
	    }
	    public String getTipo() {
			return tipo;
		}



		public void setTipo(String tipo) {
			this.tipo = tipo;
		}
	 

	    public double getPorcentajeDescuento() {
			return porcentajeDescuento;
		}



		public void setPorcentajeDescuento(double porcentajeDescuento) {
			this.porcentajeDescuento = porcentajeDescuento;
		}



		


		 public double calcularDescuentoFijo(double salarioNeto) {
		        return salarioNeto * (porcentajeDescuento / 100); // Aplica el porcentaje al salario
		    }
		// Métodos vacíos o con lógica básica para ser sobrescritos si es necesario
	    public double calcularDescuentoFijo() {
	        return 0; // Por defecto, sin descuento
	    }

	    public double calcularImpuestos(double salarioNeto) {
	        return 0; // Por defecto, sin impuestos
	    }
	}
