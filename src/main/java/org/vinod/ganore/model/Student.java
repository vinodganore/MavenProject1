package org.vinod.ganore.model;


import org.springframework.boot.jackson.JsonComponent;

import java.io.Serializable;

@JsonComponent
public class Student implements Serializable {
    private  String stdId;
    private  String stdName;
    private  String stdBatch;
    private  String stdTech;

    public Student() {
    }
    public Student(String stdId, String stdName, String stdBatch, String stdTech) {

        this.stdId=stdId;
        this.stdName=stdName;
        this.stdBatch=stdBatch;
        this.stdTech=stdTech;
    }

    public String getStdId() {
        return stdId;
    }

    public void setStdId(String stdId) {
        this.stdId = stdId;
    }

    public String getStdName() {
        return stdName;
    }

    public void setStdName(String stdName) {
        this.stdName = stdName;
    }

    public String getStdBatch() {
        return stdBatch;
    }

    public void setStdBatch(String stdBatch) {
        this.stdBatch = stdBatch;
    }

    public String getStdTech() {
        return stdTech;
    }

    public void setStdTech(String stdTech) {
        this.stdTech = stdTech;
    }
}
