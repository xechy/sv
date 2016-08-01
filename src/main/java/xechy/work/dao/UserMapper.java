package xechy.work.dao;

import xechy.work.model.User;
import xechy.work.service.BaseService;

import java.util.List;

/**
 * Created by Japa xie on 2016/7/30.
 * 用户接口
 */
public interface UserMapper extends BaseService<User>{


    @Override
    List<User> selectAll();
}
