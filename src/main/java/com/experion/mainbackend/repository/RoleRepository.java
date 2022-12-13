package com.experion.mainbackend.repository;



import com.experion.mainbackend.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;


@RepositoryRestResource(collectionResourceRel = "role", path = "roles")
@CrossOrigin(origins = "*")
public interface RoleRepository extends JpaRepository<Role, Integer> {

}
