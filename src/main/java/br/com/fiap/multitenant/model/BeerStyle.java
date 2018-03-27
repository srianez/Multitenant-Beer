package br.com.fiap.multitenant.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class BeerStyle implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1815922265808797595L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String categoryName;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

}
