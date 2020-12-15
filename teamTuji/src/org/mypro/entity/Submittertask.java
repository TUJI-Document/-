package org.mypro.entity;

public class Submittertask {
	private Integer id;

	private String task;

	private Integer taskid;

	private String submitter;

	private Integer submitterid;

	private String closingdate;

	private String introduce;

	private String taskfile;

	private String state;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTask() {
		return task;
	}

	public void setTask(String task) {
		this.task = task == null ? null : task.trim();
	}

	public Integer getTaskid() {
		return taskid;
	}

	public void setTaskid(Integer taskid) {
		this.taskid = taskid;
	}

	public String getSubmitter() {
		return submitter;
	}

	public void setSubmitter(String submitter) {
		this.submitter = submitter == null ? null : submitter.trim();
	}

	public Integer getSubmitterid() {
		return submitterid;
	}

	public void setSubmitterid(Integer submitterid) {
		this.submitterid = submitterid;
	}

	public String getClosingdate() {
		return closingdate;
	}

	public void setClosingdate(String closingdate) {
		this.closingdate = closingdate == null ? null : closingdate.trim();
	}

	public String getIntroduce() {
		return introduce;
	}

	public void setIntroduce(String introduce) {
		this.introduce = introduce == null ? null : introduce.trim();
	}

	public String getTaskfile() {
		return taskfile;
	}

	public void setTaskfile(String taskfile) {
		this.taskfile = taskfile == null ? null : taskfile.trim();
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state == null ? null : state.trim();
	}
}