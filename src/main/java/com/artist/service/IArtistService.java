package com.artist.service;

import com.artist.entity.Artist;

public interface IArtistService {
	
	public String registerArtist(Artist artist);
	
	public boolean checkArtistAvailability(int id);
}
