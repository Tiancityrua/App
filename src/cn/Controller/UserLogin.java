package cn.Controller;

import cn.Service.LoginService;
import cn.VO.User;
import com.alibaba.fastjson.JSON;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;
import java.util.logging.Logger;

/**
 * Created by tianchang on 2017/7/13.
 */
@Controller
public class UserLogin {
    @Resource
    private LoginService loginService;
    @ResponseBody
    @RequestMapping(value = "/login", method = RequestMethod.POST,produces = "application/json;charset=UTF-8")
    public String login(HttpServletRequest request, HttpServletResponse response) throws UnsupportedEncodingException {
//        request.setCharacterEncoding("UTF-8");
//        response.setCharacterEncoding("UTF-8");
//        String json=request.getParameter("");
//        User user= JSON.parseObject(json,User.class);
//        String phoneNum=user.getPhoneNum();
//        String passWord=user.getPassWord();
//        response.setContentType("application/json;charset=UTF-8");
        String phoneNum=request.getParameter("phoneNum");
        String passWord=request.getParameter("passWord");
        return loginService.login(phoneNum,passWord);
    }
}
