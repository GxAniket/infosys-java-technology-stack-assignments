// An educational institution provides stipends for post-graduate students every year. For calculating the stipend, the institution has fixed a base amount of $100 which is provided to all the students. The students who perform exceptionally well during the academics get an extra amount based on their performance.
// You need to help the institution in developing an application for calculating the stipend by implementing the class based on the class diagram and description given below.
class Student {
    // Member variables
    private int studentId;
    private int aggregateMarks;
    private final int STIPEND = 100; // Base stipend amount

    // Method to calculate total stipend based on performance
    public double calculateTotalStipend() {
        int bonus = 0;

        if (this.aggregateMarks >= 95 && this.aggregateMarks <= 100) {
            bonus = 20;
        } else if (this.aggregateMarks >= 90 && this.aggregateMarks < 95) {
            bonus = 15;
        } else if (this.aggregateMarks >= 85 && this.aggregateMarks < 90) {
            bonus = 10;
        } else {
            bonus = 0; // No bonus for marks below 85
        }

        return STIPEND + bonus;
    }

    // Getters and Setters
    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getAggregateMarks() {
        return aggregateMarks;
    }

    public void setAggregateMarks(int aggregateMarks) {
        this.aggregateMarks = aggregateMarks;
    }

    public int getSTIPEND() {
        return STIPEND;
    }
}
