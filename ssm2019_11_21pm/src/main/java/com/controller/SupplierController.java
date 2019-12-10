package com.controller;

import com.domain.Supplier;
import com.service.SupplierService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class SupplierController {

    @Resource(name = "supplierServiceImpl")
    SupplierService supplierService;


    @RequestMapping("/selectsupplierregisternoandited")
    public ModelAndView selectSupplierRegisterNoAndited() {
        Supplier supplier = new Supplier();
        supplier.setSign(0);
        List<Supplier> suppliers = supplierService.selectSupplierBySign(supplier);

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("suppliers", suppliers);
        modelAndView.setViewName("selectsupplierregisternoandited");
        return modelAndView;
    }
}
