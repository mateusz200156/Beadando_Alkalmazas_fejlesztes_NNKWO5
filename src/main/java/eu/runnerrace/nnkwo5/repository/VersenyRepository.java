package eu.runnerrace.nnkwo5.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import eu.runnerrace.nnkwo5.entry.VersenyEntry;

public interface VersenyRepository extends JpaRepository<VersenyEntry,Long > {}
