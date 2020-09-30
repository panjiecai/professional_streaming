package com.psing.professional_streaming.repository;

import com.psing.professional_streaming.dataobject.Student;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student,String> {

    Student findByEmail(String email);

    Student findBySno(String sno);

    Page<Student> findAllByMajor(String major, Pageable pageable);
}
