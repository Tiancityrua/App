package cn.Dao;

import cn.VO.Tmp;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by tianchang on 2017/7/18.
 */
@Repository
public interface GatewayDao {
     Tmp select();
    int delete();
}
