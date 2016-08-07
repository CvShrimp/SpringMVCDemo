package com.cvshrimp.mvcdemo.model;

public class Chapter {
	
	private Integer Id;
	
	private Integer courseId;
	
	private Integer order;
	
	private String title;
	
	private String desc;

	public Chapter(Integer id, Integer courseId, Integer order, String title,
			String desc) {
		super();
		Id = id;
		this.courseId = courseId;
		this.order = order;
		this.title = title;
		this.desc = desc;
	}
	
	public Chapter() {
		super();
	}

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public Integer getCourseId() {
		return courseId;
	}

	public void setCourseId(Integer courseId) {
		this.courseId = courseId;
	}

	public Integer getOrder() {
		return order;
	}

	public void setOrder(Integer order) {
		this.order = order;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}
	
}
