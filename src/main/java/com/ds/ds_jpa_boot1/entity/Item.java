package com.ds.ds_jpa_boot1.entity;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Item {
	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer itemIdx;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "created_date")
	   
    private LocalDateTime createdDate;
	
	@ManyToOne
	@JoinColumn(name = "user_idx", insertable = false, updatable = false)
	@JsonIgnore
	private User user;
}
