package com.example.yaapp.entity;

import org.springframework.data.annotation.Id;

import lombok.Value;

@Value
public final class Resource {
	
	private final @Id Long id;
	private final String name;
	private final String description;
	

}
