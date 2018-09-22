package edu.sabanciuniv.cs.domain;

public class Argument {
	
	private int id;
	private int jobId;
	private int parameterId;
	private String value;
	
	public Argument() {
		
	}
	
	public Argument(int id, int jobId, int parameterId, String value) {
		super();
		this.id = id;
		this.jobId = jobId;
		this.parameterId = parameterId;
		this.value = value;
	}
	
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getJobId() {
		return jobId;
	}

	public void setJobId(int jobId) {
		this.jobId = jobId;
	}

	public int getParameterId() {
		return parameterId;
	}

	public void setParameterId(int parameterId) {
		this.parameterId = parameterId;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	

}
