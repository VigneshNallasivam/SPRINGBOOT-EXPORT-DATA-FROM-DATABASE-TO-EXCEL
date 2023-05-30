package com.spring.export.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.export.model.Export;
import com.spring.export.repository.ExportRepository;

@Service
public class ExportService 
{
	@Autowired
    ExportRepository exportRepository;

    @Override
    public void addDetails(Export export) {
    	exportRepository.save(export);
    }
    @Override
    public List <Export> getTheDataList() {
        return exportRepository.findAll();
    }

}
