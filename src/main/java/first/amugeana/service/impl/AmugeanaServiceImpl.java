package first.amugeana.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import first.amugeana.dao.AmugeanaDAO;
import first.amugeana.service.AmugeanaService;
import first.sample.dao.SampleDAO;

@Service("amugeanaService")
public class AmugeanaServiceImpl implements AmugeanaService{

	@Resource(name = "amugeanaDAO")
	private AmugeanaDAO amugeanaDAO;
	
	@Override
	public List<Map<String, Object>> selectTypeList(Map<String, Object> commandMap) throws Exception {
		return amugeanaDAO.selectTypeList(commandMap);
	}

	@Override
	public List<Map<String, Object>> selectTypeFirstList(Map<String, Object> commandMap) throws Exception {
		return amugeanaDAO.selectTypeFirstList(commandMap);
	}

}
