package com.queijos_finos.main.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import com.queijos_finos.main.model.Fornecedor;

public interface FornecedorRepository extends JpaRepository<Fornecedor, Long> {
    Page<Fornecedor> findAll(Pageable pageable);
}
