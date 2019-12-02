package first.amugeana.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import first.common.AbstractDAO;

@Repository("amugeanaDAO")
public class AmugeanaDAO extends AbstractDAO{
	@SuppressWarnings("unchecked")
	public List<Map<String, Object>> selectTypeList(Map<String, Object> map) throws Exception {
		return (List<Map<String, Object>>) selectList("sample.selectBoardList", map);
	}
}
