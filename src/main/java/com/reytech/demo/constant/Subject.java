package com.reytech.demo.constant;

public enum Subject {
	MYANMAR("Myanmar"),
	ENGLISH("English"),
	MATH("Math"),
	CHEMISTRY("Chemistry"),
	PHYSICS("Physics"),
	BIO("Bio"),
	ECO("Eco");

	private final String value;

	private Subject(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}
}
