package cn.Dao;

import cn.VO.Lock;
import cn.VO.User;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * Created by tianchang on 2017/7/17.
 */
@Repository
public interface OpenlockDao {
    List<User> match(Map map);
    String equal(String phoneNum);
    int save(String mac);
    String mac(String lockPwd);
    int update(String lockPwd);
}
