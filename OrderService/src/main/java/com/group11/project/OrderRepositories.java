package com.group11.project;

import org.springframework.data.jpa.repository.JpaRepository;

interface OrderRepo extends JpaRepository<OrderClass, String> {
}


interface LineItemRepo extends JpaRepository<LineItem, Long> {
}