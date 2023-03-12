package com.sample.task.service.service;

import java.util.List;
import java.util.Optional;

import com.sample.task.service.bean.Task;


public interface ITaskService {
	
	public void addTask(Task task);
	
	public void removeTaskById(Long id);

	public Optional<Task> getTask(Long id);

	public List<Task> getTaskssByUserId(Long userId);

	public List<Task> getTasks();
}
