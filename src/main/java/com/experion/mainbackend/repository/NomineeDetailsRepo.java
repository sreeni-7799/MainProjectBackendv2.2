package com.experion.mainbackend.repository;

import com.experion.mainbackend.entity.NomineeDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins="*")
@RepositoryRestResource(collectionResourceRel = "nomineedetails",path="nominee-details")
public interface NomineeDetailsRepo extends JpaRepository<NomineeDetails,Long> {
}
