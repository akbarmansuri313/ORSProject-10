package com.rays.service;

import com.rays.common.BaseServiceInt;
import com.rays.dto.AttachmentDTO;

public interface AttachmentServiceInt extends BaseServiceInt<AttachmentDTO>{

	
	
	public long add(AttachmentDTO dto);
	
	public void update(AttachmentDTO dto);
	public void delete(long id);
	public AttachmentDTO findById(long pk);
	public long save(AttachmentDTO dto);
}
