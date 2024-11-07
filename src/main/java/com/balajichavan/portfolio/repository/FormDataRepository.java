package com.balajichavan.portfolio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.balajichavan.portfolio.model.FormData;

@Repository
public interface FormDataRepository extends JpaRepository<FormData, Long>{

}
