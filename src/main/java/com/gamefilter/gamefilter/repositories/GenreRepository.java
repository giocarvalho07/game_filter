package com.gamefilter.gamefilter.repositories;

import com.gamefilter.gamefilter.entities.Genre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GenreRepository extends JpaRepository< Genre, Long> {
}
