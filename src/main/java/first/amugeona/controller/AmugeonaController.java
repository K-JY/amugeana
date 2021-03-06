package first.amugeona.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import first.amugeona.service.AmugeonaService;
import first.common.Util;
import first.sample.service.SampleService;

@Controller
public class AmugeonaController {
	@Resource(name = "amugeonaService")
	private AmugeonaService amugeonaService;

	@RequestMapping(value = "/amugeona/typeSelect.do")
	public ModelAndView openSampleBoardList(Map<String, Object> commandMap) throws Exception {
		ModelAndView mv = new ModelAndView("/amugeona/typeSelect");
		List<Map<String, Object>> list = amugeonaService.selectTypeFirstList(commandMap);
		mv.addObject("list", list);

		return mv;
	}
	
	@RequestMapping(value = "/amugeona/foodSelect.do")
	public ModelAndView foodSelect(HttpServletRequest request) throws Exception {
		ModelAndView mv = new ModelAndView("/amugeona/foodSelect");
		String typeData = request.getParameter("typeData");
		String stepData = request.getParameter("stepData");
		
		String[] typeDataList = typeData.split("|");
		String[] stepDataList = stepData.split("|");
		
		Map<String, Object> typeMap = new HashMap<String, Object>();
		for(int i = 0;i<typeDataList.length-1;i++) {
			typeMap.put(stepDataList[i], typeDataList[i]);
		}
		
		List<Map<String, Object>> list = amugeonaService.selectFoodList(typeMap);
		mv.addObject("list", list);

		return mv;
	}

	@RequestMapping(value = "/amugeona/ajaxTypeList.do", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> testJson( @RequestBody Map<Object, Object> paramMap, ModelMap model) throws Exception {
 
		Map<String, Object> resultMap = new HashMap<String,Object>();
		if(Util.isBlank((String)paramMap.get("category"))) { 
			resultMap.put("result",false); 
			return resultMap;
		}
		
		resultMap.put("category", (String)paramMap.get("category"));
		List<Map<String, Object>> list = amugeonaService.selectTypeList(resultMap);
		resultMap.put("list", list);
		
		return resultMap; // 화면으로 던져준다!!
		 
	}


}
