package com.escuela.usuario.valido;

import javax.persistence.*;

@Entity
public class Vehiculo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "marca")
	private String marca;

	@Column(name = "modelo")
	private String modelo;

	@Column(name = "color")
	private String color;

	@Column(name = "precio")
	private Integer precio;

	public String getMododelo() {
		return modelo;
	}

	public void setMod(String modelo) {
		this.modelo = modelo;
	}

	public Integer getPrecio() {
		return precio;
	}

	public void setprecio(Integer precio) {
		this.precio = precio;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	@Override
	 public String toString() {
	        return "Alumno: \n" +
	                "   id: " + this.id +
	                "\n   marca: " + this.marca +
	                "\n   modelo: " + this.modelo +
	                "\n   color: " + this.color +
	                "\n   precio: " + this.precio;
	    }

}