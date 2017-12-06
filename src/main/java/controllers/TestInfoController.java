package controllers;

import DAO.TestInfo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestInfoController {
    @RequestMapping("/api/tests/info")
    public TestInfo test1(@RequestParam(defaultValue = "Test description") String testDescription) {
    return new TestInfo();
    }
}
