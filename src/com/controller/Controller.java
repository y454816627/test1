package com.controller;

import com.dao.UserDaoImpl;
import com.po.Reply;
import com.po.Title;
import com.po.User;

import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/*@SessionAttributes("sf")*/
@org.springframework.stereotype.Controller
@RequestMapping("/control")
public class Controller {

    @Resource(name = "userDaoImpl")
    public UserDaoImpl ud;

    public static ModelAndView mv = new ModelAndView();

    /*登录*/
    @RequestMapping("/login")
    public ModelAndView Login(String account, String password, HttpSession session){
        List<User> li=ud.queryUser(account,password);
        if(li.size()>0){
            session.setAttribute("account",account);
            session.setAttribute("type",li.get(0).getType());
            ud.queryTitle();
            mv.setViewName("/query");
        }else {
            mv.addObject("msg","账号密码错误，请重新输入");
            mv.setViewName("/login");
        }
        return mv;
    }

    /*管理员发帖*/
    @RequestMapping("/sendTitle")
    public ModelAndView sendTitle(String title){
        ud.addTitle(title);
        mv.addObject("msg","发帖成功");
        mv.setViewName("/query");
        return mv;
    }

    /*查看所有帖子*/
    @RequestMapping("/queryAllTiltes")
    public ModelAndView queryAllTiltes(){
        List<Title> titleList=ud.queryTitle();
        mv.addObject("titleList",titleList);
        mv.setViewName("/queryTitle");
        return mv;
    }

    /*查看帖子极及其回复      接收管理员提交的帖子*/
    @RequestMapping("/queryReply")
    public ModelAndView queryReply(int id,HttpSession session){
        List<Reply> replyList=ud.queryReply(id);
        List<Title> title=ud.selTitleById(id);
        session.setAttribute("replyList",replyList);
        session.setAttribute("title",title);
        session.setAttribute("id",id);
       /* mv.addObject("replyList",replyList);
        mv.addObject("title",title);*/
        mv.setViewName("/showReply");
        return mv;
    }

    /*回复帖子*/
    @RequestMapping("/addReply")
    public ModelAndView addReply(int id,String msg,HttpSession session){
        String account=(String)session.getAttribute("account");
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String strDate=sdf.format(new Date());
        ud.addReply(msg,strDate,id,account);
        session.setAttribute("id",id);
        mv.setViewName("/huifu");
        return mv;
    }
}
