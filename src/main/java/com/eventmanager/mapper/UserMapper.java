package com.eventmanager.mapper;

import com.eventmanager.data.UserData;
import com.eventmanager.model.User;
import org.mapstruct.Mapper;

import java.util.Collection;
import java.util.List;

@Mapper(componentModel = "spring")
public interface UserMapper {
    User map(final UserData userData);
    List<User> map(final List<UserData> userData);
    UserData reverseMap(final User user);
    List<UserData> reverseMap(final Collection<User> users);
}
