package com.ruoyi.staff.controller;

import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.staff.domain.Company;
import com.ruoyi.staff.service.ICompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/company")

public class CompanyController extends BaseController {

    @Autowired
    ICompanyService companyService;

    @GetMapping("/list")
    public TableDataInfo list(){
        startPage();
        List<Company> companies = companyService.selectCompanyList(new Company());
        return getDataTable(companies);
    }




}
