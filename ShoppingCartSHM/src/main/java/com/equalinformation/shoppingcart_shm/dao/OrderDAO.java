package com.equalinformation.shoppingcart_shm.dao;

import com.equalinformation.shoppingcart_shm.model.CartInfo;
import com.equalinformation.shoppingcart_shm.model.OrderDetailInfo;
import com.equalinformation.shoppingcart_shm.model.OrderInfo;
import com.equalinformation.shoppingcart_shm.model.PaginationResult;

import java.util.List;

public interface OrderDAO {

    public void saveOrder(CartInfo cartInfo);

    public PaginationResult<OrderInfo> listOrderInfo(int page,
                                                     int maxResult, int maxNavigationPage);

    public OrderInfo getOrderInfo(String orderId);

    public List<OrderDetailInfo> listOrderDetailInfos(String orderId);

}
