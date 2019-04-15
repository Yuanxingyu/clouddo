package org.stary.campusoa.business.entity;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * Author Stary Yuan
 * Date  2019-04-14
 */
public class Teacher implements Serializable {
    private static final long serialVersionUID = 1L;
    private int tid;
    private String insertBy;
    private String updateBy;
    private Timestamp insertTime;
    private Timestamp updateTime;
    private byte logicaldeletecode;
    private long userid;
    private String jsname;
    private String jgh;
    private int ssxyid;
    private byte zc;
    private String zygz;


    public Teacher(){
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
    public void setUserid (long userid) {this.userid = userid;} 
    public long getUserid(){ return userid;} 
    public void setJsname (String jsname) {this.jsname = jsname;} 
    public String getJsname(){ return jsname;} 
    public void setJgh (String jgh) {this.jgh = jgh;} 
    public String getJgh(){ return jgh;} 
    public void setSsxyid (int ssxyid) {this.ssxyid = ssxyid;} 
    public int getSsxyid(){ return ssxyid;} 
    public void setZc (byte zc) {this.zc = zc;} 
    public byte isZc(){ return zc;} 
    public void setZygz (String zygz) {this.zygz = zygz;} 
    public String getZygz(){ return zygz;} 

}