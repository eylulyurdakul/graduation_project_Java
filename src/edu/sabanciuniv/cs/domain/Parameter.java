package edu.sabanciuniv.cs.domain;

public class Parameter {

	
	private int id;
	private String name;
	private int programId;
	private String type;
	private String explanation;
	

	public Parameter() {
		// TODO Auto-generated constructor stub
	}

	public Parameter(int id, String name, int programId, String type, String explanation) {
	
		this.id = id;
		this.name = name;
		this.programId = programId;
		this.type = type;
		this.explanation = explanation;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getProgramId() {
		return programId;
	}

	public void setProgramId(int programId) {
		this.programId = programId;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getExplanation() {
		return explanation;
	}

	public void setExplanation(String explanation) {
		this.explanation = explanation;
	}
	
	
	
}
