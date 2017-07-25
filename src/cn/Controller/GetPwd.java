package cn.Controller;

import cn.VO.Message;
import com.alibaba.fastjson.JSON;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by tianchang on 2017/7/19.
 */
@Controller
public class GetPwd {
    @ResponseBody
    @RequestMapping(value = "/getpwd", method = RequestMethod.GET,produces = "application/json;charset=UTF-8")
    public String getpwd(){
        Message msg=new Message("1","234678");
        String json= JSON.toJSONString(msg);
        return json;
    }
}
