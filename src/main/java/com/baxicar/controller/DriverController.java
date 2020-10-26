package com.baxicar.controller;

import com.baxicar.model.Route;

import com.baxicar.model.Waypoint;
import com.baxicar.service.RouteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/driver")
public class DriverController {

    private final RouteService routeService;

    public DriverController(RouteService routeService) {
        this.routeService = routeService;
    }
//
//    @PreAuthorize("hasRole('DRIVER') or hasRole('ADMIN')")
//    @RequestMapping(value = "/user", method = RequestMethod.GET)
//    public List<User> listUser() {
//        return userService.findAll();
//    }


    @PreAuthorize("hasRole('DRIVER') or hasRole('ADMIN')")
    @RequestMapping(value = "/addUserRoute", method = RequestMethod.POST)
    public Route create(@RequestBody Route route) {
        System.out.println(route.toString());

        ArrayList<Waypoint> waypoints = new ArrayList<>(route.getWaypoint());
        route.setWaypoint(waypoints);
        Route routez = routeService.save(route);
        System.out.println(routez);
        return null;
    }


//    @PreAuthorize("hasRole('DRIVER')")
//    @RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
//    public User findOne(@PathVariable long id) {
//        return userService.findOne(id);
//    }
//
//    @PreAuthorize("hasRole('ADMIN')")
//    //@Secured("ROLE_ADMIN")
//    @RequestMapping(value = "/user/{id}", method = RequestMethod.PUT)
//    public User update(@PathVariable long id, @RequestBody User user) {
//        user.setId(id);
//        return userService.save(user);
//    }
//
//    @RequestMapping(value = "/user/{id}", method = RequestMethod.DELETE)
//    public void delete(@PathVariable(value = "id") Long id) {
//        userService.delete(id);
//    }

}
