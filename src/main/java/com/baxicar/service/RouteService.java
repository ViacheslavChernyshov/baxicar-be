package com.baxicar.service;

import com.baxicar.model.Route;
import com.baxicar.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface RouteService {


    Route save(Route route);
//    List<User> findAll();
//    User findOne(long id);
//    void delete(long id);
}
