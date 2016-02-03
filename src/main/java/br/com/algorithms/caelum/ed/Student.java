package br.com.algorithms.caelum.ed;

public class Student {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return this.name;
	}

	@Override
	public boolean equals(Object obj) {
		Student other = (Student) obj;
		return this.name.equals(other.getName());
	}
	
}
