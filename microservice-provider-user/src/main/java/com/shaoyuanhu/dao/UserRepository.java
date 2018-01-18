package com.shaoyuanhu.dao;

import com.shaoyuanhu.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @Description:
 * @Author: ShaoYuanHu
 * @Date: Created in 2018-01-15
 */
@Repository
public interface UserRepository extends JpaRepository<User,Long> {
}
