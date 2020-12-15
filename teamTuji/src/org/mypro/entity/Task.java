package org.mypro.entity;

public class Task {
	private Integer id;

	private String name;

	private String introduce;

	private String closingdate;

	private String file;

	private String submitternumber;

	private String collector;

	private Integer collectorid;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name == null ? null : name.trim();
	}

	public String getIntroduce() {
		return introduce;
	}

	public void setIntroduce(String introduce) {
		this.introduce = introduce == null ? null : introduce.trim();
	}

	public String getClosingdate() {
		return closingdate;
	}

	public void setClosingdate(String closingdate) {
		this.closingdate = closingdate == null ? null : closingdate.trim();
	}

	public String getFile() {
		return file;
	}

	public void setFile(String file) {
		this.file = file == null ? null : file.trim();
	}

	public String getSubmitternumber() {
		return submitternumber;
	}

	public void setSubmitternumber(String submitternumber) {
		this.submitternumber = submitternumber == null ? null : submitternumber.trim();
	}

	public String getCollector() {
		return collector;
	}

	public void setCollector(String collector) {
		this.collector = collector == null ? null : collector.trim();
	}

	public Integer getCollectorid() {
		return collectorid;
	}

	public void setCollectorid(Integer collectorid) {
		this.collectorid = collectorid;
	}
}