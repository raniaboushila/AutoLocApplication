package tn.esprit.autolocapplication.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.autolocapplication.entities.agence;

@Repository
public interface agencerepository extends JpaRepository<agence,Long> {




}

