package first.amugeana.controller;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import first.amugeana.service.AmugeanaService;
import first.sample.service.SampleService;

@Controller
public class AmugeanaController {
	@Resource(name = "amugeanaService")
	private AmugeanaService amugeanaService;

	@RequestMapping(value = "/amugeana/typeSelect.do")
	public ModelAndView openSampleBoardList(Map<String, Object> commandMap) throws Exception {
		ModelAndView mv = new ModelAndView("/amugeana/typeSelect");
		//List<Map<String, Object>> list = amugeanaService.selectTypeList(commandMap);
		//mv.addObject("list", list);

		return mv;
	}
}
