package persistencia.taller2;

import java.io.Serializable;

public class Producto implements Serializable {

	private String nombre;
	private String descripcion;
	private Integer cantidad;
	private Float valor;

	public Producto(String nombre, String descripcion, Integer cantidad, Float valor) {
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.cantidad = cantidad;
		this.valor = valor;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public Float getValor() {
		return valor;
	}

	public void setValor(Float valor) {
		this.valor = valor;
	}

	@Override
	public String toString() {
		return "Producto [" + nombre + ", " + descripcion + ", Cantidad=" + cantidad + ", Valor="
				+ valor + "]";
	}

}
