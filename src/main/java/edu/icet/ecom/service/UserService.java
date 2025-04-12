package edu.icet.ecom.service;

import edu.icet.ecom.dto.User;


public interface UserService {
    User authenticateUser(String email,String password);
}
