package hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestInfoController {
    @RequestMapping("/api/tests/info")
    public TestInfo getTestInfo(){
        TestInfo result = new TestInfo();
        result.setTestID(1);
        result.setTestDescription("Опис Тесту");
        result.setQuestionCount(12);
        return result;
    }
}
