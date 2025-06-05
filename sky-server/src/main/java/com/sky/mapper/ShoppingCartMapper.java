package com.sky.mapper;

import com.sky.entity.ShoppingCart;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ShoppingCartMapper {


    /**
     * 动态条件查询
     * @param shoppingCart
     * @return
     */

    List<ShoppingCart> list(ShoppingCart shoppingCart);


}
