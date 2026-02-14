package com.rays.service;

import org.springframework.stereotype.Service;

import com.rays.common.BaseServiceImpl;
import com.rays.dao.SubjectDAOImpl;
import com.rays.dto.SubjectDTO;


@Service
public class SubjectServiceImpl extends BaseServiceImpl<SubjectDTO, SubjectDAOImpl> implements SubjectServiceInt {

}
