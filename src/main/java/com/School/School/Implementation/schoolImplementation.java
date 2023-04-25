package com.School.School.Implementation;

import com.School.School.Entity.School;
import com.School.School.Repository.schoolRepository;
import com.School.School.Service.schoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class schoolImplementation implements schoolService {

    @Autowired
    private schoolRepository schoolRepository;

    @Override
    public School createSchool(School school) {
      School savedSchool= schoolRepository.save(school);
      return savedSchool;
    }

    @Override
    public School getbyId(Integer id) {
       School school = schoolRepository.findById(id).orElseThrow(()->new RuntimeException("Not Found"));
        return school;
    }

    @Override
    public List<School> getAll() {
        return null;
    }

    @Override
    public School updateSchool(School school, Integer id) {
        return null;
    }
}
