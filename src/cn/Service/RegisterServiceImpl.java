package cn.Service;

import cn.Dao.RegisterDao;
import cn.VO.Message;
import cn.VO.User;
import com.alibaba.fastjson.JSON;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by tianchang on 2017/7/12.
 */
@Service
public class RegisterServiceImpl implements RegisterService {
    @Resource
    private RegisterDao registerDao;
    public String register(String idNum,String passWord,String phoneIdentifier,String phoneNum) {
        int i = 0;
            Map map = new HashMap();
            map.put("idNum", idNum);
            map.put("passWord", passWord);
            map.put("phoneIdentifier", phoneIdentifier);
            map.put("phoneNum", phoneNum);
            i=registerDao.register(map);
            if(i!=0){
                Message message=new Message("1","成功");
                String json=JSON.toJSONString(message);
                return json;
            }
            else {
                Message message = new Message("0", "注册失败");
                String json = JSON.toJSONString(message);
                return json;
            }
    }
}
