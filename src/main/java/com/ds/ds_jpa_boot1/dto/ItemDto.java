package com.ds.ds_jpa_boot1.dto;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ItemDto {
	
	private Integer itemIdx;
    private String name;
    private LocalDateTime createdDate;
    private String userNick;
    
    
    
    

}
