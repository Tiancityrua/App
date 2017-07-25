package cn.Service;

import cn.Dao.LocklistDao;
import cn.VO.Lock;
import cn.VO.Msg;
import com.alibaba.fastjson.JSON;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by tianchang on 2017/7/16.
 */
@Service
public class LocklistServiceImpl implements LocklistService {
    @Resource
    private LocklistDao locklistDao;
    public String locklist(String phoneNum){
        Lock lock=locklistDao.locklist(phoneNum);
        if(lock!=null) {
            Msg msg = new Msg("1", "成功",lock);
            String json2 = JSON.toJSONString(msg);
            return json2;
        }
        else
        {
            Msg msg = new Msg("0", "没有可用门锁",null);
            String json2 = JSON.toJSONString(msg);
            return json2;
        }
    }
}
