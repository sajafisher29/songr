package com.fellowscode.fishersarah.songr.models;

import org.springframework.data.jpa.repository.JpaRepository;

//Jpa Repository <Type, Identifier type>
//Album Id was a long so this needs to be a long

public interface AlbumRepository extends JpaRepository<Album, Long> {

}
