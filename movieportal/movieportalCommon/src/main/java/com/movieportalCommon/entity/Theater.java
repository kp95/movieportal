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
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "theater")
public class Theater {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(nullable = false)
	private String name;
	
	@Column(nullable = false)
	private String location;
	
	private String imagePath;
	
	@ManyToMany
	@JoinTable(
			joinColumns = @JoinColumn(name = "theater_id"),
			inverseJoinColumns = @JoinColumn(name = "show_id")
			)
	private Set<Show> shows = new HashSet<>();
	
	public Theater() {
		// TODO Auto-generated constructor stub
	}
	

	public Theater(String name, String location, String imagePath) {
		super();
		this.name = name;
		this.location = location;
		this.imagePath = imagePath;
	}

	public String getImagePath() {
		return imagePath;
	}

	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
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

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	
	
	public Set<Show> getShows() {
		return shows;
	}


	public void setShows(Set<Show> shows) {
		this.shows = shows;
	}


	@Transient
	public void addShows(Show show) {
		this.addShows(show);
	}
	
}
