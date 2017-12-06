package DAO;

public class TestInfo {
    int testID = 1;
    String testDescription = "Опис тесту";
    int questionCount = 12;

    public TestInfo () {}

    public void setTestID(int testID) {
        this.testID = testID;
    }

    public void getTestID(int testID) {
        this.testID = testID;
    }

    public void setTestDescription(String testDescription) {
        this.testDescription = testDescription;
    }
    public void getTestID(String testDescription) {
        this.testDescription = testDescription;
    }

    public void setQuestionCount(int questionCount) {
        this.questionCount = questionCount;
    }
    public void getQuestionCount(int questionCount) {
        this.questionCount = questionCount;
    }

}
