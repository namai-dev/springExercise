package com.example.mycode.student;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    public final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }
    public void addStudent(Student student){
        Optional<Student> checkId = studentRepository.findByStudentId(student.getStudentId());
        if(checkId.isPresent()){
            throw  new IllegalStateException("Student with the id above is present");
        }
        studentRepository.save(student);

    }

    public List<Student> showStudent(){

        return studentRepository.findAll();
    }
    
    public void deleteStudent(Long id){
        //TODO: Check if the student with the provided id is present.
    repository.deleteById(id);
    }
}
