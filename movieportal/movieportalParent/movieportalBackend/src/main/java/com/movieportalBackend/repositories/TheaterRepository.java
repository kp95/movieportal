package com.movieportalBackend.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.movieportalCommon.entity.Theater;

public interface TheaterRepository extends PagingAndSortingRepository<Theater, Integer> {

}
