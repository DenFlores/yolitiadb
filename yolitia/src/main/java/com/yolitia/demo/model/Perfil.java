package com.yolitia.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "perfil")
@Data
public class Perfil {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idPerfil", nullable = false)
	
	
	private Integer id;
	
	@Column(name = "imagen", nullable = false, length = 255)
	
	
	private String imagen;
	
	@Column(name = "apellido", nullable = false, length = 255)
	
	
	private String apellido;
	
	@Column(name = "correo", nullable = false, length = 255)
	
	
	private String correo;
	
	@Column(name = "direccion", nullable = false, length = 255)
	
	
	private String direccion;
	
	@Column(name = "notificaciones", nullable = false, length = 255)
	
	
	private String notificaciones;
	
	@Column(name = "seguridad", nullable = false, length = 255)
	
	
	private String seguridad;
	
	@Column(name = "contrase�a", nullable = false, length = 255)
	
	
	private String contrase�a;
	
	@OneToOne(fetch = FetchType.LAZY)
	private Usuario usuario;
	
	
	
	

}
