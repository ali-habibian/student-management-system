package com.ali.sms.repository;

import com.ali.sms.entity.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class StudentRepositoryTest {
    @Autowired
    private StudentRepository studentRepository;

    @Test
    void test_save_student_isOk() {
        Student student = new Student("First-3", "Last-3", "Email-3");

        Student result = studentRepository.save(student);
        assertNotNull(result);
    }
}