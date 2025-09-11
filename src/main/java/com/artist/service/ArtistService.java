package com.artist.service;

import java.util.List;
import java.util.Optional;

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

	@Override
	public String registerArtistBatch(List<Artist> list) {
		Iterable<Artist> saveList = artistRepo.saveAll(list);		
		return "All Artists are registered successfully"+saveList;
	}

	@Override
	public Iterable<Artist> showAllArtists() {
		
		Iterable<Artist> list = artistRepo.findAll();
		return list;
	}

	@Override
	public Iterable<Artist> showArtistsByIds(Iterable<Integer> ids) {
		
		Iterable<Artist> list = artistRepo.findAllById(ids);
		return list;
	}

	@Override
	public String getArtistById(int id) {
		Optional<Artist> artist = artistRepo.findById(id);
		if(!artist.isPresent())
			return "Artist not found";
		
		return "Artist Details: "+artist;
	}

	@Override
	public String registerOrupdateArtist(Artist artist) {
		
		artistRepo.save(artist);
		if(artistRepo.existsById(artist.getArtistId()))
			return artist.getArtistName()+" Artist updated";
		
		return artist.getArtistName()+" Artist Registered successfully";
	}

	@Override
	public String hikeArtistFeeByIdAndPercentage(int id, double percentage) {
		Optional<Artist> opt = artistRepo.findById(id);
		
		if(opt.isPresent()) {
			Artist artist = opt.get();
			artist.setFee(artist.getFee()+(artist.getFee()*percentage/100.0f));
			artistRepo.save(artist);
			
			return "Artist Fee is modified Successfully";
		}
		return "Artist not found to modifiy the fee";
	}

	@Override
	public String removeArtistById(int id) {
		
		Optional<Artist> opt = artistRepo.findById(id);
		
		if(opt.isPresent()) {
			artistRepo.deleteById(id);
			return "artist remove sucessfully";
		}
		return "artist not found to remove";
	}

	@Override
	public String removeAllArtists() {
		artistRepo.deleteAll();
		return "All artist remove sucessfully";
	}
}
