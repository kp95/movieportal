package com.movieportalBackend.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.movieportalCommon.entity.User;

public interface UserRepository extends PagingAndSortingRepository<User, Long> {

}
