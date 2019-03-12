package com.narvar.tryitshipit.web.persistence.repository;

import com.narvar.tryitshipit.web.persistence.dao.StoreInfoDAO;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StoreInfoRepository extends CrudRepository<StoreInfoDAO, Integer> {
}
