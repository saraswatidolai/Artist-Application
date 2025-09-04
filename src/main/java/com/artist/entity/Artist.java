package com.artist.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@Table(name="Arist_Information")
@Data
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
public class Artist {
	
	@Id
	@Column(name="artist_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer artistId;
	
	@NonNull
	@Column(name="artist_name")
	private String artistName;
	
	@NonNull
	private String category;
	
	@NonNull
	private Double fee;
}
