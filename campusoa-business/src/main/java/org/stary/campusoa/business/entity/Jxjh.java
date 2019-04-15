package org.stary.campusoa.business.entity;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * Author Stary Yuan
 * Date  2019-04-14
 */
public class Jxjh implements Serializable {
    private static final long serialVersionUID = 1L;
    private int tid;
    private String insertBy;
    private String updateBy;
    private Timestamp insertTime;
    private Timestamp updateTime;
    private byte logicaldeletecode;
    private String kcmc;
    private byte kclb;
    private byte kcxz;
    private byte xf;
    private String xqxs;
    private String jkxs;
    private String syxs;
    private byte kkxy;
    private String kcdm;


    public Jxjh(){
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
    public void setKcmc (String kcmc) {this.kcmc = kcmc;} 
    public String getKcmc(){ return kcmc;} 
    public void setKclb (byte kclb) {this.kclb = kclb;} 
    public byte isKclb(){ return kclb;} 
    public void setKcxz (byte kcxz) {this.kcxz = kcxz;} 
    public byte isKcxz(){ return kcxz;} 
    public void setXf (byte xf) {this.xf = xf;} 
    public byte isXf(){ return xf;} 
    public void setXqxs (String xqxs) {this.xqxs = xqxs;} 
    public String getXqxs(){ return xqxs;} 
    public void setJkxs (String jkxs) {this.jkxs = jkxs;} 
    public String getJkxs(){ return jkxs;} 
    public void setSyxs (String syxs) {this.syxs = syxs;} 
    public String getSyxs(){ return syxs;} 
    public void setKkxy (byte kkxy) {this.kkxy = kkxy;} 
    public byte isKkxy(){ return kkxy;} 
    public void setKcdm (String kcdm) {this.kcdm = kcdm;} 
    public String getKcdm(){ return kcdm;} 

}