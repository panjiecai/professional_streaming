package com.psing.professional_streaming.repository;


import com.psing.professional_streaming.dataobject.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepository extends JpaRepository<Admin,String> {

}
