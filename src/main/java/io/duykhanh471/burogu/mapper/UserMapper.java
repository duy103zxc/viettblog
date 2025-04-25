package io.duykhanh471.burogu.mapper;

import io.duykhanh471.burogu.dto.request.UserDto;
import io.duykhanh471.burogu.entity.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {
    UserDto UserDaoToDto(User user);
    User UserDtoToDao(UserDto userDto);
}