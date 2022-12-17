package com.experion.mainbackend.controller;

import com.experion.mainbackend.entity.Chitty;
import com.experion.mainbackend.service.ChittalUserIdService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Data
@RestController
public class ChittalUserIdController {

    @Autowired
   private ChittalUserIdService chittalUserIdService;

    @GetMapping("*/getchitties/{id}")
    List<Long> getChitties(@PathVariable Long id){
        return chittalUserIdService.getChitties(id);
    }
}
