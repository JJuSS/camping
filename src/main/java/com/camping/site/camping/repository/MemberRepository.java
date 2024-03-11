package com.camping.site.camping.repository;

import com.camping.site.camping.entity.MemberEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MemberRepository extends JpaRepository<MemberEntity, Long> {
    // 이메일로 회원 정보 조회(selelct * from member_table where member_email=?)
    Optional<MemberEntity> findByMemberEmail(String memberEmail);
}
