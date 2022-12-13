package com.experion.mainbackend.entity;

import lombok.Data;
import net.minidev.json.annotate.JsonIgnore;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@Table(name = "role")
public class Role {

    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "rolename")
    private String roleName;

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "role")
    @JsonIgnore
    private List<UserLogin>userLogins=new ArrayList<>();
}
