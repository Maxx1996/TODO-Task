package com.sample.task.service.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sample.task.service.bean.Task;


@Repository
@Transactional
public interface TaskRepository extends JpaRepository<Task, Long>{
	List<Task> findByuserId(Long userId);
}
