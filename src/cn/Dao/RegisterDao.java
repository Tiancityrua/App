package cn.Dao;

import cn.VO.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * Created by tianchang on 2017/7/12.
 */
@Repository
public interface RegisterDao {
     int register(Map map);
}
