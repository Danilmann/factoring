package org.example.factoring.repository;

import com.example.pastebin.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {

    //List<Post> findAllByAuthor(String author);

}
