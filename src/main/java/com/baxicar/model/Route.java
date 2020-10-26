package com.baxicar.model;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@Entity
@Data

public class Route {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "route_id")
    private Long routeId;

    private Double originLatitude;

    private Double originLongitude;

    private Double destinationLatitude;

    private Double destinationLongitude;


    @OneToMany(
            mappedBy = "route",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
//    @JoinColumn(name = "route_id")
    @ToString.Exclude
    private List<Waypoint> waypoint;

    public void setWaypoint(List<Waypoint> waypoint) {
        if (waypoint != null) {
            waypoint.forEach(a -> {
                a.setRoute(this);
            });
        }
        this.waypoint = waypoint;
    }
}
