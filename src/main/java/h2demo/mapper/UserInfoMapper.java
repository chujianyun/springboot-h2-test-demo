package h2demo.mapper;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserInfoMapper {

    int deleteById(Long id);
}
