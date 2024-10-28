package sig.org.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import sig.org.entity.Students;

public interface StudentRepository extends MongoRepository<Students, String> {
	
	
	

}
