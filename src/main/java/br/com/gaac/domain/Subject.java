/** Class that represents Subject
 * @author Felipe Duarte
 * @version 1.0.0 */

package br.com.gaac.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

@Entity
@Table(name = "subject")
public class Subject implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull(message = "${msg.null}")
	@Length(min=7, max=7, message = "O campo deve ter {max} caracteres")
	@Column(columnDefinition = "char(7)")
	private String code;
	
	@NotNull(message = "${msg.null}")
	@Length(min=3, message = "O campo deve ter no mínimo {min} caracteres")
	@Column(columnDefinition = "varchar(50)")
	private String name;
	
	@NotNull(message = "${msg.null}")
	@Column(columnDefinition = "text")
	private String menu;
	
	@NotNull(message = "${msg.null}")
	@Column(columnDefinition = "unsigned")
	private Float workload;
	
	@NotNull(message = "${msg.null}")
	@Column(columnDefinition = "tinyint unsigned")
	private Integer amountTime;
	
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "subject_dependencie", 
		joinColumns = @JoinColumn(name = "subject_id"),
		inverseJoinColumns = @JoinColumn(name = "dependencie"))
	private List<Subject> dependencies = new ArrayList<>();
	
	@ManyToMany(mappedBy = "subjects", fetch = FetchType.LAZY)
	private List<Period> periods = new ArrayList<>();
	
	@ManyToMany(mappedBy = "subjects", fetch = FetchType.LAZY)
	private List<StudentPeriod> studentPeriods = new ArrayList<>();
	
	@ManyToMany(mappedBy = "subjects", fetch = FetchType.LAZY)
	private List<Teacher> teachers = new ArrayList<>();
	
	@OneToMany(mappedBy = "subject", fetch = FetchType.LAZY)
	private List<File> files  = new ArrayList<>();
	
	public Subject() {
		
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public String getCode() {
		return code;
	}
	
	public void setCode(String code) {
		this.code = code;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMenu() {
		return menu;
	}
	
	public void setMenu(String menu) {
		this.menu = menu;
	}

	public Float getWorkload() {
		return workload;
	}

	public void setWorkload(Float workload) {
		this.workload = workload;
	}
	
	public Integer getAmountTime() {
		return amountTime;
	}

	public void setAmountTime(Integer amountTime) {
		this.amountTime = amountTime;
	}
	
	public List<Subject> getDependencies() {
		return dependencies;
	}

	public void setDependencies(List<Subject> dependencies) {
		this.dependencies = dependencies;
	}

	public List<Period> getPeriods() {
		return periods;
	}

	public void setPeriods(List<Period> periods) {
		this.periods = periods;
	}

	public List<StudentPeriod> getStudentPeriods() {
		return studentPeriods;
	}

	public void setStudentPeriods(List<StudentPeriod> studentPeriods) {
		this.studentPeriods = studentPeriods;
	}

	public List<Teacher> getTeachers() {
		return teachers;
	}

	public void setTeachers(List<Teacher> teachers) {
		this.teachers = teachers;
	}

	public List<File> getFiles() {
		return files;
	}

	public void setFiles(List<File> files) {
		this.files = files;
	}

	public void addDependencie(Subject subject) {
		this.dependencies.add(subject);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Subject other = (Subject) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
}
