package com.ivlevks.firstAppOnSpringBoot.repo;

import com.ivlevks.firstAppOnSpringBoot.models.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Long> {


}
