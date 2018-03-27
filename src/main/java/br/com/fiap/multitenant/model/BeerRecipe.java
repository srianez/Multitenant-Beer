package br.com.fiap.multitenant.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class BeerRecipe implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6220956727074218433L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private int idBeerStyle;
	private int idOrganization;
	private String recipeName;
	private String recipeDetails;
	private String recipeReview;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getIdBeerStyle() {
		return idBeerStyle;
	}

	public void setIdBeerStyle(int idBeerStyle) {
		this.idBeerStyle = idBeerStyle;
	}

	public int getIdOrganization() {
		return idOrganization;
	}

	public void setIdOrganization(int idOrganization) {
		this.idOrganization = idOrganization;
	}

	public String getRecipeName() {
		return recipeName;
	}

	public void setRecipeName(String recipeName) {
		this.recipeName = recipeName;
	}

	public String getRecipeDetails() {
		return recipeDetails;
	}

	public void setRecipeDetails(String recipeDetails) {
		this.recipeDetails = recipeDetails;
	}

	public String getRecipeReview() {
		return recipeReview;
	}

	public void setRecipeReview(String recipeReview) {
		this.recipeReview = recipeReview;
	}
}
