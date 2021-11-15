package com.movieportalCommon.constant;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.movieportalCommon.entity.Movie;

@Entity
@Table(name = "languages")
public class Language {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(unique = true)
	private String name;
	
	@ManyToMany
	@JoinTable(
			joinColumns = @JoinColumn(name = "language_id"),
			inverseJoinColumns = @JoinColumn(name = "movie_id")
			)
	private Set<Movie> movies;
	
	public Language() {
		// TODO Auto-generated constructor stub
	}

	
	
	
	public Language(String name) {
		super();
		this.name = name;
	}




	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}




	public Set<Movie> getMovies() {
		return movies;
	}




	public void setMovies(Set<Movie> movies) {
		this.movies = movies;
	}




	
	
}

