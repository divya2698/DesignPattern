package edu.neu.csye7374;

public interface EmployeeAPI extends PersonAPI{
    double getWage();
    void setWage (double age);
    String getJob();
    void setJob(String job);
}
