package com.equalinformation.shoppingcart_shm.dao;

import com.equalinformation.shoppingcart_shm.entity.Product;
import com.equalinformation.shoppingcart_shm.model.PaginationResult;
import com.equalinformation.shoppingcart_shm.model.ProductInfo;

public interface ProductDAO {



    public Product findProduct(String code);

    public ProductInfo findProductInfo(String code) ;


    public PaginationResult<ProductInfo> queryProducts(int page,
                                                       int maxResult, int maxNavigationPage  );

    public PaginationResult<ProductInfo> queryProducts(int page, int maxResult,
                                                       int maxNavigationPage, String likeName);

    public void save(ProductInfo productInfo);

}
