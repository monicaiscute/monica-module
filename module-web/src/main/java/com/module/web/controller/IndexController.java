package com.module.web.controller;
import com.module.api.entity.MerchantNotifyList;
import com.module.service.MerchantNotifyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Controller
public class IndexController {
    @Autowired
    MerchantNotifyService merchantNotifyService;
    @ResponseBody
    @RequestMapping("/upp")
    public void upp(HttpServletRequest request, HttpServletResponse response) throws Exception {
        try {
            Map<String, Object> map=new HashMap<>();
            List<MerchantNotifyList> list= merchantNotifyService.selectAll(map);
            System.out.println(1);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
