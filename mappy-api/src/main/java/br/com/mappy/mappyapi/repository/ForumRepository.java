package br.com.mappy.mappyapi.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.mappy.mappyapi.model.Forum;

public interface ForumRepository extends CrudRepository<Forum, Integer>{
}
