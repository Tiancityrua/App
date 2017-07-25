package cn.Dao;

import cn.VO.User;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * Created by tianchang on 2017/7/13.
 */
@Repository
public interface LoginDao {
    List<User> login(Map map);
}
