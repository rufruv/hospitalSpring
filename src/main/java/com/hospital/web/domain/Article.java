package com.hospital.web.domain;

import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
@Component @Data
public class Article {
	@Getter @Setter
	private String seq, id, title, contents, regdate, readCount;

	
	@Override
	public String toString() {
		return String.format("[ %s | %s | %s | %s | %s ]",seq, id, title, regdate, "0");
	}
}
