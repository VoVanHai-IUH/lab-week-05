package vn.edu.iuh.fit.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.edu.iuh.fit.models.Candidate;

import java.util.UUID;

public interface CandidateRepository extends JpaRepository<Candidate, Long> {
}
