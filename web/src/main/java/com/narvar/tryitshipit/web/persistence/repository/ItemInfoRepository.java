package com.narvar.tryitshipit.web.persistence.repository;

import com.narvar.tryitshipit.web.persistence.dao.ItemInfoDAO;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemInfoRepository extends CrudRepository<ItemInfoDAO, Integer> {
}
