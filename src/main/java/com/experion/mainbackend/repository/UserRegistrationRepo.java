package com.experion.mainbackend.repository;
import com.experion.mainbackend.entity.UserRegistration;
import org.hibernate.annotations.DynamicUpdate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;


@CrossOrigin(origins = "*")
@RepositoryRestResource(collectionResourceRel = "userprofile",path="user-profile")
@DynamicUpdate
public interface UserRegistrationRepo extends JpaRepository<UserRegistration,Long>
{
}
