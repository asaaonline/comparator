package lk.av.ruh.eng.mobilepricecompair.authentication;

import lk.av.ruh.eng.mobilepricecompair.commonModels.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AuthResourcesImpl implements AuthResources {

    @Autowired
    AuthRepo authRepo;

    @Override
    public Response login(LoginUser loginUser) {
        return null;
    }

    @Override
    public Response register(UserDto userDTO) {
        UserEntity save;
        try {
            save = authRepo.save(new UserEntity(userDTO.getName(), userDTO.getTel(), userDTO.getAddress(), userDTO.getPassword()));
        }catch (Exception e){
            return new  Response("failed",e.toString());
        }
        return new Response("successful",save.getId());
    }
}
