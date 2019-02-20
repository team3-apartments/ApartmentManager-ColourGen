package com.qa.ApartmentManager.ColourGenapi.persistance.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ColourGenRepository<ApartmentManager> extends JpaRepository<ApartmentManager, String> {
}
