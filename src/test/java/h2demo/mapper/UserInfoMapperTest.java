package h2demo.mapper;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import javax.annotation.Resource;


public class UserInfoMapperTest extends BaseMapperTest {

    @Resource
    private UserInfoMapper userInfoMapper;

    @Test
    public void deleteById() {
        int rows = userInfoMapper.deleteById(1L);
        Assertions.assertThat(rows).isGreaterThan(0);
    }
}