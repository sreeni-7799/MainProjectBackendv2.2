package com.experion.mainbackend.repository;

import com.experion.mainbackend.entity.UserLogin;
import org.hibernate.annotations.DynamicUpdate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@RepositoryRestResource(collectionResourceRel = "userlogin", path="users")
@CrossOrigin(origins="*")
@DynamicUpdate
public interface UserLoginRepository extends JpaRepository<UserLogin,Long> {

}
