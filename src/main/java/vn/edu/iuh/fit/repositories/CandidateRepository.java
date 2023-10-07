package vn.edu.iuh.fit.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import vn.edu.iuh.fit.models.Candidate;

import java.util.UUID;

@RepositoryRestResource(collectionResourceRel = "candidates", path = "candidates")
public interface CandidateRepository extends JpaRepository<Candidate, Long> {
}
