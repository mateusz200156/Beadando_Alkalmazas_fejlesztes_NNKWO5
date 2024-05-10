package eu.runnerrace.nnkwo5.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import eu.runnerrace.nnkwo5.entry.EredmenyEntry;

public interface EredmenyRepository extends JpaRepository<EredmenyEntry,Long > {
    List<EredmenyEntry> findAllByVerseny_VersenyId(Long id);
}