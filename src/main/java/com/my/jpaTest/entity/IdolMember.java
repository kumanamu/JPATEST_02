package com.my.jpaTest.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor @AllArgsConstructor
@Builder
public class IdolMember {

    @Id
    public String id;
    public String name;
    @ManyToOne
    @JoinColumn(name="groupId")
    private GirlGroup girlGroup;



//    @Id
//    @Column(name = "member_id", length = 50)
//    private String id;              // 안유진, 장원영, 제니, 지수
//
//    @Column(name = "member_name", nullable = false, length = 50)
//    private String name;            // 유진, 원영, 째니, 지수다
//
//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "group_id")  // GirlGroup.id(group_id)와 매핑
//    private GirlGroup group;
}
