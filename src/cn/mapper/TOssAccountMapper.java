package cn.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import cn.domain.TOssAccount;
import cn.domain.TOssAccountExample;

public interface TOssAccountMapper {
    int countByExample(TOssAccountExample example);

    int deleteByExample(TOssAccountExample example);

    int deleteByPrimaryKey(String id);

    int insert(TOssAccount record);

    int insertSelective(TOssAccount record);

    List<TOssAccount> selectByExample(TOssAccountExample example);

    TOssAccount selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") TOssAccount record, @Param("example") TOssAccountExample example);

    int updateByExample(@Param("record") TOssAccount record, @Param("example") TOssAccountExample example);

    int updateByPrimaryKeySelective(TOssAccount record);

    int updateByPrimaryKey(TOssAccount record);

    /*
	 * OSS中查询所有用户
	 */
	List<TOssAccount> selectALL(Map<String, String> map);
	
	List<TOssAccount> selectALLPAGE(Map<String, String> map);
	// redis初始化
	List<TOssAccount> selectByLimit(Map map);
	// 根据adpterid分页查询企业信息
	List<TOssAccount> selectEnterperiseByLimit(Map map);
	
	int selectALLSize(Map<String, String> map);
}