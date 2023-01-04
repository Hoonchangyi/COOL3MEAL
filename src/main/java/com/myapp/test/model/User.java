package com.myapp.test.model;

import javax.validation.constraints.NotEmpty;

public class User {
    int uno;

    @NotEmpty(message="이메일이 입력되지 않앗습니다!")
    private String email;
    @NotEmpty(message="pw가 입력되지 않앗습니다!")
    private String pass;
    private String pass2;
    @NotEmpty(message="이름이 입력되지 않앗습니다!")
    private String nickname;
    @NotEmpty(message="생년월일이 입력되지 않앗습니다!") // NotEmpty는 String에만 가능하다
    private String birth;
    @NotEmpty(message="잔화번호가 입력되지 않앗습니다!")
    private String phone;
    @NotEmpty(message="주소가 입력되지 않앗습니다!")
    private String sex;
    @NotEmpty(message="우편번호가 입력되지 않앗습니다!")
    private String pro_img;

    private String updatepass;
    private String updatepass2;

    public int getUno() {
        return uno;
    }

    public void setUno(int uno) {
        this.uno = uno;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getPass2() {
        return pass2;
    }

    public void setPass2(String pass2) {
        this.pass2 = pass2;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPro_img() {
        return pro_img;
    }

    public void setPro_img(String pro_img) {
        this.pro_img = pro_img;
    }

    public String getUpdatepass() {
        return updatepass;
    }

    public void setUpdatepass(String updatepass) {
        this.updatepass = updatepass;
    }

    public String getUpdatepass2() {
        return updatepass2;
    }

    public void setUpdatepass2(String updatepass2) {
        this.updatepass2 = updatepass2;
    }
}
