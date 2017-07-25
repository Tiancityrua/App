package cn.Service;

import cn.Dao.ValidateDao;
import cn.VO.Message;
import com.alibaba.fastjson.JSON;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by tianchang on 2017/7/14.
 */
@Service
public class ValidateServiceImpl implements ValidateService {
    @Resource
    private ValidateDao validateDao;
    public String validate(String idNum){
        if (validateDao.select(idNum).size()!=0){
            Message message=new Message("1","成功");
            String json= JSON.toJSONString(message);
            return json;
        }
        else {
            Message message=new Message("0","不存在此身份证号");
            String json= JSON.toJSONString(message);
            return json;
        }


    }
}
