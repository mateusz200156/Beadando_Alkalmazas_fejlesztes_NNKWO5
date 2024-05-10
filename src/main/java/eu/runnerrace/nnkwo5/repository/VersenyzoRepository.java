package eu.runnerrace.nnkwo5.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import eu.runnerrace.nnkwo5.entry.VersenyzoEntry;

public interface VersenyzoRepository extends JpaRepository<VersenyzoEntry,Long > {}