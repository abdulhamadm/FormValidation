package com.validation.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.validation.model.Input;

@Repository
public interface ValidationRepository extends CrudRepository<Input, Long>{


}
