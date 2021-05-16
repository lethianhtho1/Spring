package com.java.web.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "homework", catalog = "website")
public class HomeWork implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	private Long id;
	private String HOMEWORK_ID;

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "HOMEWORK_ID", unique = true, nullable = false)
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Column(name = "HOMEWORK_NAME", length = 20)
	public String getHOMEWORK_ID() {
		return HOMEWORK_ID;
	}

	public void setHOMEWORK_ID(String hOMEWORK_ID) {
		HOMEWORK_ID = hOMEWORK_ID;
	}

}