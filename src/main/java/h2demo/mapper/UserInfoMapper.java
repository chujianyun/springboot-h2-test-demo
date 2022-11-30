package h2demo.mapper;

import h2demo.domain.UserInfoDO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserInfoMapper {
    
    int deleteById(Long id);
    
    UserInfoDO selectById(Long id);
}
