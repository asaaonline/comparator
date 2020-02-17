package lk.av.ruh.eng.mobilepricecompair.authentication;

import lk.av.ruh.eng.mobilepricecompair.commonModels.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;



@Component
public class AuthResourcesImpl implements AuthResources {

    @Autowired
    AuthRepo authRepo;

    @Autowired
    private PasswordEncoder passwordEncoder;


    @Override
    public Response login(LoginUser loginUser) {
        UserEntity userEntitiesByName;

        try {
            userEntitiesByName  = authRepo.getUserEntitiesByName(loginUser.getUserName());
            boolean matches = passwordEncoder.matches( loginUser.getPassword(),userEntitiesByName.getPassword());
            if (!matches) {
                return new Response("Password Wrong", null);
            }

        } catch (Exception e) {
            return new Response("no user found", null);
        }

        userEntitiesByName.setPassword(null);
        return new Response("successful", userEntitiesByName);


    }

    @Override
    public Response register(UserDto userDTO) {
        UserEntity save;
        try {
            save = authRepo.save(
                    new UserEntity(userDTO.getName(),
                            userDTO.getTel(), userDTO.getAddress(),
                            passwordEncoder.encode(userDTO.getPassword()),userDTO.getEmail(),null));
        } catch (Exception e) {
            return new Response("failed", e.toString());
        }
        save.setPassword(null);
        return new Response("successful", save);
    }
}
