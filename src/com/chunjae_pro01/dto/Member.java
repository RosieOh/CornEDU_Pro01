package com.chunjae_pro01.dto;

public class Member {

    private String id;
    private String pw;
    private String name;
    private String email;
    private String tel;
    private String resdate;
    private int point;
    private int per;

    public String getId() { return id; }

    public void setId(String id) { this.id = id; }

    public String getPw() { return pw; }

    public void setPw(String pw) { this.pw = pw; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public String getEmail() { return email; }

    public void setEmail(String email) { this.email = email; }

    public String getTel() { return tel; }

    public void setTel(String tel) { this.tel = tel; }

    public String getResdate() {
        return resdate;
    }

    public void setResdate(String resdate) {
        this.resdate = resdate;
    }

    public int getPoint() { return point; }

    public void setPoint(int point) { this.point = point; }

    public int getPer() { return per; }

    public void setPer(int per) { this.per = per;}
}