package kr.onekey.sn.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = {"test api"})
@RestController
@RequestMapping("/test")
@AllArgsConstructor
public class testController {

    private static final Logger logger = LogManager.getLogger(testController.class);

    @ApiOperation(value = "GET 문자열 파라미터 테스트")
    @GetMapping("/getTest")
    public String getTest(String testStr, int num) {
        System.out.println("getTest testStr ... : " + testStr);
        System.out.println("getTest num ... : " + num);

        return "test result testStr : " + testStr + "   num... : " + num;
    }
}
