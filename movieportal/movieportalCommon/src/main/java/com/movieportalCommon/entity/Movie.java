package com.movieportalCommon.entity;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.movieportalCommon.constant.Genre;
import com.movieportalCommon.constant.Language;

@Entity
@Table(name = "movies")
public class Movie {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(unique = true,nullable = false)
	private String name;
	
	private String rating;
	
	private String imagePath;
	
	@ManyToMany
	@JoinTable(
			joinColumns = @JoinColumn(name = "movie_id"),
			inverseJoinColumns = @JoinColumn(name = "genre_id")
			)
	private Set<Genre> genre = new HashSet<>();
	
	@ManyToMany
	@JoinTable(
			joinColumns = @JoinColumn(name = "movie_id"),
			inverseJoinColumns = @JoinColumn(name = "language_id")
			)
	private Set<Language> language = new HashSet<Language>();
	
	@OneToMany(mappedBy = "id")
	private Set<Show> shows = new HashSet<Show>();
	
	
	public Movie() {
		// TODO Auto-generated constructor stub
	}


	
	
	public Movie(String name, String rating, String imagePath, Set<Genre> genre, Set<Language> language) {
		super();
		this.name = name;
		this.rating = rating;
		this.imagePath = imagePath;
		this.genre = genre;
		this.language = language;
	}




	public String getImagePath() {
		return imagePath;
	}

	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}



	public Set<Show> getShows() {
		return shows;
	}

	public void setShows(Set<Show> shows) {
		this.shows = shows;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public Set<Genre> getGenre() {
		return genre;
	}

	public void setGenre(Set<Genre> genre) {
		this.genre = genre;
	}

	public Set<Language> getLanguage() {
		return language;
	}

	public void setLanguage(Set<Language> language) {
		this.language = language;
	}

	@Override
	public String toString() {
		return "Movie [id=" + id + ", name=" + name + ", rating=" + rating + ", genre=" + genre + ", language="
				+ language + "]";
	}
	
	@Transient
	public void addShows(Show show) {
		this.shows.add(show);
	}
	
	@Transient
	public void addLanguage(Language language) {
		this.language.add(language);
	}
	
	@Transient
	public void addGenre(Genre genre) {
		this.genre.add(genre);
	}
}
