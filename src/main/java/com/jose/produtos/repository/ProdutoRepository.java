package com.jose.produtos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jose.produtos.model.Produtos;

@Repository
public interface ProdutoRepository extends JpaRepository<Produtos, Long>{

}
