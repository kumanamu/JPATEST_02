package com.my.jpaTest.service;


import com.my.jpaTest.entity.Entertainment;
import com.my.jpaTest.entity.GirlGroup;
import com.my.jpaTest.entity.IdolMember;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class EnterService {

    @Autowired
    EntityManager em;

    //엔터 생성
    Entertainment starship = Entertainment.builder().enterId("starship").enterName("스타쉽").build();
    Entertainment YG = Entertainment.builder().enterId("YG").enterName("와이지").build();

    //그룹 생성, 엔터 등록
    GirlGroup ive = GirlGroup.builder().groupId("ive").groupName("아이브").entertainment(starship).build();
    GirlGroup black = GirlGroup.builder().groupId("blackPink").groupName("블랙핑크").entertainment(YG).build();

    //아이돌 생성, 그룹 등록
    IdolMember ahn = IdolMember.builder().id("안유진").name("유진").girlGroup(ive).build();
    IdolMember jang = IdolMember.builder().id("장원영").name("원영").girlGroup(ive).build();
    IdolMember jeni = IdolMember.builder().id("제니").name("째니").girlGroup(black).build();
    IdolMember jisu = IdolMember.builder().id("지수").name("찌수").girlGroup(black).build();

    //엔터에 그룹리스트 등록
    starship.getGroups().add(ive);
        YG.getGroups().add(black);

    //그룹에 아이돌 리스트 등록
    ive.getMembers().add(ahn);
        ive.getMembers().add(jang);
            black.getMembers().add(jeni);
            black.getMembers().add(jisu);


    // 스타쉽 저장
    em.persist(starship);
    // 와이지 저장
        em.persist(YG);

}
