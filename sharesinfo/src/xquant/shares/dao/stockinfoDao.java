package xquant.shares.dao;

import java.util.List;

import xquant.shares.model.stockinfo;

public interface stockinfoDao {
    int deleteByPrimaryKey(Integer id);

    void insert(stockinfo record);

    int insertSelective(stockinfo record);

    stockinfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(stockinfo record);

    int updateByPrimaryKey(stockinfo record);
    
    //查询股票信息
	List<stockinfo> selectBystockCode(String stockCode);
	
	//根据股票代码更新股票信息
	int updateByStockCode(stockinfo record);
	

    
}