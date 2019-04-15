package org.stary.campusoa.business.entity;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * Author Stary Yuan
 * Date  2019-04-14
 */
public class Student implements Serializable {
    private static final long serialVersionUID = 1L;
    private int tid;
    private String insertBy;
    private String updateBy;
    private Timestamp insertTime;
    private Timestamp updateTime;
    private byte logicaldeletecode;
    private long userid;
    private String xsname;
    private String xgh;
    private int ssxyid;
    private int sszyid;
    private int rxnf;
    private int ssbjid;
    private byte xszt;
    private byte xq;


    public Student(){
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
    public void setXsname (String xsname) {this.xsname = xsname;} 
    public String getXsname(){ return xsname;} 
    public void setXgh (String xgh) {this.xgh = xgh;} 
    public String getXgh(){ return xgh;} 
    public void setSsxyid (int ssxyid) {this.ssxyid = ssxyid;} 
    public int getSsxyid(){ return ssxyid;} 
    public void setSszyid (int sszyid) {this.sszyid = sszyid;} 
    public int getSszyid(){ return sszyid;} 
    public void setRxnf (int rxnf) {this.rxnf = rxnf;} 
    public int getRxnf(){ return rxnf;} 
    public void setSsbjid (int ssbjid) {this.ssbjid = ssbjid;} 
    public int getSsbjid(){ return ssbjid;} 
    public void setXszt (byte xszt) {this.xszt = xszt;} 
    public byte isXszt(){ return xszt;} 
    public void setXq (byte xq) {this.xq = xq;} 
    public byte isXq(){ return xq;} 

}