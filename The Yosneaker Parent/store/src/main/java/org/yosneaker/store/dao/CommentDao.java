package org.yosneaker.store.dao;

import org.springframework.stereotype.Repository;

import org.yosneaker.store.dto.Comment;
import org.yosneaker.store.dto.CommentExample;
import org.yosneaker.store.common.SimpleMybatisSupport;
/**
 * 类描述:评论
 * 创建人:Rainy
 * 创建时间:2015-03-08 20:21:29
 * @version
 */
 
@Repository("comment")
public class CommentDao extends SimpleMybatisSupport<Comment, Integer, CommentExample>{
	
	@Override
    public String getMybatisMapperNamesapce() {
        return "org.yosneaker.store.dao.CommentMapper";
    }


}