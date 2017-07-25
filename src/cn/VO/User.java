package cn.VO;

/**
 * Created by tianchang on 2017/7/11.
 */
public class User {
    private String idNum;
    private String passWord;
    private String phoneIdentifier;
    private String phoneNum;

    public String getIdNum() {
        return idNum;
    }

    public void setIdNum(String idNum) {
        this.idNum = idNum;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getPhoneIdentifier() {
        return phoneIdentifier;
    }

    public void setPhoneIdentifier(String phoneIdentifier) {
        this.phoneIdentifier = phoneIdentifier;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }
}
