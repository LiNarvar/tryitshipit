package com.narvar.tryitshipit.web.persistence.repository;

import com.narvar.tryitshipit.web.persistence.dao.ReservationItemDAO;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservationItemRepository extends CrudRepository<ReservationItemDAO, Integer> {
}
