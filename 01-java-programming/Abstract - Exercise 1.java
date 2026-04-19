abstract class Student {
    private String studentName;
    private int[] testScores;
    private String testResult;

    public Student(String studentName) {
        this.studentName = studentName;
        // Each student has to take 4 tests in total, as per the problem statement
        this.testScores = new int[4]; 
    }

    // Abstract method to be implemented by child classes
    public abstract void generateResult();

    public void setTestScore(int testNumber, int testScore) {
        // Sets the score at the specific index (0-indexed based on Tester class)
        this.testScores[testNumber] = testScore;
    }

    // Getters and Setters
    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int[] getTestScores() {
        return testScores;
    }

    public void setTestScores(int[] testScores) {
        this.testScores = testScores;
    }

    public String getTestResult() {
        return testResult;
    }

    public void setTestResult(String testResult) {
        this.testResult = testResult;
    }
}

class UndergraduateStudent extends Student {
    
    public UndergraduateStudent(String studentName) {
        super(studentName);
    }

    @Override
    public void generateResult() {
        int[] scores = getTestScores();
        int totalScore = 0;
        
        for (int score : scores) {
            totalScore += score;
        }
        
        double averageScore = (double) totalScore / scores.length;
        
        if (averageScore >= 60) {
            setTestResult("Pass");
        } else {
            setTestResult("Fail");
        }
    }
}

class GraduateStudent extends Student {

    public GraduateStudent(String studentName) {
        super(studentName);
    }

    @Override
    public void generateResult() {
        int[] scores = getTestScores();
        int totalScore = 0;
        
        for (int score : scores) {
            totalScore += score;
        }
        
        double averageScore = (double) totalScore / scores.length;
        
        if (averageScore >= 70) {
            setTestResult("Pass");
        } else {
            setTestResult("Fail");
        }
    }
}

class Tester {

    public static void main(String[] args) {
        UndergraduateStudent undergraduateStudent = new UndergraduateStudent("Philip");
        undergraduateStudent.setTestScore(0, 70);
        undergraduateStudent.setTestScore(1, 69);
        undergraduateStudent.setTestScore(2, 71);
        undergraduateStudent.setTestScore(3, 55);
            
        undergraduateStudent.generateResult();
            
        System.out.println("Student name: " + undergraduateStudent.getStudentName());
        System.out.println("Result: " + undergraduateStudent.getTestResult());
            
        System.out.println();
            
        GraduateStudent graduateStudent = new GraduateStudent("Jerry");
        graduateStudent.setTestScore(0, 70);
        graduateStudent.setTestScore(1, 69);
        graduateStudent.setTestScore(2, 71);
        graduateStudent.setTestScore(3, 55);
            
        graduateStudent.generateResult();
            
        System.out.println("Student name: " + graduateStudent.getStudentName());
        System.out.println("Result : " + graduateStudent.getTestResult());
        
        //Create more objects of the classes for testing your code
    }
}
