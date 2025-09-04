package com.artist.runners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.artist.entity.Artist;
import com.artist.service.IArtistService;

@Component
public class CrudRepositoryTestRunner implements CommandLineRunner {

	@Autowired
	private IArtistService artistService;
	
	@Override
	public void run(String... args) throws Exception {
		
		Artist artist = new Artist("Sara", "Heroine", 60000.0);
		
		try {
			String msg = artistService.registerArtist(artist);
			System.out.println(msg);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
