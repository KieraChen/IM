package com.dao;

import com.model.User;

public interface UserMapper {
    User selectUser(long id);
}
