package com.School.School.Service;

import com.School.School.Entity.School;

import java.util.List;

public interface schoolService {
    public School createSchool(School school);
    public School getbyId(Integer id);
    public List<School> getAll();
    public School updateSchool(School school,Integer id);
}
