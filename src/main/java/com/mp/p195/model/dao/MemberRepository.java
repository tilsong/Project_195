package com.mp.p195.model.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mp.p195.model.entity.Member;

public interface MemberRepository extends JpaRepository<Member, Integer> {
}
