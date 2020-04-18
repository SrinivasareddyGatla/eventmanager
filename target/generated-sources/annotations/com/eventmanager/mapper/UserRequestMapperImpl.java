package com.eventmanager.mapper;

import com.eventmanager.data.UserData;
import com.eventmanager.model.User;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-04-17T19:27:34+0200",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 1.8.0_202 (Oracle Corporation)"
)
public class UserRequestMapperImpl implements UserRequestMapper {

    @Override
    public User convert(UserData userData) {
        if ( userData == null ) {
            return null;
        }

        User user = new User();

        user.setName( userData.getName() );
        user.setEmail( userData.getEmail() );

        return user;
    }
}
