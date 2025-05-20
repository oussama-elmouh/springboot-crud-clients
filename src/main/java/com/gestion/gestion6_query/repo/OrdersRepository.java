package com.gestion.gestion6_query.repo;

import com.gestion.gestion6_query.entity.Orders;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrdersRepository extends JpaRepository<Orders, Long> {
}
