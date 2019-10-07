package com.baxicar.model;

import lombok.Data;
import org.springframework.security.core.GrantedAuthority;

import javax.persistence.*;

@Data
@Entity
@Table(name = "ROLES")
public class _RoleTemp implements GrantedAuthority {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private long id;

    @Enumerated(EnumType.STRING)
    @Column(name = "NAME")
    private Role name;

    @Column(name = "DESCRIPTION")
    private String description;

    @Override
    public String getAuthority() {
        return null;
    }
}
