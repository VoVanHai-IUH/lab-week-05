package vn.edu.iuh.fit.repositories;

import org.springframework.data.repository.CrudRepository;
import vn.edu.iuh.fit.models.Address;

import java.util.UUID;

public interface AddressRepository extends CrudRepository<Address, UUID> {
}
