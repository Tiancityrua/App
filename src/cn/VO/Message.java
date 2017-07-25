package cn.VO;

/**
 * Created by tianchang on 2017/7/13.
 */
public class Message {
    private String event;
    private String msg;

    public Message(String event, String msg) {
        this.event = event;
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "Message{" +
                "event='" + event + '\'' +
                ", msg='" + msg + '\'' +
                '}';
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
}
