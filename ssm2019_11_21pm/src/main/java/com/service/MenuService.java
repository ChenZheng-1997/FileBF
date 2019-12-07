package com.service;

import com.domain.Menu;
import com.domain.User;

import java.util.List;

public interface MenuService{


    int deleteByPrimaryKey(Integer id);

    int insert(Menu record);

    int insertSelective(Menu record);

    Menu selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Menu record);

    int updateByPrimaryKey(Menu record);

    /**
     * 查询用户的menu
     * @return
     */
    List<Menu> selectUserMenu(User user);

}
