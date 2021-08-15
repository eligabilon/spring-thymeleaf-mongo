package com.spring.blog.utils;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.spring.blog.model.Post;
import com.spring.blog.repository.BlogRepository;

@Component
public class DummyData {

	@Autowired
	BlogRepository blogRepository;

	@PostConstruct
	public void savePosts() {

		List<Post> postList = new ArrayList<>();
		Post post1 = new Post();
		post1.setId(UUID.randomUUID().toString());
		post1.setAutor("Tadeu");
		post1.setData(LocalDateTime.now());
		post1.setTitulo("AWS");
		post1.setTexto(
				"Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.");

		Post post2 = new Post();
		post2.setId(UUID.randomUUID().toString());
		post2.setAutor("Abreu");
		post2.setData(LocalDateTime.now());
		post2.setTitulo("API REST");
		post2.setTexto(
				"Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.");

		postList.add(post1);
		postList.add(post2);

		for (Post post : postList) {
			Post postSaved = blogRepository.save(post);
			System.out.println(postSaved.getId());
		}
	}
}
