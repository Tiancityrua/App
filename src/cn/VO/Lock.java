package cn.VO;

import java.io.Serializable;

/**
 * Created by tianchang on 2017/7/11.
 */
public class Lock implements Serializable {
    private String houseNum;
    private String macAddr;
    private String lockPwd;
    private String lockState;
    private String bossName;
    private String moneyState;
    private String lockKystate;

    public String getHouseNum() {
        return houseNum;
    }

    public void setHouseNum(String houseNum) {
        this.houseNum = houseNum;
    }

    public String getMacAddr() {
        return macAddr;
    }

    public void setMacAddr(String macAddr) {
        this.macAddr = macAddr;
    }

    public String getLockPwd() {
        return lockPwd;
    }

    public void setLockPwd(String lockPwd) {
        this.lockPwd = lockPwd;
    }

    public String getLockState() {
        return lockState;
    }

    public void setLockState(String lockState) {
        this.lockState = lockState;
    }

    public String getBossName() {
        return bossName;
    }

    public void setBossName(String bossName) {
        this.bossName = bossName;
    }

    public String getMoneyState() {
        return moneyState;
    }

    public void setMoneyState(String moneyState) {
        this.moneyState = moneyState;
    }

    public String getLockKystate() {
        return lockKystate;
    }

    public void setLockKystate(String lockKystate) {
        this.lockKystate = lockKystate;
    }
}
