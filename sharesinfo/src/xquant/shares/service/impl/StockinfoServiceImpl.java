package xquant.shares.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import xquant.shares.dao.stockinfoDao;
import xquant.shares.model.stockinfo;
import xquant.shares.service.StockinfoService;

@Service("stockinService")
public class StockinfoServiceImpl implements StockinfoService{
	@Autowired  
    private stockinfoDao stockinfodao;

	
	//查询所有股票
	@Override
	public List<stockinfo> getSharesInfo(String stockCode) {
		  return stockinfodao.selectBystockCode(stockCode);
	}

	//根据股票代码更新股票信息
	@Override
	public Integer updateByStockCode(stockinfo record){
		return stockinfodao.updateByStockCode(record);
	}

	@Override
	public void insert(stockinfo record) {
			 stockinfodao.insert(record);
	}
	
	@Override
	public String deleteByStockCode(String stockCodeDel,String stockCodeSearch){
		
		stockinfodao.deleteByStockCode(stockCodeDel);
		List<stockinfo> sfList = stockinfodao.selectBystockCode(stockCodeSearch);
		
		Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
		String stockOfJson =gson.toJson(sfList);
		return stockOfJson;	
		
	}
	
}
