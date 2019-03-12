package com.narvar.tryitshipit.web.persistence.repository;

import com.narvar.tryitshipit.web.persistence.dao.RequestDAO;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RequestRepository extends CrudRepository<RequestDAO, Integer> {
}
