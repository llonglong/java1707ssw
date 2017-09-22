package com.situ.ssm.pojo;

public class BanjiCourse {
	private Integer id;
	private Banji banji;
	private Course course;
	
	public BanjiCourse() {
		super();
	}

	public BanjiCourse(Integer id, Banji banji, Course course) {
		super();
		this.id = id;
		this.banji = banji;
		this.course = course;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Banji getBanji() {
		return banji;
	}

	public void setBanji(Banji banji) {
		this.banji = banji;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "BanjiCourse [id=" + id + ", banji=" + banji + ", course=" + course + "]";
	}
	
	
	
}
