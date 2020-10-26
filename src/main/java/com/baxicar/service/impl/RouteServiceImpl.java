package com.baxicar.service.impl;

import com.baxicar.model.Route;
import com.baxicar.model.User;
import com.baxicar.repository.RouteRepository;
import com.baxicar.repository.UserRepository;
import com.baxicar.service.RouteService;
import com.baxicar.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class RouteServiceImpl implements RouteService {

    private final RouteRepository routeRepository;

    public RouteServiceImpl(RouteRepository routeRepository) {
        this.routeRepository = routeRepository;
    }

    @Override
    public Route save(Route route) {
        return routeRepository.save(route);
    }

//    public UserDetails loadUserByUsername(String userId) throws UsernameNotFoundException {
//        User user = userDao.findByUsername(userId);
//        if (user == null) {
//            throw new UsernameNotFoundException("Invalid username or password.");
//        }
//        return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(), getAuthority(user));
//    }
//
//
//    private Set<SimpleGrantedAuthority> getAuthority(User user) {
//        Set<SimpleGrantedAuthority> authorities = new HashSet<>();
//        user.getRoles().forEach(role -> {
//            //authorities.add(new SimpleGrantedAuthority(role.getName()));
//            authorities.add(new SimpleGrantedAuthority("ROLE_" + role.name()));
//        });
//        return authorities;
//    }
//
//    public List<User> findAll() {
//        List<User> list = new ArrayList<>();
//        userDao.findAll().iterator().forEachRemaining(list::add);
//        return list;
//    }
//
//    @Override
//    public User findOne(long id) {
//        return userDao.findById(id).get();
//    }
//
//    @Override
//    public void delete(long id) {
//        userDao.deleteById(id);
//    }
//
//    @Override
//    public User save(User user) {
//        return userDao.save(user);
//    }
}
