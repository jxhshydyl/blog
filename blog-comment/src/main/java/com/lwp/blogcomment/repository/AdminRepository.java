package com.lwp.blogcomment.repository;

import com.lwp.comment.blogcomment.model.domain.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @Auther: liuweipeng
 * @Date: 2018/7/25 18:28
 * @Description:
 */
public interface AdminRepository extends JpaRepository<Admin,Long> {
    List<Admin> findByIdAndPassword(Long id, String password);
}
