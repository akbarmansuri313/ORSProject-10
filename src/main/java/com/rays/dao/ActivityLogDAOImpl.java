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
import com.rays.dto.ActivityLogDTO;

@Repository
public class ActivityLogDAOImpl extends BaseDAOImpl<ActivityLogDTO> implements ActivityLogDAOInt {

	
	
	
	@Override
	public Class<ActivityLogDTO> getDTOClass() {
		return ActivityLogDTO.class;
	}

	@Override
	protected List<Predicate> getWhereClause(ActivityLogDTO dto, CriteriaBuilder builder, Root<ActivityLogDTO> qRoot) {
		
		List<Predicate> whereCondition = new ArrayList<Predicate>();
		
		if (!isEmptyString(dto.getActivityName())) {
			
			whereCondition.add(builder.like(qRoot.get("activityName"), dto.getActivityName() + "%"));
			
		}
		
		return whereCondition;
	}
	
	

}
