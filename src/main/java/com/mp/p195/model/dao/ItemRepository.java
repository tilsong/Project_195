package com.mp.p195.model.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.mp.p195.model.entity.Item;

public interface ItemRepository extends JpaRepository<Item, Integer> {
}
