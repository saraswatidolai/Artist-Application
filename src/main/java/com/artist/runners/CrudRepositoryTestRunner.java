package com.artist.runners;

import java.util.Arrays;
import java.util.List;

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
		
		/*
		Artist artist = new Artist("Sara", "Heroine", 60000.0);
		
		try {
			String msg = artistService.registerArtist(artist);
			System.out.println(msg);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		*/
		
		/*
		try {
			System.out.println("Artist available or not? "+artistService.checkArtistAvailability(15));
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		*/
		
		/*
		try {
			System.out.println("Total number of artist: "+artistService.showArtistCount());
		}
		catch(Exception e) {
			e.printStackTrace();
		}*/
		
		/*
		try {
			Artist artist1 = new Artist("Aadilakshmi", "Heroine", 80000.0);
			Artist artist2 = new Artist("Sukumar", "Hero", 60000.0);
			Artist artist3 = new Artist("Sunny", "Hero", 50000.0);
			
			List<Artist> list = Arrays.asList(artist1, artist2, artist3);
			
			System.out.println(artistService.registerArtistBatch(list));
		}
		catch(Exception e) {
			e.printStackTrace();
		} */
		
		try {
			Iterable<Artist> list = artistService.showAllArtists();
			list.forEach(System.out::println);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
