package org.lanqiao.service;

import org.lanqiao.bean.Address;

import java.util.List;


public interface IAddressService {

    int deleteByPrimaryKey(Integer addId);

    int insert(Address record);

    int insertSelective(Address record);

    Address selectByPrimaryKey(Integer addId);

    int updateByPrimaryKeySelective(Address record);

    int updateByPrimaryKey(Address record);

    /**
     * 查询所有地址信息
     * @return
     */
    List<Address> getAllAddress();
}
