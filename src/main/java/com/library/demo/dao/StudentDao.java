//package com.library.demo.dao;
//
//import com.library.demo.dto.Student;
//import com.library.demo.entity.StudentEntity;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.jdbc.core.RowMapper;
//import org.springframework.stereotype.Repository;
//
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.util.List;
//
//@Repository
//public class StudentDao {
//    @Autowired
//    private JdbcTemplate jdbcTemplate;
//
//    private void createTable(){
//        String sql="CREATE TABLE TEST(ID INT)";
//        jdbcTemplate.execute(sql);
//    }
//
//    public void saveStudent(StudentEntity student){
//        String sql ="INSERT INTO STUDENT(rollnumber,name) values(?,?)";
//        jdbcTemplate.update(sql,student.getRollNumber(),student.getName());
//    }
//
//    public List<Student> getStudent() {
//        //createTable();
//        String sql="select * from student";
//        return jdbcTemplate.query(sql, (rs, rowNum) -> {
//            Student student=new Student(rs.getInt(1),rs.getString(2));
//            return student;
//        });
//    }
//}
