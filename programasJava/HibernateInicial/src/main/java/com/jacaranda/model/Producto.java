package com.jacaranda.model;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Producto {
	
	@Id
	private String id;
	
	private String nombreItem;
	
	@ManyToOne
	@JoinColumn private Usuario idUsuario;
	
	public Producto(String id, String nombreItem) {
		this.id = id;
		this.nombreItem = nombreItem;
	}

	
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNombreItem() {
		return nombreItem;
	}

	public void setNombreItem(String nombreItem) {
		this.nombreItem = nombreItem;
	}

	public Usuario getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Usuario idUsuario) {
		this.idUsuario = idUsuario;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, idUsuario, nombreItem);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Producto other = (Producto) obj;
		return Objects.equals(id, other.id) && Objects.equals(idUsuario, other.idUsuario)
				&& Objects.equals(nombreItem, other.nombreItem);
	}

	@Override
	public String toString() {
		return "Producto [id=" + id + ", nombreItem=" + nombreItem + ", idUsuario=" + idUsuario + "]";
	}

}
