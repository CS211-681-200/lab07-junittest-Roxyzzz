package ku.cs.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentListTest {
    static StudentList studentList;
    @BeforeEach
    void init() {
        studentList = new StudentList();

    }

    @Test
    @DisplayName("addStudent")
    void testaddNewStudent() {
        studentList.addNewStudent("67xxxx1", "test1");
        studentList.addNewStudent("67xxxx2", "test2");
        studentList.addNewStudent("67xxxx3", "test3");
        assertEquals("test1", studentList.findStudentById("67xxxx1").getName());
        assertEquals("test2", studentList.findStudentById("67xxxx2").getName());
        assertEquals("test3", studentList.findStudentById("67xxxx3").getName());
    }
    @Test
    @DisplayName("addStudentwith score")
    void testaddNewStudent2() {
        studentList.addNewStudent("67xxxx1", "test1", 100);
        studentList.addNewStudent("67xxxx2", "test2",80);
        assertEquals(100, studentList.findStudentById("67xxxx1").getScore());
        assertEquals(80, studentList.findStudentById("67xxxx2").getScore());
    }

    @Test
    @DisplayName("FindStudentByID")
    void testfindStudentById() {
        studentList.addNewStudent("67xxxx1", "test");
        assertEquals("67xxxx1", studentList.findStudentById("67xxxx1").getId());
    }

    @Test
    @DisplayName("FilterByName")
    void testfilterByName(){
        studentList.addNewStudent("67xxxx1", "test1");
        studentList.addNewStudent("67xxxx2", "test2");
        assertEquals(1,studentList.filterByName("1").getStudents().size());
        assertEquals(false,studentList.filterByName("test1").getStudents().isEmpty());
    }

    @Test
    @DisplayName("ให้คะแนนด้วย ID")
    void testgiveScoreToId(){
        studentList.addNewStudent("67xxxx1", "test1", 0);
        studentList.giveScoreToId("67xxxx1", 80);
        assertEquals( 80, studentList.findStudentById("67xxxx1").getScore());
    }

    @Test
    @DisplayName("ดูเกรดด้วย ID")
    void testviewGradeofId(){
        studentList.addNewStudent("67xxxx1", "test1", 100);
        assertEquals("A", studentList.viewGradeOfId("67xxxx1"));

    }

}