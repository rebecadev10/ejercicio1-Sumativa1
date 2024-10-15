package ejercicio1;

public class Trabajador {
    private String nombre;
    private int cedula;
    private double horasTrabajadas;
    private Cargo cargo;
    private Contrato contrato;

    public Trabajador(String nombre, int cedula, double horasTrabajadas, Cargo cargo, Contrato contrato) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.horasTrabajadas = horasTrabajadas;
        this.cargo = cargo;
        this.contrato = contrato;
    }

  

    public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public int getCedula() {
		return cedula;
	}



	public void setCedula(int cedula) {
		this.cedula = cedula;
	}



	public double getHorasTrabajadas() {
		return horasTrabajadas;
	}



	public void setHorasTrabajadas(double horasTrabajadas) {
		this.horasTrabajadas = horasTrabajadas;
	}



	public Cargo getCargo() {
		return cargo;
	}



	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}



	public Contrato getContrato() {
		return contrato;
	}



	public void setContrato(Contrato contrato) {
		this.contrato = contrato;
	}



	// Método para calcular el salario neto
    public double calcularSalarioNeto() {
        return horasTrabajadas * cargo.getValorHora();
    }

    // Método para calcular los descuentos
    public double calcularDescuentos() {
        return contrato.calcularDescuentoFijo(calcularSalarioNeto());
    }


    // Método para calcular los impuestos
    public double calcularImpuestos() {
        return contrato.calcularImpuestos(calcularSalarioNeto());
    }

    // Método para calcular el salario total
    public double calcularSalarioTotal() {
        return calcularSalarioNeto() - calcularDescuentos() - calcularImpuestos();
    }
}