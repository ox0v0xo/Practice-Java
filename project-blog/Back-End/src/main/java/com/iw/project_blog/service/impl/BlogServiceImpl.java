package com.iw.project_blog.service.impl;

import com.iw.project_blog.entity.Blog;
import com.iw.project_blog.mapper.BlogMapper;
import com.iw.project_blog.service.IBlogService;
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
public class BlogServiceImpl extends ServiceImpl<BlogMapper, Blog> implements IBlogService {

}
