package com.sample.user.service.bean;


public class Task {

	private Long id;
	private String name;
	private Long userId;
	
	public Task() {}
	
	public Task(Long id, String name, Long userId) {
		super();
		this.id = id;
		this.name = name;
		this.userId = userId;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	@Override
	public String toString() {
		return "Task [id=" + id + ", name=" + name + ", userId=" + userId + "]";
	}
}
