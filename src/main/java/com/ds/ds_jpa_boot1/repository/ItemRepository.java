package com.ds.ds_jpa_boot1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ds.ds_jpa_boot1.entity.Item;

public interface ItemRepository extends JpaRepository<Item, Integer>  {

}
