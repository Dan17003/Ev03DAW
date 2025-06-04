package com.tecsup.ev03Mendoza.domain.persistence;


import com.tecsup.ev03Mendoza.domain.entities.Curso;
import org.springframework.data.repository.CrudRepository;

public interface CursoDao extends CrudRepository<Curso,Integer> {
}