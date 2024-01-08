package com.chainofresponsibility.repository;

import com.chainofresponsibility.entity.Layer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LayerRepository extends JpaRepository<Layer, Long> {
}
