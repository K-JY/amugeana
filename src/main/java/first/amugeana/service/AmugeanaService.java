package first.amugeana.service;

import java.util.List;
import java.util.Map;

public interface AmugeanaService {
	List<Map<String,Object>> selectTypeFirstList(Map<String, Object> commandMap) throws Exception;
	
	List<Map<String,Object>> selectTypeList(Map<String, Object> commandMap) throws Exception;
}
