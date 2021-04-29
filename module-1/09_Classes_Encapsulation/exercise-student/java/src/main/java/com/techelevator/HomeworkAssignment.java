package com.techelevator;

public class HomeworkAssignment {

    private int possibleMarks;
    private String submitterName;
    private  int earnedMarks;

        public String getLetterGrade(){
            String letterGrade = "";
            double percentage = ((double) earnedMarks / possibleMarks) * 100;
            if (percentage >= 90) {
                letterGrade = "A";
                return letterGrade;
            }
            else if (percentage >= 80) {
                letterGrade = "B";
                return letterGrade;
            }
            else if (percentage >= 70) {
                letterGrade = "C";
                return letterGrade;
            }
            else if (percentage >= 60) {
                letterGrade = "D";
                return letterGrade;
            }
            else {
                letterGrade = "F";
                return letterGrade;
            }
        }

    public int getPossibleMarks() {
        return possibleMarks;
    }
    public int getEarnedMarks(){
            return earnedMarks;
    }
    public void setEarnedMarks(int earnedMarks){
            this.earnedMarks = earnedMarks;
    }
    public String getSubmitterName(){
            return submitterName;
    }

    public HomeworkAssignment(int possibleMarks, String submitterName)
    {
        this.possibleMarks = possibleMarks;
        this.submitterName = submitterName;
    }

}



