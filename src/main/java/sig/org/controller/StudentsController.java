package sig.org.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import sig.org.entity.Students;
import sig.org.service.StudentService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/v1/students")
public class StudentsController {
	
	@Autowired
	private StudentService studentService;
	
	@PostMapping(value = "/save")
	private String saveStudents(@RequestBody Students students) {
		
		
		studentService.savingdata(students);
		return students.getId();
		
	}
	
	@GetMapping(value = "/getAll")
	private Iterable<Students>getStudents() {
		
		
		return studentService.listAll();
		
	}
	
	@PutMapping(value = "/update/{id}")
	private Students update(@RequestBody Students student, @PathVariable(name="id") String _id) {
		
		
		student.setId(_id);
		studentService.savingdata(student);
		return student;
		
	}
	
	@DeleteMapping(value="/delete/{id}")
	private void deleteStudent(@PathVariable("id") String _id){
		
		studentService.deleteStudents(_id);
		
	}
	
	@RequestMapping("/search/{id}")
	private Students getStudents(@PathVariable(name="id")String studentid) {
		
		return studentService.getStudent(studentid);
		
	}
	
	
	

}
