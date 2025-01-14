package com.exam.demo.service;

import com.exam.demo.entity.ExamSubject;
import com.exam.demo.entity.QueryQuestion;

import java.util.List;

public interface ExamSubjectService {

    /**
     * 查询所有主观题目
     * @return
     */
    List<ExamSubject> findAll();

    /**
     * 分页查询所有主观题目
     * @return
     */
    List<ExamSubject> findPage(int current, int pageSize);

    /**
     * 根据题目ID查询主观题目
     * @param id
     * @return
     */
    ExamSubject findById(Integer id);

    /**
     * 根据科目ID查询主观题目
     * @param subjectId
     * @return
     */
    List<ExamSubject> findBySubjectId(Integer subjectId);

    /**
     * 根据条件查询主观题目
     * @param current
     * @param pageSize
     * @param queryQuestion
     * @return
     */
    List<ExamSubject> search(Integer current, Integer pageSize, QueryQuestion queryQuestion);

    /**
     * 向题库添加主观题目
     * @param examSubject
     * @return
     */
    Integer saveExamSubject(ExamSubject examSubject);

    /**
     * 修改题库的主观题目
     * @param examSubject
     * @return
     */
    Integer updateExamSubject(ExamSubject examSubject);

    /**
     * 删除题库中的主观题目
     * @param id
     * @return
     */
    Integer deleteExamSubject(Integer id);
}