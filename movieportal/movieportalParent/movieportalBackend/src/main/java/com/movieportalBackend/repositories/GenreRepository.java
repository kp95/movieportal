package com.movieportalBackend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.movieportalCommon.constant.Genre;

public interface GenreRepository extends JpaRepository<Genre, Integer> {

}
