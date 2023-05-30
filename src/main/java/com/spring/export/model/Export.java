package com.spring.export.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "export_table")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Export 
{
	private Long id;
	private String name;
	private String place;
}
