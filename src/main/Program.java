package main;

import java.util.ArrayList;
import empleados.*;

/**
 * 
 * Programa para probar la clase Empleado y sus extensiones (Administracion, Gerente y Direccion).
 * 
 * @author Rubèn Nieto
 *
 */
public class Program {

	/**
	 * Entrada al programa.
	 * @param args son los argumentos pasados.
	 */
	public static void main(String[] args) {
		Empleado uno = new Empleado("Empleado1", "11111111A");
		Empleado dos = new Empleado("Empleado2", "22222222B");
		Empleado tres = new Empleado("Empleado3", "33333333C");
		Empleado cuatro = new Empleado("Empleado4", "444444444D");
		
		uno.setSueldo(1000.0);					// De la propia clase
		dos.setSueldo(2000.0);
		tres.setSueldo(3000.0);					
		cuatro.setSueldo(4000.0);
		
		ArrayList<Empleado> empleados = new ArrayList<Empleado>();
						
		empleados.add(uno);
		empleados.add(dos);
		empleados.add(tres);
		empleados.add(cuatro);
		
		Gerente cinco = new Gerente("Empleado5", "55555555E");
		cinco.setSueldo(2000.0);				// Hereda de Empleado
		cinco.setSeccion("Compras");			// Hereda de Administracion
		cinco.setDepartamento("Europa");		// De la propia clase
		cinco.setDietas(1000);					// De la propia clase
		
		ArrayList<Gerente> gerentes = new ArrayList<Gerente>();
		gerentes.add(cinco);
		
		Direccion seis = new Direccion("Empleado6", "66666666F");
		seis.setSueldo(4000.0);					// Hereda de Empleado
		seis.setSeccion("Compras");				// Hereda de Administracion
		seis.setDepartamento("Europa");			// Hereda de Gerente
		seis.setDietas(1000);					// Hereda de Gerente
		seis.setStockOptions(5000);				// De la propia clase
		
		ArrayList<Direccion> directores = new ArrayList<Direccion>();
		directores.add(seis);
			
		// Imprime empleados
		for (int e = 0; e < empleados.size(); e++) {
			Empleado empleado = empleados.get(e);
			System.out.println("|Empleado " + (e+1) + " = ");
			System.out.println("|- Nombre: " + empleado.getNombre());
			System.out.println("|- DNI: " + empleado.getDNI());
			System.out.println("|- Sueldo: " + empleado.getSueldo() + " (Neto : " + empleado.sueldoNeto() + ")\n");
		}
		
		// Imprime gerentes
		for (int e = 0; e < gerentes.size(); e++) {
			Gerente gerente = gerentes.get(e);
			System.out.println("|Gerente " + (e+1) + " = ");
			System.out.println("|- Sección: " + gerente.getSeccion());
			System.out.println("|- Departamento: " + gerente.getDepartamento());
			System.out.println("|- Nombre: " + gerente.getNombre());
			System.out.println("|- DNI: " + gerente.getDNI());
			System.out.println("|- Dietas: " + gerente.getDietas());
			System.out.println("|- Sueldo: " + gerente.getSueldo() + " (Neto : " + gerente.sueldoNeto() + ")\n");
		}
		
		// Imprimer directores
		for (int e = 0; e < directores.size(); e++) {
			Direccion director = directores.get(e);
			System.out.println("|Director " + (e+1) + " = ");
			System.out.println("|- Sección: "+ director.getSeccion());
			System.out.println("|- Departamento: " + director.getDepartamento());
			System.out.println("|- Nombre: " + director.getNombre());
			System.out.println("|- DNI: " + director.getDNI());
			System.out.println("|- Dietas: " + director.getDietas());
			System.out.println("|- Stock Options: " + director.getStockOptions());
			System.out.println("|- Sueldo: " + director.getSueldo() + " (Neto : " + director.sueldoNeto() + ")\n");	
		}
	}
}
