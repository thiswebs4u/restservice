package com.example.repository;

import com.example.entity.*;
import org.springframework.data.jpa.repository.*;

public interface ItemRepository extends JpaRepository<Item, Long> {
}
