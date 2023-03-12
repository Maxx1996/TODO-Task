package com.sample.user.service.connector;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.sample.user.service.bean.Task;
import com.sample.user.service.configuration.Configuration;


@Component
public final class UserConnector implements IUserConnector {

	private final Configuration configuration;
	
	public UserConnector(Configuration configuration) {
		super();
		this.configuration = configuration;
	}

	@Override
	public List<Task> getTaskById(Long id) {
		RestTemplate restTemplate = new RestTemplate();
		Task[] tasks = restTemplate.getForObject(
				configuration.getUrl() + "/" + id + "/tasks", 
				Task[].class);
		return Arrays.asList(tasks);
	}
	
	@Override
	public List<Task> getTasks() {
		RestTemplate restTemplate = new RestTemplate();
		Task[] tasks = restTemplate.getForObject(
				configuration.getUrl() + "/tasks", 
				Task[].class);
		return Arrays.asList(tasks);
	}

}
