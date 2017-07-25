package cn.Service;

import cn.Dao.OpenlockDao;
import cn.VO.Message;
import com.alibaba.fastjson.JSON;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by tianchang on 2017/7/17.
 */
@Service
public class OpenlockServiceImpl implements OpenlockService{
    @Resource
    OpenlockDao openlockDao;
    public String openlock(String phoneNum,String lockPwd,String phoneIdentifier){
        Map map=new HashMap();
        map.put("phoneNum",phoneNum);
        map.put("phoneIdentifier",phoneIdentifier);
        int i=openlockDao.match(map).size();
        String pwd=openlockDao.equal(phoneNum);
        if(i==0){
            Message message=new Message("0","手机标识符与手机号不匹配");
            String json= JSON.toJSONString(message);
            return json;
        }
        if(!lockPwd.equals(pwd)){
            Message message=new Message("0","开锁密码错误");
            String json=JSON.toJSONString(message);
            return json;
        }
        String macAddr=openlockDao.mac(pwd);
        try{
            openlockDao.save(macAddr);
        }
        catch (Exception e){
            Message message=new Message("0","开锁失败");
            String json=JSON.toJSONString(message);
            return json;
        }
        Message message=new Message("1","开锁成功");
        String json=JSON.toJSONString(message);
        openlockDao.update(pwd);
        return json;
    }
}
