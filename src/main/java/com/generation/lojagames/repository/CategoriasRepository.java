package com.generation.lojagames.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.generation.lojagames.model.Categorias;

public interface CategoriasRepository extends JpaRepository <Categorias, Long>{
	
	List<Categorias> findAllByCategoriasContainingIgnoreCase(@Param("categorias") String categorias);

	
}


