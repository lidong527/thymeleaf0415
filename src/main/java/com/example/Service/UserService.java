package com.example.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Dto.UserSearchRequest;
import com.example.Entity.DemoUser;
import com.example.Entity.UserEntity;
import com.example.Mapper.UserMapper;
import com.example.repository.UserRepository;
/**
 * ユーザー情報 Service
 */
@Service
public class UserService {
    /**
     * ユーザー情報 Mapper
     */
    @Autowired
    private UserMapper userMapper;
    
    /**
     * ユーザー情報 Repository
     */
    @Autowired
    private UserRepository userRepository;
    /**
     * ユーザー情報検索
　　　* @param userSearchRequest リクエストデータ
     * @return 検索結果
     */
    public DemoUser search(UserSearchRequest userSearchRequest) {
        return userMapper.search(userSearchRequest);
    }
    
    /**
     * ユーザー情報 全検索
     * @return 検索結果
     */
    public List<UserEntity> searchAll() {
      return userRepository.findAll();
    }
    
    /**
     * ユーザー情報 主キー検索
     * @return 検索結果
     */
    public UserEntity findById(Long id) {
      return userRepository.findById(id).get();
    }
}