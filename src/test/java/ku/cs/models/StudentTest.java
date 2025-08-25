package ku.cs.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    static Student s;
    @BeforeEach
    void init(){
        s = new Student("67xxxxx", "test");
    }

    @Test
    @DisplayName("เพ่ิ่มคะแนนนิสิต 49 และ 20")
    void testAddScore(){
        s.addScore(49);
        assertEquals(49, s.getScore());
        s.addScore(20);
        assertEquals(69, s.getScore());
    }
    @Test
    void testcalcualteGrade(){
        s.addScore(60);
        assertEquals("C", s.grade());
    }

    @Test
    void testchangeName(){
        s.changeName("eiei");
        assertEquals("eiei", s.getName());
    }

    @Test
    void testisId(){
        s.isId("67xxxxx");
        assertEquals("67xxxxx", s.getId());
    }

    @Test
    void testisNameContains(){
        s.isNameContains("test");
        assertEquals("test", s.getName());
    }

}