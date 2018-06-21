/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.restfulllibrary.restfull.repositories;

import com.restfulllibrary.restfull.entities.User;
import java.util.List;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 *
 * @author Mehdi
 */
@RepositoryRestResource(collectionResourceRel = "people", path = "people" )
public interface PersonRepository extends PagingAndSortingRepository<User, Long>
{
    public List<User> findByLastName(@Param("name") String name);
}
