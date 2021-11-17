package com.example.twiterClone.repos;

import com.example.twiterClone.domain.Message;
import org.springframework.data.repository.CrudRepository;

public interface MessageRepo extends CrudRepository<Message, Integer> {
}
