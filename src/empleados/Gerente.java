package empleados;

/**
 * 
 * Extiende la clase Administracion.
 * 
 * @author Rubèn Nieto
 *
 */
public class Gerente extends Administracion {
	private String departamento = "Nuevo Departamento";
	private int dietas = 0;
	
	/**
	 * Constructor de clase.
	 * 
	 * @param nombre es el nombre del empleado.
	 * @param DNI es el DNI del empleado.
	 */
	public Gerente (String nombre, String DNI) {
		super(nombre, DNI);
	}

	/**
	 * Obtener el departamento del empleado.
	 * @return el departamento.
	 */
	public String getDepartamento() {
		return departamento;
	}

	/**
	 * Almacenar el departamento del empleado.
	 * @param departamento es el departamento del empleado.
	 */
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	/**
	 * Obtener las dietas que cobra el empleado.
	 * @return dietas que cobra el empleado.
	 */
	public int getDietas() {
		return dietas;
	}

	/**
	 * Almacenar las dietas que cobra el empleado.
	 * @param dietas son las dietas que cobra el empleado.
	 */
	public void setDietas(int dietas) {
		this.dietas = dietas;
	}
	
	/**
	 * Obtener el sueldo neto (+ dietas) del empleado.
	 * @return el sueldo neto más las dietas.
	 */
	@Override
	public Double sueldoNeto() {
		return super.sueldoNeto()+dietas;
	}
}
