package cn.Service;

import cn.Dao.GatewayDao;
import cn.VO.Tmp;
import com.alibaba.fastjson.JSON;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by tianchang on 2017/7/18.
 */
@Service
public class GatewayServiceImpl implements GatewayService {
    @Resource
    private GatewayDao gatewayDao;
    public String gateway(){
         Tmp tmp=gatewayDao.select();
        String json= JSON.toJSONString(tmp);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        gatewayDao.delete();
        return json;
    }
}
