package com.sample.user.service.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sample.user.service.bean.User;


@Repository
@Transactional
public interface UserRepository extends JpaRepository<User, Long>{
}

