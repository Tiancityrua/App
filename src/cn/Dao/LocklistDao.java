package cn.Dao;

import cn.VO.Lock;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by tianchang on 2017/7/16.
 */
@Repository
public interface LocklistDao {
    Lock locklist(String phoneNum);
}
