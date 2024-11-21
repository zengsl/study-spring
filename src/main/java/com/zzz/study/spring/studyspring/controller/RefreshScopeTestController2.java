package com.zzz.study.spring.studyspring.controller;

import com.zzz.study.spring.studyspring.config.RefreshTestProperties;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("refreshScopeTest2")
@RequiredArgsConstructor
@RefreshScope
public class RefreshScopeTestController2 {

    private final RefreshTestProperties refreshTestProperties;

    @Value("${zzz-test.string-config}")
    private String singleString;

    @RequestMapping("/test2")
    public String test1() {
        /*nacos修改不会更新*/
        return "Controller增加@Refresh注解、构造注入，RefreshTestProperties" + refreshTestProperties.getName() + "," + refreshTestProperties.getAge()+
         "\nController未增加@Refresh注解、构造注入，singleString" + singleString ;
    }
}
