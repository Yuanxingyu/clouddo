package org.stary.campusoa.business.entity;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * Author Stary Yuan
 * Date  2019-04-14
 */
public class Bjkb implements Serializable {
    private static final long serialVersionUID = 1L;
    private int tid;
    private String insertBy;
    private String updateBy;
    private Timestamp insertTime;
    private Timestamp updateTime;
    private byte logicaldeletecode;
    private int bjid;
    private int zykcid;


    public Bjkb(){
    }

    public void setTid (int tid) {this.tid = tid;} 
    public int getTid(){ return tid;} 
    public void setInsertBy (String insertBy) {this.insertBy = insertBy;} 
    public String getInsertBy(){ return insertBy;} 
    public void setUpdateBy (String updateBy) {this.updateBy = updateBy;} 
    public String getUpdateBy(){ return updateBy;} 
    public void setInsertTime (Timestamp insertTime) {this.insertTime = insertTime;} 
    public Timestamp getInsertTime(){ return insertTime;} 
    public void setUpdateTime (Timestamp updateTime) {this.updateTime = updateTime;} 
    public Timestamp getUpdateTime(){ return updateTime;} 
    public void setLogicaldeletecode (byte logicaldeletecode) {this.logicaldeletecode = logicaldeletecode;} 
    public byte isLogicaldeletecode(){ return logicaldeletecode;} 
    public void setBjid (int bjid) {this.bjid = bjid;} 
    public int getBjid(){ return bjid;} 
    public void setZykcid (int zykcid) {this.zykcid = zykcid;} 
    public int getZykcid(){ return zykcid;} 

}