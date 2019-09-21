package empleados;

/**
 * 
 * Una clase para guardar los empleados de la empresa. 
 * Constructor obligatorio con nombre y DNI.
 * 
 * @author Rubèn Nieto
 *
 */
public class Empleado {
	private String nombre, DNI;
	private Double sueldo = 0.0;
	
	/**
	 * Obtener nombre.
	 * @return el nombre del empleado.
	 */
	public String getNombre() {
		return nombre;
	}
	
	/**
	 * Almacenar nombre.
	 * @param nombre es el nombre del empleado
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Obtener el DNI.
	 * @return el DNI del empleado.
	 */
	public String getDNI() {
		return DNI;
	}

	/**
	 * Almacenar el DNI.
	 * @param dNI es el DNI del empleado.
	 */
	public void setDNI(String dNI) {
		DNI = dNI;
	}
	
	/**
	 * Obtener el sueldo.
	 * @return el sueldo del empleado.
	 */
	public Double getSueldo() {
		return sueldo;
	}

	/**
	 * Almacenar el sueldo.
	 * @param sueldo es el sueldo del empleado
	 */
	public void setSueldo(Double sueldo) {
		this.sueldo = sueldo;
	}
	
	/**
	 * Obtener el sueldo neto.
	 * @return el sueldo neto (sueldo*.85) del empleado
	 */
	public Double sueldoNeto() {
		return sueldo*getIRPF();
	}
	
	/**
	 * Obtener el valor de IRPF.
	 * @return .85 si sueldo es menor de 3000 o .75 si no.
	 */
	private Double getIRPF() {
		return (this.sueldo < 3000.0) ? .85 : .75; 
	}
		
	/**
	 * Constructor con nombre y DNI.
	 * @param nombre es el nombre del empleado creado.
	 * @param dNI es el DNI del empleado creado.
	 */
	public Empleado(String nombre, String dNI) {
		this.nombre = nombre;
		this.DNI = dNI;
	}
}
