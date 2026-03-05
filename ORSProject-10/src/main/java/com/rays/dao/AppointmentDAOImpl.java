package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.AppointmentDTO;

@Repository
public class AppointmentDAOImpl extends BaseDAOImpl<AppointmentDTO> implements AppointmentDAOInt {

	@Override
	public Class<AppointmentDTO> getDTOClass() {
		return AppointmentDTO.class;
	}

	@Override
	protected List<Predicate> getWhereClause(AppointmentDTO dto, CriteriaBuilder builder, Root<AppointmentDTO> qRoot) {
		List<Predicate> whereCondition = new ArrayList<Predicate>();
		
		if (!isEmptyString(dto.getPatientName())) {
			whereCondition.add(builder.like(qRoot.get("patientName"), dto.getPatientName() + "%"));
			
		}

		return whereCondition;
	}

}
