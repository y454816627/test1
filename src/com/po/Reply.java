package com.po;

public class Reply {
    private int id;//留言id
    private String msg; //留言内容
    private String time; //留言时间
    private int titleId;//帖子id
    private String account; //留言者

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public int getTitleId() {
        return titleId;
    }

    public void setTitleId(int titleId) {
        this.titleId = titleId;
    }

    @Override
    public String toString() {
        return "Reply{" +
                "id=" + id +
                ", msg='" + msg + '\'' +
                ", time='" + time + '\'' +
                ", titleId=" + titleId +
                ", account='" + account + '\'' +
                '}';
    }
}
