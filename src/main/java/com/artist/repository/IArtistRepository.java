package com.artist.repository;

import org.springframework.data.repository.CrudRepository;

import com.artist.entity.Artist;

public interface IArtistRepository extends CrudRepository<Artist, Integer> {

}
