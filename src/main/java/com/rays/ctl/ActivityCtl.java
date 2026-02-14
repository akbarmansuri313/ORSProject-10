package com.rays.ctl;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.dto.ActivityLogDTO;
import com.rays.form.ActivityForm;
import com.rays.service.ActivityLogServiceInt;

@RestController
@RequestMapping(value = "Activity")
public class ActivityCtl extends BaseCtl<ActivityForm, ActivityLogDTO, ActivityLogServiceInt>{


}
