package com.spring.export.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.export.model.Export;

@Repository
public interface ExportRepository extends JpaRepository<Export,Long>{

}
