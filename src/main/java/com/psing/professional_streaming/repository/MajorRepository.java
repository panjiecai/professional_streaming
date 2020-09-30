package com.psing.professional_streaming.repository;

import com.psing.professional_streaming.dataobject.Major;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MajorRepository extends JpaRepository<Major,String> {

    Major findAllByInstitute(String institute);


}
