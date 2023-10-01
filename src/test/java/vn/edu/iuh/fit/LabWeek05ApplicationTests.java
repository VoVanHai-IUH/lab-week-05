package vn.edu.iuh.fit;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import vn.edu.iuh.fit.enums.Country;
import vn.edu.iuh.fit.models.Address;
import vn.edu.iuh.fit.repositories.AddressRepository;

import java.util.UUID;

@SpringBootTest
class LabWeek05ApplicationTests {
	@Autowired
	private AddressRepository repository;
	@Test
	void add_test() {
		Address add=new Address(UUID.randomUUID(), "11","NVQ","sg","5345643", Country.AFGHANISTAN);
		repository.save(add);
	}

}
