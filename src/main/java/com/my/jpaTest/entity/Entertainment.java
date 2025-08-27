package com.my.jpaTest.entity;

import jakarta.persistence.*;
import lombok.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor @AllArgsConstructor @Builder
public class Entertainment {
    @Id
    public String enterId;
    public  String enterName;
    @OneToMany(mappedBy = "entertainment",
            fetch = FetchType.EAGER,
            cascade = CascadeType.PERSIST)
            @Builder.Default
    List<GirlGroup> groups = new ArrayList<>();
}

//    @Id
//    @Column(name = "ent_id", length = 50)
//    private String id;              // starship, YG
//
//    @Column(name = "ent_name", nullable = false, length = 50)
//    private String name;            // 스타쉽, 와이지
//
//    // 회사 1 : N 걸그룹 — 소유자 아님(읽기전용), mappedBy만 둠
//    @OneToMany(mappedBy = "entertainment", cascade = CascadeType.PERSIST)
//    @Builder.Default
//    private List<GirlGroup> groups = new ArrayList<>();
//
//    // 편의 메서드
//    public void addGroup(GirlGroup group) {
//        this.groups.add(group);
//        group.setEntertainment(this);
//    }
//}
