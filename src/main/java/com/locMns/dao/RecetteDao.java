package com.locMns.dao;

import com.locMns.model.Recette;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecetteDao extends JpaRepository<Recette, Integer > {
}
