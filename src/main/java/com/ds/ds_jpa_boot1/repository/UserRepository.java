package com.ds.ds_jpa_boot1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ds.ds_jpa_boot1.entity.User;




public interface UserRepository extends JpaRepository<User, Integer> {
//	// ID로 사용자 찾기
//    Optional<User> findById(String id);
//    
//    // 닉네임으로 사용자 찾기
//    Optional<User> findByNick(String nick);
//    
//    // ID가 존재하는지 확인
//    boolean existsById(String id);
//    
//    // 닉네임이 존재하는지 확인
//    boolean existsByNick(String nick);
}

