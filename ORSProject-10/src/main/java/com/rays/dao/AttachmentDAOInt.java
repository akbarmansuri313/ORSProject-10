package com.rays.dao;

import com.rays.common.BaseDAOInt;
import com.rays.dto.AttachmentDTO;

public interface AttachmentDAOInt extends BaseDAOInt<AttachmentDTO>{

	
	public long add(AttachmentDTO dto);
	
	public void update(AttachmentDTO dto);
	public void delete(AttachmentDTO dto);
	public AttachmentDTO findByPk(long pk);
	
}
