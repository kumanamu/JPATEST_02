package com.my.jpaTest.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class GirlGroup {

    @Id
    public String groupId;
    public String groupName;
    @ManyToOne(cascade = CascadeType.REMOVE)
    @JoinColumn(name = "enterId")
    Entertainment entertainment;

    @Builder.Default
    @OneToMany(mappedBy = "girlGroup", fetch = FetchType.EAGER, cascade = CascadeType.PERSIST)
    List<IdolMember> members = new ArrayList<>();


//    @Id
//    @Column(name = "group_id", length = 50)
//    private String id;              // ive, blackPink
//
//    @Column(name = "group_name", nullable = false, length = 50)
//    private String name;            // 아이브, 블핑
//
//    // 소유자(외래키 보유자) — @JoinColumn 사용, @Column 절대 금지
//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "ent_id")    // Entertainment.id(ent_id)와 매핑
//    private Entertainment entertainment;
//
//    // 그룹 1 : N 멤버 — 그룹 삭제 시 멤버도 같이 제거
//    @OneToMany(mappedBy = "group", cascade = CascadeType.REMOVE, orphanRemoval = true)
//    @Builder.Default
//    private List<IdolMember> members = new ArrayList<>();
//
//    public void addMember(IdolMember member) {
//        this.members.add(member);
//        member.setGroup(this);
//    }
}
