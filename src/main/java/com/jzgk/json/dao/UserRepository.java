package com.jzgk.json.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jzgk.json.pojo.UserPojo;

/**
 * 
 * @ClassName:  UserRepository   
 * @Description:JPA DAO层   
 * @author: LouYue 
 * @date:   2018年12月14日 下午3:26:05   
 *
 */
@Repository
public interface UserRepository extends JpaRepository<UserPojo, Long>{

}
