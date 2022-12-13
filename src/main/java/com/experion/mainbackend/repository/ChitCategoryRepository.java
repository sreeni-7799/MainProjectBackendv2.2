package com.experion.mainbackend.repository;


import com.experion.mainbackend.entity.ChittyCategory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.Optional;

@CrossOrigin(origins = "*")
@RepositoryRestResource(collectionResourceRel = "chittycategory", path = "chittycategory")
public interface ChitCategoryRepository extends JpaRepository<ChittyCategory, Long> {

    @Override
    Optional<ChittyCategory> findById(Long id);

    Page<ChittyCategory> findBycategoryName(@Param("name") String categoryName, Pageable pageable);
}