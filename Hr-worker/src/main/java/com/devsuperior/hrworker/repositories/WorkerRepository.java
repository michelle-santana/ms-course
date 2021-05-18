package com.devSuperior.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devSuperior.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long> {

}
