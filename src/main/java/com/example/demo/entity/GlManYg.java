package com.example.demo.entity;

import lombok.extern.apachecommons.CommonsLog;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @author liusj
 */
@Entity
@Table(name = "gl_man_yg")
public class GlManYg implements Serializable {

    @Column(name = "com_id")
    private String comId;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "zgbh")
    private String zgbh;

    @Column(name = "sfzh")
    private String sfzh;

    @Column(name = "zgxm")
    private String zgxm;

    @Column(name = "zgxm_en")
    private String zgxmEn;

    @Column(name = "zgxm_old")
    private String zgxmOld;

    @Column(name = "zgxm_old_en")
    private String zgxmOldEn;

    @Column(name = "zgxb")
    private String zgxb;

    @Column(name = "zgcs")
    private Date zgcs;

    @Column(name = "zgjg")
    private String zgjg;

    @Column(name = "zgxl")
    private String zgxl;

    @Column(name = "zgzy")
    private String zgzy;

    @Column(name = "zghy")
    private String zghy;

    @Column(name = "zgjk")
    private String zgjk;

    @Column(name = "zzmm")
    private String zzmm;

    @Column(name = "hkxz")
    private String hkxz;

    @Column(name = "rdrj")
    private Date rdrj;

    @Column(name = "jzsc")
    private String jszc;

    @Column(name = "gzrj")
    private Date gzrj;

    @Column(name = "dah")
    private String dah;

    @Column(name = "gzjb")
    private String gzjb;

    @Column(name = "zzrj")
    private Date zzrj;

    @Column(name = "byrj")
    private Date byrj;

    @Column(name = "zgzt")
    private String zgzt;

    @Column(name = "zgdj")
    private String zgdj;

    @Column(name = "wyyz")
    private String wyyz;

    @Column(name = "jsj")
    private String jsj;

    @Column(name = "xx")
    private String xx;

    @Column(name = "csdd")
    private String csdd;

    @Column(name = "hjszd")
    private String hjszd;

    @Column(name = "addr")
    private String addr;

    @Column(name = "phone")
    private String phone;

    @Column(name = "grzc")
    private String grzc;

    @Column(name = "csjt")
    private String csjt;

    @Column(name = "e_mail")
    private String eMail;

    @Column(name = "bx")
    private String bx;

    @Column(name = "mz")
    private String mz;

    @Column(name = "rtrj")
    private Date rtrj;

    @Column(name = "rcrj")
    private Date rcrj;

    @Column(name = "wydj")
    private String wydj;

    @Column(name = "byxx")
    private String byxx;

    @Column(name = "xw")
    private String xw;

    @Column(name = "is_opr")
    private String isOpr;

    @Column(name = "pwd")
    private String pwd;

    @Column(name = "loc_file_path")
    private String locFilePath;

    @Column(name = "sys_flag")
    private String sysFlag;

    @Column(name = "man_lb")
    private String manLb;

    @Column(name = "gz_lb")
    private String gzLb;

    @Column(name = "sub_com_id")
    private String subComId;

    @Column(name = "htrj")
    private Date htrj;

    @Column(name = "xl")
    private String xl;

    @Column(name = "zgbh_old")
    private String zgbhOld;

    @Column(name = "lw_flag")
    private String lwFlag;

    @Column(name = "lzrj")
    private Date lzrj;

    @Column(name = "img")
    private byte[] img;

    public String getComId() {
        return comId;
    }

    public void setComId(String comId) {
        this.comId = comId == null ? null : comId.trim();
    }

    public String getZgbh() {
        return zgbh;
    }

    public void setZgbh(String zgbh) {
        this.zgbh = zgbh == null ? null : zgbh.trim();
    }

    public String getSfzh() {
        return sfzh;
    }

    public void setSfzh(String sfzh) {
        this.sfzh = sfzh == null ? null : sfzh.trim();
    }

    public String getZgxm() {
        return zgxm;
    }

    public void setZgxm(String zgxm) {
        this.zgxm = zgxm == null ? null : zgxm.trim();
    }

    public String getZgxmEn() {
        return zgxmEn;
    }

    public void setZgxmEn(String zgxmEn) {
        this.zgxmEn = zgxmEn == null ? null : zgxmEn.trim();
    }

    public String getZgxmOld() {
        return zgxmOld;
    }

    public void setZgxmOld(String zgxmOld) {
        this.zgxmOld = zgxmOld == null ? null : zgxmOld.trim();
    }

    public String getZgxmOldEn() {
        return zgxmOldEn;
    }

    public void setZgxmOldEn(String zgxmOldEn) {
        this.zgxmOldEn = zgxmOldEn == null ? null : zgxmOldEn.trim();
    }

    public String getZgxb() {
        return zgxb;
    }

    public void setZgxb(String zgxb) {
        this.zgxb = zgxb == null ? null : zgxb.trim();
    }

    public Date getZgcs() {
        return zgcs;
    }

    public void setZgcs(Date zgcs) {
        this.zgcs = zgcs;
    }

    public String getZgjg() {
        return zgjg;
    }

    public void setZgjg(String zgjg) {
        this.zgjg = zgjg == null ? null : zgjg.trim();
    }

    public String getZgxl() {
        return zgxl;
    }

    public void setZgxl(String zgxl) {
        this.zgxl = zgxl == null ? null : zgxl.trim();
    }

    public String getZgzy() {
        return zgzy;
    }

    public void setZgzy(String zgzy) {
        this.zgzy = zgzy == null ? null : zgzy.trim();
    }

    public String getZghy() {
        return zghy;
    }

    public void setZghy(String zghy) {
        this.zghy = zghy == null ? null : zghy.trim();
    }

    public String getZgjk() {
        return zgjk;
    }

    public void setZgjk(String zgjk) {
        this.zgjk = zgjk == null ? null : zgjk.trim();
    }

    public String getZzmm() {
        return zzmm;
    }

    public void setZzmm(String zzmm) {
        this.zzmm = zzmm == null ? null : zzmm.trim();
    }

    public String getHkxz() {
        return hkxz;
    }

    public void setHkxz(String hkxz) {
        this.hkxz = hkxz == null ? null : hkxz.trim();
    }

    public Date getRdrj() {
        return rdrj;
    }

    public void setRdrj(Date rdrj) {
        this.rdrj = rdrj;
    }

    public String getJszc() {
        return jszc;
    }

    public void setJszc(String jszc) {
        this.jszc = jszc == null ? null : jszc.trim();
    }

    public Date getGzrj() {
        return gzrj;
    }

    public void setGzrj(Date gzrj) {
        this.gzrj = gzrj;
    }

    public String getDah() {
        return dah;
    }

    public void setDah(String dah) {
        this.dah = dah == null ? null : dah.trim();
    }

    public String getGzjb() {
        return gzjb;
    }

    public void setGzjb(String gzjb) {
        this.gzjb = gzjb == null ? null : gzjb.trim();
    }

    public Date getZzrj() {
        return zzrj;
    }

    public void setZzrj(Date zzrj) {
        this.zzrj = zzrj;
    }

    public Date getByrj() {
        return byrj;
    }

    public void setByrj(Date byrj) {
        this.byrj = byrj;
    }

    public String getZgzt() {
        return zgzt;
    }

    public void setZgzt(String zgzt) {
        this.zgzt = zgzt == null ? null : zgzt.trim();
    }

    public String getZgdj() {
        return zgdj;
    }

    public void setZgdj(String zgdj) {
        this.zgdj = zgdj == null ? null : zgdj.trim();
    }

    public String getWyyz() {
        return wyyz;
    }

    public void setWyyz(String wyyz) {
        this.wyyz = wyyz == null ? null : wyyz.trim();
    }

    public String getJsj() {
        return jsj;
    }

    public void setJsj(String jsj) {
        this.jsj = jsj == null ? null : jsj.trim();
    }

    public String getXx() {
        return xx;
    }

    public void setXx(String xx) {
        this.xx = xx == null ? null : xx.trim();
    }

    public String getCsdd() {
        return csdd;
    }

    public void setCsdd(String csdd) {
        this.csdd = csdd == null ? null : csdd.trim();
    }

    public String getHjszd() {
        return hjszd;
    }

    public void setHjszd(String hjszd) {
        this.hjszd = hjszd == null ? null : hjszd.trim();
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr == null ? null : addr.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getGrzc() {
        return grzc;
    }

    public void setGrzc(String grzc) {
        this.grzc = grzc == null ? null : grzc.trim();
    }

    public String getCsjt() {
        return csjt;
    }

    public void setCsjt(String csjt) {
        this.csjt = csjt == null ? null : csjt.trim();
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail == null ? null : eMail.trim();
    }

    public String getBx() {
        return bx;
    }

    public void setBx(String bx) {
        this.bx = bx == null ? null : bx.trim();
    }

    public String getMz() {
        return mz;
    }

    public void setMz(String mz) {
        this.mz = mz == null ? null : mz.trim();
    }

    public Date getRtrj() {
        return rtrj;
    }

    public void setRtrj(Date rtrj) {
        this.rtrj = rtrj;
    }

    public Date getRcrj() {
        return rcrj;
    }

    public void setRcrj(Date rcrj) {
        this.rcrj = rcrj;
    }

    public String getWydj() {
        return wydj;
    }

    public void setWydj(String wydj) {
        this.wydj = wydj == null ? null : wydj.trim();
    }

    public String getByxx() {
        return byxx;
    }

    public void setByxx(String byxx) {
        this.byxx = byxx == null ? null : byxx.trim();
    }

    public String getXw() {
        return xw;
    }

    public void setXw(String xw) {
        this.xw = xw == null ? null : xw.trim();
    }

    public String getIsOpr() {
        return isOpr;
    }

    public void setIsOpr(String isOpr) {
        this.isOpr = isOpr == null ? null : isOpr.trim();
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd == null ? null : pwd.trim();
    }

    public String getLocFilePath() {
        return locFilePath;
    }

    public void setLocFilePath(String locFilePath) {
        this.locFilePath = locFilePath == null ? null : locFilePath.trim();
    }

    public String getSysFlag() {
        return sysFlag;
    }

    public void setSysFlag(String sysFlag) {
        this.sysFlag = sysFlag == null ? null : sysFlag.trim();
    }

    public String getManLb() {
        return manLb;
    }

    public void setManLb(String manLb) {
        this.manLb = manLb == null ? null : manLb.trim();
    }

    public String getGzLb() {
        return gzLb;
    }

    public void setGzLb(String gzLb) {
        this.gzLb = gzLb == null ? null : gzLb.trim();
    }

    public String getSubComId() {
        return subComId;
    }

    public void setSubComId(String subComId) {
        this.subComId = subComId == null ? null : subComId.trim();
    }

    public Date getHtrj() {
        return htrj;
    }

    public void setHtrj(Date htrj) {
        this.htrj = htrj;
    }

    public String getXl() {
        return xl;
    }

    public void setXl(String xl) {
        this.xl = xl == null ? null : xl.trim();
    }

    public String getZgbhOld() {
        return zgbhOld;
    }

    public void setZgbhOld(String zgbhOld) {
        this.zgbhOld = zgbhOld == null ? null : zgbhOld.trim();
    }

    public String getLwFlag() {
        return lwFlag;
    }

    public void setLwFlag(String lwFlag) {
        this.lwFlag = lwFlag == null ? null : lwFlag.trim();
    }

    public Date getLzrj() {
        return lzrj;
    }

    public void setLzrj(Date lzrj) {
        this.lzrj = lzrj;
    }

    public byte[] getImg() {
        return img;
    }

    public void setImg(byte[] img) {
        this.img = img;
    }
}