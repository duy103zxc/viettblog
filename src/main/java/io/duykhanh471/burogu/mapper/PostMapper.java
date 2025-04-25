package io.duykhanh471.burogu.mapper;

import org.mapstruct.Mapper;

import io.duykhanh471.burogu.dto.request.PostRequestDto;
import io.duykhanh471.burogu.entity.Post;

@Mapper(componentModel = "spring")
public interface PostMapper {
    PostRequestDto postToPostRequestDto(Post post);
    Post postRequestDtoToPost(PostRequestDto postRequestDto);
}
