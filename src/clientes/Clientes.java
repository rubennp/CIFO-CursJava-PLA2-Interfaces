package clientes;

import main.Bienvenida;

public class Clientes implements Bienvenida {
	private String nombre = "", email = "", tipo = "";

	/**
	 * Saluda al Cliente.
	 */
	public void Saludo() {
		System.out.println("Hola, cliente " + this.nombre);
	}
	
	/**
	 * Obtener el nombre del cliente.
	 * @return el nombre del cliente.
	 */
	public String getNombre() {
		return nombre;
	}
	
	/**
	 * Almacena el nombre del cliente.
	 * @param nombre es el nombre del cliente.
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Obtener el nombre del cliente.
	 * @return el nombre del cliente.
	 */
	public String getEmail() {
		return email;
	}
	
	/**
	 * Almacena el nombre del cliente.
	 * @param email es el mail del cliente.
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * Obtener el tipo de cliente.
	 * @return el tipo de cliente.
	 */
	public String getTipo() {
		return tipo;
	}

	/**
	 * Almacena el tipo de cliente.
	 * @param tipo es el tipo de cliente.
	 */
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
}
