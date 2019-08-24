package com.ncrm.entity;

public class Classes {
    private Integer id;

    private String classNAME;

    private String classDesc;

    private Integer teacherId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getClassNAME() {
        return classNAME;
    }

    public void setClassNAME(String classNAME) {
        this.classNAME = classNAME == null ? null : classNAME.trim();
    }

    public String getClassDesc() {
        return classDesc;
    }

    public void setClassDesc(String classDesc) {
        this.classDesc = classDesc == null ? null : classDesc.trim();
    }

    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }
}