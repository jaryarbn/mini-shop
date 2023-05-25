package com.github.jaryarbn.minishop.generate;

import com.github.jaryarbn.minishop.generate.Goods;
import com.github.jaryarbn.minishop.generate.GoodsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GoodsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table GOODS
     *
     * @mbg.generated Thu May 25 21:40:52 CST 2023
     */
    long countByExample(GoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table GOODS
     *
     * @mbg.generated Thu May 25 21:40:52 CST 2023
     */
    int deleteByExample(GoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table GOODS
     *
     * @mbg.generated Thu May 25 21:40:52 CST 2023
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table GOODS
     *
     * @mbg.generated Thu May 25 21:40:52 CST 2023
     */
    int insert(Goods row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table GOODS
     *
     * @mbg.generated Thu May 25 21:40:52 CST 2023
     */
    int insertSelective(Goods row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table GOODS
     *
     * @mbg.generated Thu May 25 21:40:52 CST 2023
     */
    List<Goods> selectByExampleWithBLOBs(GoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table GOODS
     *
     * @mbg.generated Thu May 25 21:40:52 CST 2023
     */
    List<Goods> selectByExample(GoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table GOODS
     *
     * @mbg.generated Thu May 25 21:40:52 CST 2023
     */
    Goods selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table GOODS
     *
     * @mbg.generated Thu May 25 21:40:52 CST 2023
     */
    int updateByExampleSelective(@Param("row") Goods row, @Param("example") GoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table GOODS
     *
     * @mbg.generated Thu May 25 21:40:52 CST 2023
     */
    int updateByExampleWithBLOBs(@Param("row") Goods row, @Param("example") GoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table GOODS
     *
     * @mbg.generated Thu May 25 21:40:52 CST 2023
     */
    int updateByExample(@Param("row") Goods row, @Param("example") GoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table GOODS
     *
     * @mbg.generated Thu May 25 21:40:52 CST 2023
     */
    int updateByPrimaryKeySelective(Goods row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table GOODS
     *
     * @mbg.generated Thu May 25 21:40:52 CST 2023
     */
    int updateByPrimaryKeyWithBLOBs(Goods row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table GOODS
     *
     * @mbg.generated Thu May 25 21:40:52 CST 2023
     */
    int updateByPrimaryKey(Goods row);
}