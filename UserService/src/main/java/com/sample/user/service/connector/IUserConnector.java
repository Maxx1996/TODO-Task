package com.sample.user.service.connector;

import java.util.List;

import com.sample.user.service.bean.Task;


public sealed interface IUserConnector permits UserConnector{
	public List<Task> getTaskById(Long id);
	public List<Task> getTasks();
}
