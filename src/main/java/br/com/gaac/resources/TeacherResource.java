/** Class that represents the resource the TeacherResource
 * Author of the Struct
 * @author Gabriel Oliveira o terror delas
 * @version 1.0.0 */
package br.com.gaac.resources;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.gaac.domain.Subject;
import br.com.gaac.domain.Teacher;
import br.com.gaac.resources.exceptions.ObjectBadRequestException;
import br.com.gaac.resources.exceptions.ObjectNotFoundException;
import br.com.gaac.services.TeacherService;

@RestController
@RequestMapping("/teacher")
public class TeacherResource {

	@Autowired
	private CourseResource courseResource;

	@Autowired
	private FileResource fileResource;

	@Autowired
	private SubjectResource subjectResource;

	@Autowired
	private TeacherService teacherService;

	/** @author Felipe Duarte */
	@PostMapping
	public ResponseEntity<Teacher> save(@RequestBody @Valid Teacher teacher) {

		teacher = this.teacherService.save(teacher);

		if (teacher == null) {
			throw new ObjectBadRequestException("Professor Já Cadastrado");
		}

		return ResponseEntity.status(HttpStatus.CREATED).body(teacher);
	}

	/** @Author Jorge Gabriel */
	@PutMapping
	public ResponseEntity<Teacher> update(@RequestBody @Valid Teacher teacher) {
		Teacher t = this.teacherService.update(teacher);

		if (t == null) {

			throw new ObjectNotFoundException("Nenhum professor encontrado!");

		}
		return ResponseEntity.status(HttpStatus.OK).body(t);

	}

	@DeleteMapping("/{id}")
	public ResponseEntity<?> delete(@PathVariable("id") Long id) {
		boolean t = this.teacherService.delete(id);

		if (t == false)
			throw new ObjectNotFoundException("Nenhum Professor Encontrado!");

		return ResponseEntity.status(HttpStatus.OK).build();

	}

	/** @author Felipe Duarte */
	@PostMapping("/subject")
	public ResponseEntity<Teacher> addSubject(@RequestParam Long idTeacher, @RequestParam Long idSubject) {

		Teacher teacher = this.teacherService.findById(idTeacher);
		if (teacher == null) {
			throw new ObjectBadRequestException("Id do Professor inválido!");
		}

		Subject subject = this.subjectResource.findById(idSubject);
		if (subject == null) {
			throw new ObjectBadRequestException("Id da Disciplina inválido!");
		}

		teacher = this.teacherService.addSubject(teacher, teacher.getCourses(), subject);

		if (teacher == null) {
			throw new ObjectBadRequestException("Disciplina já associada ao professor!");

		} else {

			if (teacher.getCourses() == null) {
				throw new ObjectBadRequestException("Professor não associado a algum curso!");

			} else {

				if (teacher.getSubjects() == null) {
					throw new ObjectBadRequestException("Disciplina não está entre os cursos do professor!");

				}

			}

		}

		return ResponseEntity.status(HttpStatus.OK).body(teacher);
	}

	/** @author Gabriel Almeida */
	@DeleteMapping("/subject")
	public ResponseEntity<Teacher> rmvSubject(@RequestParam Long idTeacher, @RequestParam Long idSubject) {
		Teacher teacher = this.teacherService.findById(idTeacher);
		if (teacher == null) {
			throw new ObjectBadRequestException("Id do Professor inválido!");
		}

		Subject subject = this.subjectResource.findById(idSubject);
		if (subject == null) {
			throw new ObjectBadRequestException("Id da Disciplina inválido!");
		}

		teacher = this.teacherService.rmvSubject(teacher, subject);
		if (teacher == null) {
			throw new ObjectBadRequestException("Esta materia nao pertence a este professor!");
			
		}

		return ResponseEntity.status(HttpStatus.OK).body(teacher);
	}

	/** @author Gabriel Oliveira */
	@PutMapping("/enable/{id}")
	public ResponseEntity<Teacher> enable(@PathVariable("id") Long id) {
		Teacher enab = this.teacherService.enable(id);

		if (enab != null) {
			return ResponseEntity.status(HttpStatus.OK).build();
		}
		throw new ObjectNotFoundException("Id do professor que você solicitou dar permissão não foi encontrado!");
	}

	/** @author Jorge Gabriel */
	@PutMapping("/disable/{id}")
	public ResponseEntity<Teacher> disable(@PathVariable("id") Long id) {

		Teacher teacher = this.teacherService.disable(id);

		if (teacher == null) {
			throw new ObjectNotFoundException("Professor não encontrado para o Id informado!");
		}

		return ResponseEntity.status(HttpStatus.OK).body(teacher);
	}

	/** @author Felipe Duarte */
	public Teacher findById(Long id) {

		Teacher teacher = this.teacherService.findById(id);

		if (teacher != null) {
			return teacher;
		}

		return null;
	}

	/** @author Jorge Gabriel */
	@GetMapping("subject")
	public ResponseEntity<Page<Subject>> findEnrolledSubjects(@RequestParam Long idTeacher,
			@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "3") Integer quantityPerPage) {

		Teacher teacher = this.teacherService.findById(idTeacher);

		if (teacher != null) {

			Page<Subject> subjects = this.subjectResource.findSubjectsByTeacher(teacher, page, quantityPerPage);

			if (subjects != null) {
				return ResponseEntity.status(HttpStatus.OK).body(subjects);
			}

		}

		throw new ObjectNotFoundException("Nenhum Professor encontrado para o id informado!");
	}

	/** @author Jorge Gabriel */
	public ResponseEntity<Page<Teacher>> findTeacherByCourse(Long idCourse, Integer page, Integer quantityPerPage) {

		Page<Teacher> subjects = this.teacherService.findTeacherByCourse(idCourse, page, quantityPerPage);

		if (subjects != null) {
			return ResponseEntity.status(HttpStatus.OK).body(subjects);
		}

		throw new ObjectNotFoundException("Nenhum Professor encontrado!");
	}

	@GetMapping("/course")
	public Page<Teacher> findSubjectsOfCoursesByTeacher(@RequestParam Long idTeacher,
			@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "3") Integer quantityPerPage) {
		return null;
	}

	/** @author Jorge Gabriel */
	@GetMapping
	public ResponseEntity<Page<Teacher>> findAll(@RequestParam(defaultValue = "0") Integer page,
			@RequestParam(defaultValue = "3") Integer quantityPerPage) {

		Page<Teacher> teachers = this.teacherService.findAll(page, quantityPerPage);

		if (teachers != null) {
			return ResponseEntity.status(HttpStatus.OK).body(teachers);
		}

		throw new ObjectNotFoundException("Nenhum Professor encontrado!");
	}

}
