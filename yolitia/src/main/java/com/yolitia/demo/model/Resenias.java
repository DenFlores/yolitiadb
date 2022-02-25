package com.yolitia.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "rese�as")
@Data
public class Rese�as {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_rese�as", nullable = false)
	private Integer id_rese�as;
	
	@Column(name = "texto", nullable = false, length = 255)
	private String texto;
	
	@Column(name = "imagen", nullable = false, length = 255)
	private String imagen;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "usuario_id")
	private Usuario usuario;
	
	

}
