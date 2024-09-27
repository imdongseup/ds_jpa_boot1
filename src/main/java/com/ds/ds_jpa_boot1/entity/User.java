package com.ds.ds_jpa_boot1.entity;

import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class User {
    
	@Id
    @Column(name="user_idx")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userIdx;

    // 사용자 ID (로그인용)
    @Column(name="id")  // null이 허용되지 않고, 유니크해야 함
    private String id;

    // 비밀번호
    @Column(name="pw")
    private String pw;

    // 닉네임
    @Column(name="nick")  // 닉네임도 유니크하도록 설정
    private String nick;

    // 생성 시간
    @Column(name = "created_date")
   
    private LocalDateTime createdDate;
    
    @OneToMany(mappedBy = "user",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private List<Item> items;
//
//    // 마지막 업데이트 시간
//    @Temporal(TemporalType.TIMESTAMP)
//    private java.util.Date updatedAt;

}

