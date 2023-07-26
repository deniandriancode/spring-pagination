package io.fam.paging;

import org.springframework.stereotype.*;
import jakarta.persistence.*;

@Entity
public class Docu {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String content;

	public Docu() {}
	
	public Docu(String content) {
		this.content = content;
	}
	
	public Docu(Long id, String content) {
		this.id = id;
		this.content = content;
	}

	public Long getId() {
		return id;
	}

	public String getContent() {
		return content;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public String toString() {
		return String.format("Docu[id=%l, content=%s]", id, content);
	}

}
