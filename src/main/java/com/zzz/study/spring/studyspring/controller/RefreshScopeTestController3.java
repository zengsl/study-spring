package com.zzz.study.spring.studyspring.controller;

import com.zzz.study.spring.studyspring.config.RefreshTestProperties;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("refreshScopeTest3")
public class RefreshScopeTestController3 {

    @Autowired
    private  RefreshTestProperties refreshTestProperties;

    @Value("${zzz-test.string-config}")
    private String singleString;

    @RequestMapping("/test3")
    public String test3() {
        /*nacos修改不会更新*/
        return "Controller未增加@Refresh注解、@Autowired注入，RefreshTestProperties" + refreshTestProperties.getName() + "," + refreshTestProperties.getAge()+
         "\nController未增加@Refresh注解、构造注入，singleString" + singleString ;
    }
}
