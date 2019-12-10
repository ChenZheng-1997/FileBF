package com.controller;

import com.domain.Tenderingtype;
import com.service.TenderingtypeService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class TenderingtypeController {

    @Resource(name = "tenderingtypeServiceImpl")
    TenderingtypeService tenderingtypeService;


    /**
     * 查询所有的招标类型
     * @return
     */
    @ResponseBody
    @RequestMapping("/selectalltenderingtype")
    public List<Tenderingtype> selectAllTenderingType() {
        List<Tenderingtype> tenderingtypes = tenderingtypeService.selectAllTenderingType();
        for (Tenderingtype tenderingtype : tenderingtypes) {
            System.out.println(tenderingtype.getTenderingtypename());
        }
        return tenderingtypes;
    }
}
