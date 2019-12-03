package first.amugeano.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import first.amugeona.dao.AmugeonaDAO;
import first.amugeona.service.AmugeonaService;
import first.sample.dao.SampleDAO;

@Service("amugeonaService")
public class AmugeonaServiceImpl implements AmugeonaService{

	@Resource(name = "amugeonaDAO")
	private AmugeonaDAO amugeonaDAO;
	
	@Override
	public List<Map<String, Object>> selectTypeList(Map<String, Object> commandMap) throws Exception {
		return amugeonaDAO.selectTypeList(commandMap);
	}

	@Override
	public List<Map<String, Object>> selectTypeFirstList(Map<String, Object> commandMap) throws Exception {
		return amugeonaDAO.selectTypeFirstList(commandMap);
	}

	@Override
	public List<Map<String, Object>> selectFoodList(Map<String, Object> commandMap) throws Exception {
		return amugeonaDAO.selectFoodList(commandMap);
	}

}
