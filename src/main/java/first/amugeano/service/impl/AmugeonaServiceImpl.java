package first.amugeano.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import first.amugeona.dao.AmugeonaDAO;
import first.amugeona.service.AmugeonaService;
import first.sample.dao.SampleDAO;

@Service("amugeanaService")
public class AmugeonaServiceImpl implements AmugeonaService{

	@Resource(name = "amugeanaDAO")
	private AmugeonaDAO amugeanaDAO;
	
	@Override
	public List<Map<String, Object>> selectTypeList(Map<String, Object> commandMap) throws Exception {
		return amugeanaDAO.selectTypeList(commandMap);
	}

	@Override
	public List<Map<String, Object>> selectTypeFirstList(Map<String, Object> commandMap) throws Exception {
		return amugeanaDAO.selectTypeFirstList(commandMap);
	}

}
