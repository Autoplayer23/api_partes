package backend.spring.controller;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import backend.spring.model.Parte;
@Repository
public interface ParteRepository extends JpaRepository<Parte, Integer >{

}
