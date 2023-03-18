package mytest;
import java.io.Serializable;

public class Student implements Serializable{
    int enroll;
    int grno;
    String name;
    String div;
    String sem;
    String branch;
    public int getEnroll() {
        return enroll;
    }

    public void setEnroll(int enroll) {
        this.enroll = enroll;
    }

    public int getGrno() {
        return grno;
    }

    public void setGrno(int grno) {
        this.grno = grno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDiv() {
        return div;
    }

    public void setDiv(String div) {
        this.div = div;
    }

    public String getSem() {
        return sem;
    }

    public void setSem(String sem) {
        this.sem = sem;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

}
