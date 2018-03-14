package xquant.shares.controller;

import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import xquant.shares.core.Result;
import xquant.shares.model.stockinfo;
import xquant.shares.service.StockinfoService;

@Controller
public class StockinfoController {
	
	@Autowired 
	private StockinfoService stockinfoService;
     
	
	@RequestMapping("getSharesInfo") 
	@ResponseBody
    public String getInfobystockCode(String stockCode ,HttpServletRequest request){  
		Result result = new Result(Result.SUCCESS.NO.getValue(), Result.RESULT_OP_FAIL);    
            List<stockinfo> list = stockinfoService.getSharesInfo(stockCode);  
            System.out.println("------User_list-----"+list.size());  
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("pagelist", list);
            result.setBody(map);
            result.setSuccess(Result.SUCCESS.YES.getValue());
            result.setMsg(Result.RESULT_OP_SUCCESS);
            return result.toString();
            
	}
	
	@RequestMapping("updateSharesByCode")
	
	public void updateByStockCode() throws ParseException{
		
		stockinfo si = new stockinfo();
		si.setStockCode("7000001");
		
		si.setStockName("民生+++银行");
		si.setTradingMarket("上交所");
		BigDecimal b = new BigDecimal("11.00000");
		si.setOfferingPrice(b);
		BigDecimal pe = new BigDecimal("6.76000");
		si.setPeRatio(pe);
		
		DateFormat dateFormat1 = new SimpleDateFormat("yyyy-MM-dd");
		Date d1 = dateFormat1.parse("1999-11-10");
		si.setLaunchDate(d1);
		DateFormat dateFormat2 = new SimpleDateFormat("yyyy-MM-dd");
		Date d2 = dateFormat2.parse("2049-11-10");
		si.setMaturityDate(d2);
//		si.setId(10);
		
		stockinfoService.insert(si);
		System.out.println(1);
	}
          	
}
