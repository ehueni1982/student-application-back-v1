package sig.org.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sig.org.entity.Students;
import sig.org.repo.StudentRepository;

@Service
public class StudentService {

	@Autowired
	private StudentRepository studentRepository;
	
	public void savingdata(Students students) {
		
		studentRepository.save(students);
		
	}

	public Iterable<Students> listAll() {
		
		
		return this.studentRepository.findAll();
	}

	public void deleteStudents(String _id) {
		
		studentRepository.deleteById(_id);
		
	}

	public Students getStudent(String studentid) {
		
		return studentRepository.findById(studentid).get();
	}

	
	
	

}
