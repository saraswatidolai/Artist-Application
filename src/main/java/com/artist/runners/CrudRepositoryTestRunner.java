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
		
		
		/*
		try {
			Iterable<Artist> list = artistService.showAllArtists();
			list.forEach(System.out::println);
		}
		catch (Exception e) {
			e.printStackTrace();
		} */
		
		/*
		try {
			Iterable<Artist> list = artistService.showArtistsByIds(List.of(2,3));
			list.forEach(System.out::println);
		}
		catch(Exception e) {
			e.printStackTrace();
		}*/
		
		/*
		try {
			System.out.println(artistService.getArtistById(4));
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		*/
		
		/*
		try {
			//Artist artist = new Artist(5, "Shifa", "Heroine", 55000.0);  //it register first bcoz there is no id 5 
			Artist artist = new Artist(5, "Shifa", "Heroine", 60000.0);  //but second time id 5 is there in database so it will update
			System.out.println(artistService.registerOrupdateArtist(artist));
		}
		catch(Exception e) {
			e.printStackTrace();
		}*/
		
		/*
		try {
			
			System.out.println(artistService.hikeArtistFeeByIdAndPercentage(1, 50));
		}
		catch(Exception e) {
			e.printStackTrace();
		}*/
		
		try {
			System.out.println(artistService.removeArtistById(6));
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
