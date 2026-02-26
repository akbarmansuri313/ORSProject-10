package com.rays.ctl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.dto.PaymentDTO;
import com.rays.form.PaymentForm;
import com.rays.service.PaymentServiceInt;

@RestController
@RequestMapping(value = "Payment")
public class PaymentCtl extends BaseCtl<PaymentForm, PaymentDTO, PaymentServiceInt> {

}
