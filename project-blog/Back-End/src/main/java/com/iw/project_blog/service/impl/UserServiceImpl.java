package com.iw.project_blog.service.impl;

import com.iw.project_blog.entity.User;
import com.iw.project_blog.mapper.UserMapper;
import com.iw.project_blog.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author iw
 * @since 2024-10-10
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
