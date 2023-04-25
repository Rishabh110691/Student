package com.School.School.Controller;

import com.School.School.Entity.School;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/school")
public class schoolController {

    @Autowired
    private schoolService schoolService;
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)

    public School createSchool(@Valid @RequestBody School school){
       School savedSchool= schoolService.createSchool(school);
       return savedSchool;
    }
    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public School getById(@PathVariable Integer id){
       School byId= schoolService.getById(id);
       return byId;

    }


}
