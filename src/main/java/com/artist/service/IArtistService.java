package com.artist.service;

import java.util.List;

import com.artist.entity.Artist;

public interface IArtistService {
	
	public String registerArtist(Artist artist);
	
	public boolean checkArtistAvailability(int id);
	
	public long showArtistCount();
	
	public String registerArtistBatch(List<Artist> list);
}
