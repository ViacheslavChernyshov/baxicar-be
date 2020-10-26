package com.baxicar.repository;

import com.baxicar.model.Route;
import com.baxicar.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RouteRepository extends JpaRepository<Route, Long> {
    User save(String username);
}
