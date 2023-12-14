package com.generation.lojagames.repository;

import java.math.BigDecimal;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.generation.lojagames.model.Produtos;

public interface ProdutosRepository extends JpaRepository <Produtos, Long> {
	
	List<Produtos> findAllByNomeContainingIgnoreCase(@Param("produto") String nome);
	
	List<Produtos> findAllByPrecoLessThan(BigDecimal preco);

	List<Produtos> findAllByPrecoGreaterThan(BigDecimal preco);

}
