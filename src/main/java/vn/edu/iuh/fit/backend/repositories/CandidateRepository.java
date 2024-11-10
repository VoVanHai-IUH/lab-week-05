package vn.edu.iuh.fit.backend.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import vn.edu.iuh.fit.backend.models.Candidate;

import java.util.List;

//@RepositoryRestResource(collectionResourceRel = "candidates", path = "candidates")
//public interface CandidateRepository extends PagingAndSortingRepository<Candidate, Long> {
public interface CandidateRepository extends JpaRepository<Candidate, Long> {
    Page<Candidate> findAllByStatus(int status, Pageable pageable);
}
