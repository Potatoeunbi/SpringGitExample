package com.example.myapp.board.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter @Getter
@ToString
public class BoardCategory {
	private int categoryId;
	private String categoryName;
	private String categoryDescription;
}
