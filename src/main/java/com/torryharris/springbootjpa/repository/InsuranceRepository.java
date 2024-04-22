package com.torryharris.springbootjpa.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.torryharris.springbootjpa.entity.Insurance;

@Repository
public interface InsuranceRepository extends CrudRepository<Insurance, Integer>{

}
