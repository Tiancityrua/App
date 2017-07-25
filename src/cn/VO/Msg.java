package cn.VO;

import java.io.Serializable;
import java.io.SerializablePermission;

/**
 * Created by tianchang on 2017/7/17.
 */
public class Msg {
    String event;
    String msg;
    Lock obj;

    public Msg(String event, String msg, Lock obj) {
        this.event = event;
        this.msg = msg;
        this.obj = obj;
    }

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Lock getObj() {
        return obj;
    }

    public void setObj(Lock obj) {
        this.obj = obj;
    }
}
