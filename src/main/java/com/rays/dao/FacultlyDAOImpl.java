package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.common.UserContext;
import com.rays.dto.CollegeDTO;
import com.rays.dto.CourseDTO;
import com.rays.dto.FacultyDTO;
import com.rays.dto.SubjectDTO;

@Repository
public class FacultlyDAOImpl extends BaseDAOImpl<FacultyDTO> implements FacultyDAOInt{

	@Autowired
	SubjectDAOInt subjectDao;

	@Autowired
	CourseDAOInt courseDao;

	@Autowired
	CollegeDAOInt collegeDao;

	@Override
	public Class<FacultyDTO> getDTOClass() {

		return FacultyDTO.class;
	}

	@Override
	protected List<Predicate> getWhereClause(FacultyDTO dto, CriteriaBuilder builder, Root<FacultyDTO> qRoot) {

		List<Predicate> whereCondition = new ArrayList<Predicate>();

		return whereCondition;
	}

	@Override
	protected void populate(FacultyDTO dto, UserContext userContext) {

		SubjectDTO subjectDTO = subjectDao.findByPK(dto.getSubjectId(), userContext);

		dto.setSubjectName(subjectDTO.getName());

		CourseDTO courseDTO = courseDao.findByPK(dto.getCourseId(), userContext);

		dto.setCourseName(courseDTO.getName());

		CollegeDTO collegeDTO = collegeDao.findByPK(dto.getCollegeId(), userContext);


			dto.setCollegeName(collegeDTO.getName());
		

	}

}
