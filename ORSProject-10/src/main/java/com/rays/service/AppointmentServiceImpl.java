package com.rays.service;

import org.springframework.stereotype.Service;

import com.rays.common.BaseServiceImpl;
import com.rays.dao.AppointmentDAOInt;
import com.rays.dto.AppointmentDTO;


@Service
public class AppointmentServiceImpl extends BaseServiceImpl<AppointmentDTO, AppointmentDAOInt> implements AppointmentServiceInt{

}
