package edu.kh.todoList.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Todo {
	
	private int todoNo; // 번호
	private String todoTitle; // 제목
	private String todoDetail; // 상세정보
	private boolean todoComplete; // 완료여부
	private String regDate; // 등록일
}
