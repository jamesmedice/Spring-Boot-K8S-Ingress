package com.medici.services.ambassador.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.medici.services.ambassador.model.Ambassador;

@RepositoryRestResource
public interface AmbassadorRepository extends CrudRepository<Ambassador, String> {

}
