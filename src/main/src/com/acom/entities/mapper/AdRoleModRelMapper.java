package com.acom.entities.mapper;

import com.acom.entities.model.AdRoleModRel;
import com.acom.entities.model.AdRoleModRelExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AdRoleModRelMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ad_role_mod_rel
     *
     * @mbg.generated Wed Jun 07 16:25:07 CST 2017
     */
    long countByExample(AdRoleModRelExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ad_role_mod_rel
     *
     * @mbg.generated Wed Jun 07 16:25:07 CST 2017
     */
    int deleteByExample(AdRoleModRelExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ad_role_mod_rel
     *
     * @mbg.generated Wed Jun 07 16:25:07 CST 2017
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ad_role_mod_rel
     *
     * @mbg.generated Wed Jun 07 16:25:07 CST 2017
     */
    int insert(AdRoleModRel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ad_role_mod_rel
     *
     * @mbg.generated Wed Jun 07 16:25:07 CST 2017
     */
    int insertSelective(AdRoleModRel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ad_role_mod_rel
     *
     * @mbg.generated Wed Jun 07 16:25:07 CST 2017
     */
    List<AdRoleModRel> selectByExample(AdRoleModRelExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ad_role_mod_rel
     *
     * @mbg.generated Wed Jun 07 16:25:07 CST 2017
     */
    AdRoleModRel selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ad_role_mod_rel
     *
     * @mbg.generated Wed Jun 07 16:25:07 CST 2017
     */
    int updateByExampleSelective(@Param("record") AdRoleModRel record, @Param("example") AdRoleModRelExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ad_role_mod_rel
     *
     * @mbg.generated Wed Jun 07 16:25:07 CST 2017
     */
    int updateByExample(@Param("record") AdRoleModRel record, @Param("example") AdRoleModRelExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ad_role_mod_rel
     *
     * @mbg.generated Wed Jun 07 16:25:07 CST 2017
     */
    int updateByPrimaryKeySelective(AdRoleModRel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ad_role_mod_rel
     *
     * @mbg.generated Wed Jun 07 16:25:07 CST 2017
     */
    int updateByPrimaryKey(AdRoleModRel record);
}