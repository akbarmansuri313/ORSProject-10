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
import com.rays.dto.CourseDTO;
import com.rays.dto.SubjectDTO;
import com.rays.dto.TimeTableDTO;

@Repository
public class TimeTableDAOImpl extends BaseDAOImpl<TimeTableDTO> implements TimeTableDAOInt {

	@Autowired
	CourseDAOInt courseDao;

	@Autowired
	SubjectDAOInt subjectDao;

	@Override
	public Class<TimeTableDTO> getDTOClass() {
		return TimeTableDTO.class;
	}

	@Override
	protected List<Predicate> getWhereClause(TimeTableDTO dto, CriteriaBuilder builder, Root<TimeTableDTO> qRoot) {

		List<Predicate> whereCondition = new ArrayList<Predicate>();

		return whereCondition;
	}

	@Override
	protected void populate(TimeTableDTO dto, UserContext userContext) {

		CourseDTO coursedto = courseDao.findByPK(dto.getCourseId(), userContext);

		dto.setCourseName(coursedto.getName());

		SubjectDTO subjectDTO = subjectDao.findByPK(dto.getSubjectId(), userContext);

		dto.setSubjectName(subjectDTO.getCourseName());

	}

}
