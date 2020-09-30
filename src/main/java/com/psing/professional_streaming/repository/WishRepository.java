package com.psing.professional_streaming.repository;

import com.psing.professional_streaming.dataobject.Wish;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WishRepository extends JpaRepository<Wish,Integer> {

    //学生查看自己的志愿
    List<Wish> findAllBySno(String sno);
    //专业负责人查看填报本专业的学生
    Page<Wish> findAllByWishMajor(String wishMajor, Pageable pageable);
}
