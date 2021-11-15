package com.movieportalBackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan({"com.movieportalCommon.constant","com.movieportalCommon.entity"})
public class MovieportalBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovieportalBackendApplication.class, args);
	}

}
