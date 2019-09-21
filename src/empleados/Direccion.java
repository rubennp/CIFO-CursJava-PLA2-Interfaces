package empleados;

import main.Bienvenida;

/**
 * 
 * Extiende la clase Gerente.
 * 
 * @author rubennp
 *
 */
public class Direccion extends Gerente implements Bienvenida {
	private int stockOptions = 0;
	
	
	/**
	 * Saluda al director.
	 */
	public void Saludo() {
		System.out.println("Hola, director " + this.getNombre());
	}
	
	/**
	 * Constructor de clase.
	 * 
	 * @param nombre
	 * @param DNI
	 */
	public Direccion (String nombre, String DNI) {
		super(nombre, DNI);
	}

	/**
	 * Obtener el valor de las Stock Options del empleado.
	 * @return valor de stockOptions.
	 */
	public int getStockOptions() {
		return stockOptions;
	}

	/**
	 * Almacenar el valor de las Stock Options del empleado.
	 * @param stockOptions es el valor de las Stock Options del empleado.
	 */
	public void setStockOptions(int stockOptions) {
		this.stockOptions = stockOptions;
	}
	
	/**
	 * Modifica Gerente.sueldoNeto para incluir valor de las Stock Options.
	 * @return el sueldo neto + el valor de las Stock Options multiplicado por 0,1.
	 */
	@Override
	public Double sueldoNeto() {
		return super.sueldoNeto()+(stockOptions*.1);
	}
}
