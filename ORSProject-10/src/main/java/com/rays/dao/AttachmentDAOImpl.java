package com.rays.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.AttachmentDTO;

@Repository
public class AttachmentDAOImpl extends BaseDAOImpl<AttachmentDTO> implements AttachmentDAOInt {

	@PersistenceContext
	public EntityManager entityManager;

	public long add(AttachmentDTO dto) {
		entityManager.persist(dto);
		return dto.getId();
	}

	public void update(AttachmentDTO dto) {
		entityManager.merge(dto);
	}

	public void delete(AttachmentDTO dto) {
		entityManager.remove(dto);
	}

	public AttachmentDTO findByPk(long pk) {
		AttachmentDTO dto = entityManager.find(AttachmentDTO.class, pk);
		return dto;
	}

	@Override
	public Class<AttachmentDTO> getDTOClass() {
		return AttachmentDTO.class;
	}

	@Override
	protected List<Predicate> getWhereClause(AttachmentDTO dto, CriteriaBuilder builder, Root<AttachmentDTO> qRoot) {
		return null;
	}

}