package com.dao;

import com.po.Reply;
import com.po.Title;
import com.po.User;

import java.util.List;

public interface UserDaoImpl {
    public List<User> queryUser(String account,String password);
    public void addTitle(String title);
    public List<Title> queryTitle();
    public List<Reply> queryReply(int titleId);
    public List<Title> selTitleById(int id);
    public void addReply(String msg,String time,int titleId,String account);
}
