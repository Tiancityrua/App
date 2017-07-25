package cn.Controller;

import cn.Service.RegisterService;
import cn.VO.User;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;

/**
 * Created by tianchang on 2017/7/11.
 */
@Controller
public class UserRegister {
    @Resource
    private RegisterService service;
    @ResponseBody
    @RequestMapping(value = "/register", method = RequestMethod.POST,produces = "application/json;charset=UTF-8")
    public String register(HttpServletRequest request, HttpServletResponse response) throws UnsupportedEncodingException {
//        request.setCharacterEncoding("utf-8");
//        response.setCharacterEncoding("utf-8");
//        String json=request.getParameter("");
//        User user= JSON.parseObject(json,User.class);
//        String idNum =user.getIdNum();
//        String passWord = user.getPassWord();
//        String phoneIdentifier = user.getPhoneIdentifier();
//        String phoneNum = user.getPhoneNum();
        String idNum=request.getParameter("idNum");
        String passWord=request.getParameter("passWord");
        String phoneIdentifier=request.getParameter("phoneIdentifier");
        String phoneNum=request.getParameter("phoneNum");
        return service.register(idNum,passWord,phoneIdentifier,phoneNum);

    }
}
