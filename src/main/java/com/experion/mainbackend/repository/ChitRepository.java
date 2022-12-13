package com.experion.mainbackend.repository;

import com.experion.mainbackend.entity.Chitty;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.Optional;


@CrossOrigin(origins = "*")
@RepositoryRestResource(collectionResourceRel = "chitty",path = "chitty")
public interface ChitRepository extends JpaRepository<Chitty,Long> {
    @Override
    Optional<Chitty> findById(Long aLong);

    Page<Chitty> findBychitNumber(@Param("chitno") Long chitNumber, Pageable pageable);

}
