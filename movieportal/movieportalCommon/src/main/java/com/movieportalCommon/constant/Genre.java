package com.movieportalCommon.constant;

import java.util.HashSet;
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
@Table(name = "genres")
public class Genre {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(unique = true)
	private String name;

	@ManyToMany
	@JoinTable(
			joinColumns =  @JoinColumn(name = "genre_id"),
			inverseJoinColumns = @JoinColumn(name = "movie_id")
			)
	private Set<Movie> movies = new HashSet<>();
 	
	public Genre() {
		// TODO Auto-generated constructor stub
	}


	public Genre(Integer id, String name) {
		super();
		this.id = id;
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
	
}
