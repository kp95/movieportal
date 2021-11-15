package com.movieportalBackend.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.movieportalCommon.entity.Movie;

public interface MovieRepository extends PagingAndSortingRepository<Movie, Long> {

}
