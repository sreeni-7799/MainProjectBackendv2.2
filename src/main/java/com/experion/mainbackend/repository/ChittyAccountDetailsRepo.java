package com.experion.mainbackend.repository;

import com.experion.mainbackend.entity.ChittyAccountDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins="*")
@RepositoryRestResource(collectionResourceRel = "chittyaccountdetails",path="chittyaccountdetails")
public interface ChittyAccountDetailsRepo extends JpaRepository<ChittyAccountDetails,Long>
{

}


