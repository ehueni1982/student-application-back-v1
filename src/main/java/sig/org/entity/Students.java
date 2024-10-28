package sig.org.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "students")
public class Students {
	
	@Id
	private String id;
	private String studentname;
	private String studentadress;
	private String mobile;
	public Students() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Students(String id, String studentname, String studentadress, String mobile) {
		super();
		this.id = id;
		this.studentname = studentname;
		this.studentadress = studentadress;
		this.mobile = mobile;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getStudentname() {
		return studentname;
	}
	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}
	public String getStudentadress() {
		return studentadress;
	}
	public void setStudentadress(String studentadress) {
		this.studentadress = studentadress;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	@Override
	public String toString() {
		return "Students [id=" + id + ", studentname=" + studentname + ", studentadress=" + studentadress + ", mobile="
				+ mobile + "]";
	}
	
	
	

}
