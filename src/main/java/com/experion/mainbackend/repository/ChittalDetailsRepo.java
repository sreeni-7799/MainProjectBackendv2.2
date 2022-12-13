package com.experion.mainbackend.repository;


import com.experion.mainbackend.entity.ChittalDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins="*")
@RepositoryRestResource(collectionResourceRel = "chittaldetails",path="chittal-details")
public interface ChittalDetailsRepo extends JpaRepository<ChittalDetails,Long> {
}
