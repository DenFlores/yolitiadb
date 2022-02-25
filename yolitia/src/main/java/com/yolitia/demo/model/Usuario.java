package com.yolitia.demo.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "usuario")
@Data
public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_usuario", nullable = false)
	private Integer id_usuario;
	
	@Column(name = "nombre", nullable = false, length = 255)
	private String nombre;
	
	@Column(name = "correo", nullable = false, length = 255)
	private String correo;
	
	@Column(name = "contrase�a", nullable = false, length = 255)
	private String contrase�a;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "usuario")
	private List<Rese�as> rese�as;
}
