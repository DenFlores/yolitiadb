package com.yolitia.demo.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;


import lombok.Data;

@Entity
@Table(name= "peluches")
@Data
public class Peluches {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idPeluches", nullable = false)
	
	
	private Integer id;
	
	@Column(name = "Productos_id", nullable = false)
	
	
	private Integer Productos_id;
	
	@OneToOne(fetch = FetchType.LAZY)
	private Productos productos;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "peluches")
	private List<Personalizacion> personalizacion;
	
	
	
	

}
