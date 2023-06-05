package com.example.Mapper;

import org.apache.ibatis.annotations.Mapper;

import com.example.Dto.UserSearchRequest;
import com.example.Entity.DemoUser;
/**
 * ユーザー情報 Mapper
 */
@Mapper
public interface UserMapper {
    /**
     * ユーザー情報検索
     * @param user 検索用リクエストデータ
     * @return ユーザー情報
     */
    DemoUser search(UserSearchRequest user);
}
