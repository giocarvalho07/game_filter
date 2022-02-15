package com.gamefilter.gamefilter.repositories;

import com.gamefilter.gamefilter.entities.Record;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecordRepository extends JpaRepository< Record, Long> {
}
