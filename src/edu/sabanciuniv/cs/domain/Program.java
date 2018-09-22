package edu.sabanciuniv.cs.domain;

public class Program {

	private int id;
	private String name;
	private String explanation;
	private String outfileName;
	
	
	public Program() {
		// TODO Auto-generated constructor stub
	}


	public Program(int id, String name, String explanation, String outfileName) {
		super();
		this.id = id;
		this.name = name;
		this.explanation = explanation;
		this.outfileName = outfileName;
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


	public String getExplanation() {
		return explanation;
	}


	public void setExplanation(String explanation) {
		this.explanation = explanation;
	}


	public String getOutfileName() {
		return outfileName;
	}


	public void setOutfileName(String outfileName) {
		this.outfileName = outfileName;
	}
	
	
	
	
}
