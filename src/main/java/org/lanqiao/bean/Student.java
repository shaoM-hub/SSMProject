package org.lanqiao.bean;

public class Student {
    private Integer stuId;

    private String stuName;

    private String stuPass;

    private Integer stuAge;

    private String stuAddress;

    public Student() {
    }

    public Student(String stuName, String stuPass, Integer stuAge, String stuAddress) {
        this.stuName = stuName;
        this.stuPass = stuPass;
        this.stuAge = stuAge;
        this.stuAddress = stuAddress;
    }

    public Student(Integer stuId, String stuName, String stuPass, Integer stuAge, String stuAddress) {
        this.stuId = stuId;
        this.stuName = stuName;
        this.stuPass = stuPass;
        this.stuAge = stuAge;
        this.stuAddress = stuAddress;
    }

    public Integer getStuId() {
        return stuId;
    }

    public void setStuId(Integer stuId) {
        this.stuId = stuId;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName == null ? null : stuName.trim();
    }

    public String getStuPass() {
        return stuPass;
    }

    public void setStuPass(String stuPass) {
        this.stuPass = stuPass == null ? null : stuPass.trim();
    }

    public Integer getStuAge() {
        return stuAge;
    }

    public void setStuAge(Integer stuAge) {
        this.stuAge = stuAge;
    }

    public String getStuAddress() {
        return stuAddress;
    }

    public void setStuAddress(String stuAddress) {
        this.stuAddress = stuAddress == null ? null : stuAddress.trim();
    }

    @Override
    public String toString() {
        return "Student{" +
                "stuId=" + stuId +
                ", stuName='" + stuName + '\'' +
                ", stuPass='" + stuPass + '\'' +
                ", stuAge=" + stuAge +
                ", stuAddress='" + stuAddress + '\'' +
                '}';
    }
}