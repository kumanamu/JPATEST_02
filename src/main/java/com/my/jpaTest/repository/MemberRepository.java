package com.my.jpaTest.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.lang.reflect.Member;
import java.util.List;

public interface MemberRepository extends JpaRepository<Member, String>{
    @Query("SELECT m.name AS memberName, t.teamName As teamName") + ("FROM Member m JOIN m.team t");
    List<MemberRepository> findProjection;
}
