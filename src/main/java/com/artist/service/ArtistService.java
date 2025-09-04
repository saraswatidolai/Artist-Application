package com.artist.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.artist.entity.Artist;
import com.artist.repository.IArtistRepository;

@Service(value="artistService")
public class ArtistService implements IArtistService {
	
	@Autowired
	private IArtistRepository artistRepo;

	@Override
	public String registerArtist(Artist artist) {
		
		Artist art = artistRepo.save(artist);
		return "Artist Registered successfully "+art;
	}

	@Override
	public boolean checkArtistAvailability(int id) {
		
		boolean check = artistRepo.existsById(id);
		return check;
	}

	@Override
	public long showArtistCount() {
		return artistRepo.count();
	}
	

}
