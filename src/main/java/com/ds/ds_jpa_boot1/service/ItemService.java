package com.ds.ds_jpa_boot1.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ds.ds_jpa_boot1.dto.ItemDto;
import com.ds.ds_jpa_boot1.entity.Item;
import com.ds.ds_jpa_boot1.repository.ItemRepository;



@Service
public class ItemService {
	
	@Autowired
	ItemRepository itemRepository;
	
	public List<ItemDto> getAllItems() {
    	//loop를 활용 하여 닉네임 설정
        return itemRepository.findAll().stream()
                .map(item -> new ItemDto(
                        item.getItemIdx(),
                        item.getName(),
                        item.getCreatedDate(),
                        item.getUser().getNick()  // User의 닉네임 가져오기
                )).collect(Collectors.toList());
        
       
    }
	
	 public Item saveItem(Item item) {
         return itemRepository.save(item);
     }
}
