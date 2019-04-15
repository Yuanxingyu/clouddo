package org.stary.campusoa.business.entity;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * Author Stary Yuan
 * Date  2019-04-14
 */
public class Zy implements Serializable {
    private static final long serialVersionUID = 1L;
    private int tid;
    private String insertBy;
    private String updateBy;
    private Timestamp insertTime;
    private Timestamp updateTime;
    private byte logicaldeletecode;
    private String zymc;
    private int ssxyid;
    private String zydm;


    public Zy(){
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
    public void setZymc (String zymc) {this.zymc = zymc;} 
    public String getZymc(){ return zymc;} 
    public void setSsxyid (int ssxyid) {this.ssxyid = ssxyid;} 
    public int getSsxyid(){ return ssxyid;} 
    public void setZydm (String zydm) {this.zydm = zydm;} 
    public String getZydm(){ return zydm;} 

}