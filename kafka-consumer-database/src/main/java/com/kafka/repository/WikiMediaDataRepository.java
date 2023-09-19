package com.kafka.repository;

import com.kafka.entity.WikimediaData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WikiMediaDataRepository extends JpaRepository<WikimediaData, Long> {
}
