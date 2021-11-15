package com.movieportalBackend.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.movieportalCommon.entity.Show;

public interface ShowRepositories extends PagingAndSortingRepository<Show, Long>{

}
