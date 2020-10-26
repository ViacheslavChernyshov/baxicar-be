package com.baxicar.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Waypoint {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "waypoints_id")
    private Long waypointsId;

    private Double latitude;

    private Double longitude;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "route_id")
    private Route route;

//    public Long getWaypointsId() {
//        return waypointsId;
//    }
//
//    public void setWaypointsId(Long waypointsId) {
//        this.waypointsId = waypointsId;
//    }
//
//    public Double getLatitude() {
//        return latitude;
//    }
//
//    public void setLatitude(Double latitude) {
//        this.latitude = latitude;
//    }
//
//    public Double getLongitude() {
//        return longitude;
//    }
//
//    public void setLongitude(Double longitude) {
//        this.longitude = longitude;
//    }
//
//    public Route getRoute() {
//        return route;
//    }
//
    public void setRoute(Route route) {
        this.route = route;
    }
}
