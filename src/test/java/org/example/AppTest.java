package org.example;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.example.entity.Board;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;

/**
 * Unit test for simple App.
 */
public class AppTest{
    SqlSessionFactory sqlSessionFactory;
    SqlSession sqlSession;
    @Before
    public void test()throws Exception {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        sqlSession= sqlSessionFactory.openSession();
       // System.out.println(sqlSessionFactory);
    }

    @Test
    public void test1()throws Exception {
        Board board = sqlSession.selectOne("org.example.mapper.BoardMapper.selectById", 188);
        System.out.println(board);
    }

    @Test
    public void test3()throws Exception {
//        Board board = sqlSession.delete("org.example.mapper.BoardMapper.selectById", 188);
//        System.out.println(board);
    }


    @After
    public void test2()throws Exception {
        sqlSession.close();
    }
}
