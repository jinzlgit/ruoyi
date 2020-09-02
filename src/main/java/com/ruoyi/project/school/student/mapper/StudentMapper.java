package com.ruoyi.project.school.student.mapper;

import java.util.List;
import com.ruoyi.project.school.student.domain.Student;

/**
 * 学生管理Mapper接口
 * 
 * @author 金振林
 * @date 2020-09-01
 */
public interface StudentMapper 
{
    /**
     * 查询学生管理
     * 
     * @param studentId 学生管理ID
     * @return 学生管理
     */
    public Student selectStudentById(Long studentId);

    /**
     * 查询学生管理列表
     * 
     * @param student 学生管理
     * @return 学生管理集合
     */
    public List<Student> selectStudentList(Student student);

    /**
     * 新增学生管理
     * 
     * @param student 学生管理
     * @return 结果
     */
    public int insertStudent(Student student);

    /**
     * 修改学生管理
     * 
     * @param student 学生管理
     * @return 结果
     */
    public int updateStudent(Student student);

    /**
     * 删除学生管理
     * 
     * @param studentId 学生管理ID
     * @return 结果
     */
    public int deleteStudentById(Long studentId);

    /**
     * 批量删除学生管理
     * 
     * @param studentIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteStudentByIds(String[] studentIds);
}
