package org.stary.campusoa.business.entity;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * Author Stary Yuan
 * Date  2019-04-13
 */
public class Bj implements Serializable {
    private static final long serialVersionUID = 1L;
    private int tid;
    private String insertBy;
    private String updateBy;
    private Timestamp insertTime;
    private Timestamp updateTime;
    private byte logicaldeletecode;
    private int ssxyid;
    private int sszyid;
    private String bjmc;
    private String bjdm;
    private byte xq;


    public Bj(){
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
    public void setSsxyid (int ssxyid) {this.ssxyid = ssxyid;} 
    public int getSsxyid(){ return ssxyid;} 
    public void setSszyid (int sszyid) {this.sszyid = sszyid;} 
    public int getSszyid(){ return sszyid;} 
    public void setBjmc (String bjmc) {this.bjmc = bjmc;} 
    public String getBjmc(){ return bjmc;} 
    public void setXq (byte xq) {this.xq = xq;} 
    public byte isXq(){ return xq;}

    public String getBjdm() {
        return bjdm;
    }

    public void setBjdm(String bjdm) {
        this.bjdm = bjdm;
    }
}