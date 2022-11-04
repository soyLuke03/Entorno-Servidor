package com.jacaranda.model;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Usuario {

	@Id
	private int id;
	private String nombre;
	@OneToMany(mappedBy ="idUsuario", cascade = CascadeType.ALL,orphanRemoval = true)
	private List<Producto> productos;
	
	
	
	public Usuario(int id, String nombre) {
		this.id = id;
		this.nombre = nombre;
		productos = new ArrayList<>();
	}
	
	public Usuario(int id) {
		this.id = id;
	}

	public Usuario() {
		this.id = 0;
		this.nombre = null;
	}
	
	
	public void addProducto(Producto producto) {
		productos.add(producto);
		producto.setIdUsuario(this);
	}
	
	public void DeleteProducto(Producto producto) {
		productos.add(producto);
		producto.setIdUsuario(null);
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	@Override
	public String toString() {
		return "Usuario [id=" + id + ", nombre=" + nombre + "]";
	}

	public List<Producto> getProductos() {
		return productos;
	}

	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		return id == other.id && Objects.equals(nombre, other.nombre);
	}
	
	
	
}
