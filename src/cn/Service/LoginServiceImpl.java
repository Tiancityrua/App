package cn.Service;

import cn.Dao.LoginDao;
import cn.VO.Message;
import com.alibaba.fastjson.JSON;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by tianchang on 2017/7/13.
 */
@Service
public class LoginServiceImpl implements LoginService {
@Resource
private LoginDao loginDao;
public String login(String phoneNum,String passWord){
    Map map=new HashMap();
    map.put("phoneNum",phoneNum);
    map.put("passWord",passWord);
    if(loginDao.login(map).size()!=0) {
        Message message=new Message("1","登录成功");
        String json= JSON.toJSONString(message);
        return json;
    }
    else {
        Message message = new Message("0", "登录失败");
        String json = JSON.toJSONString(message);
        return json;
    }
}
}
