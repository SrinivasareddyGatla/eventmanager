package com.eventmanager.mapper;

import com.eventmanager.data.UserData;
import com.eventmanager.model.User;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-04-18T10:30:03+0200",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 1.8.0_241 (Oracle Corporation)"
)
@Component
public class UserMapperImpl implements UserMapper {

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

    @Override
    public List<UserData> convertToUserData(List<User> users) {
        if ( users == null ) {
            return null;
        }

        List<UserData> list = new ArrayList<UserData>( users.size() );
        for ( User user : users ) {
            list.add( userToUserData( user ) );
        }

        return list;
    }

    @Override
    public List<User> convertToUser(List<UserData> users) {
        if ( users == null ) {
            return null;
        }

        List<User> list = new ArrayList<User>( users.size() );
        for ( UserData userData : users ) {
            list.add( convert( userData ) );
        }

        return list;
    }

    protected UserData userToUserData(User user) {
        if ( user == null ) {
            return null;
        }

        UserData userData = new UserData();

        userData.setName( user.getName() );
        userData.setEmail( user.getEmail() );

        return userData;
    }
}
