package com.example.demo.mapper.master;

import com.example.demo.entity.GlManYg;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.Map;

/**
 * 用户信息操作mapper
 * @author liusj
 */
@Mapper
public interface GlManYgMapper {
    /**
     * 删除指定用户
     * @param key 用户
     * @return 成功操作的数量
     */
    int deleteByPrimaryKey(GlManYg key);

    /**
     * 新增单个用户
     * @param record 新用户
     * @return 成功操作的数量
     */
    int insert(GlManYg record);

    /**
     * 修改用户信息
     * @param record 用户信息
     * @return 成功操作的数量
     */
    int updateByPrimaryKey(GlManYg record);

    /**
     * 返回指定用户信息
     * @param params 条件
     * @return 用户信息
     */
   // @Select(value = "SELECT * FROM SHDB_${comId}.dbo.gl_man_yg WHERE com_id = #{comId} AND zgbh = #{userCode}")
    GlManYg findByUserCode(Map<String,String> params);
}