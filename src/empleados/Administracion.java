package empleados;

/**
 * 
 * Extiende la clase Empleado.
 * 
 * @author Rubèn Nieto
 *
 */
public class Administracion extends Empleado {
	private String seccion;
	
	/**
	 * Constructor de clase.
	 * 
	 * @param nombre es el nombre del empleado.
	 * @param DNI es el DNI del empleado.
	 */
	public Administracion (String nombre, String DNI){
		super(nombre, DNI);
	}
	
	/**
	 * Obtener la sección.
	 * @return la sección.
	 */
	public String getSeccion() {
		return seccion;
	}
	
	/**
	 * Almacenar la sección.
	 * @params seccion es la sección del empleado
	 */
	public void setSeccion(String seccion) {
		this.seccion = seccion;
	}
}
