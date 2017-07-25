package cn.Dao;

import cn.VO.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by tianchang on 2017/7/14.
 */
@Repository
public interface ValidateDao {
    List<User> select(String idNum);
}
