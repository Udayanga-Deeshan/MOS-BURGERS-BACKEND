package edu.icet.ecom.service.impl;

import edu.icet.ecom.dto.User;
import edu.icet.ecom.entity.UserEntity;
import edu.icet.ecom.repository.UserRepository;
import edu.icet.ecom.service.UserService;
import lombok.RequiredArgsConstructor;
import org.jasypt.util.text.BasicTextEncryptor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    String key ="#345891AG";
    final UserRepository userRepository;

    final ModelMapper mapper;


    @Override
    public User authenticateUser(String email, String password) {
        UserEntity entity = userRepository.findByEmail(email);
        if(entity ==null){
            throw  new RuntimeException("User Not found with email "+email);
        }

        BasicTextEncryptor encryptor = new BasicTextEncryptor();
        encryptor.setPassword(key);

        String decryptedPassword = encryptor.decrypt(entity.getPassword());
        System.out.println(decryptedPassword);
        if(!decryptedPassword.equals(password)){
           throw  new RuntimeException("Invalid Password");
        }

        return mapper.map(entity,User.class);
    }
}

