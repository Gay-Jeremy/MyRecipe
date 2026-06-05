package com.locMns.dao;


import com.locMns.model.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UtilisateurDao extends JpaRepository<Utilisateur, Integer > {
}
