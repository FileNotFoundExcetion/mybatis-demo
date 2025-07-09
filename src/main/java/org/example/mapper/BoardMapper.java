package org.example.mapper;

import org.apache.ibatis.annotations.Select;
import org.example.entity.Board;

/**
 * @Author
 * @Date 2025/7/9 14:11
 */
public interface BoardMapper {

    @Select("SELECT * FROM board WHERE board_id = #{id}")
    Board selectById(Integer id);
}
