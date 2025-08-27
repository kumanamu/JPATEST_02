package com.my.jpaTest.service;

import com.my.jpaTest.entity.Member;
import com.my.jpaTest.entity.Team;
import jakarta.persistence.Query;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Service;
import org.springframework.test.context.TestPropertySource;

import java.util.List;



@SpringBootTest
@TestPropertySource(locations = "classpath:application-test.properties")

class QueryServiceTest {
    @Autowired
    QueryService queryService;

    @Test
    @DisplayName("이만기를 id로 찾기")
    void dynamicQuery() {
        List<Member> members = queryService.dynamicQuery();
        members.forEach(x -> System.out.println(x));
    }

    @Test
    @DisplayName("팀전체 가져오기")
    void findAllTeam() {
        List<Team> members = queryService.findAllTeam();
        members.forEach(x -> System.out.println(x));

    }

    @Test
    @DisplayName("씨름팀에 속해있는 멤버이름만 출력")
    void fineMemberSsirum() {
        List<Member> members = queryService.fineMemberSsrium();
        members.forEach(x -> System.out.println(x));
    }

    @Test
    @DisplayName("씨름팀 정보 가져오기")
    void fineMemberSsrium() {
        queryService.fineMemberSsrium().forEach(x -> System.out.println(x));
    }

    @Test
    @DisplayName("씨름팀 인원수 구해서 가져오기")
    void countSsirum() {
        System.out.println("씨름팀 인원수" + queryService.teamCount());
    }

    @Test
    @DisplayName("DTO 받기")
    void getDto() {
        queryService.getMemberDto().forEach(x -> System.out.println(x));

    }

    @Test
    @DisplayName("prjection 받기")
    void getProjection() {
        queryService.getProjection().forEach(x -> System.out.println(x));

    }
}