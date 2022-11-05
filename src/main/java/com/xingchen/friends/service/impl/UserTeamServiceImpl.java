package com.xingchen.friends.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xingchen.friends.mapper.UserTeamMapper;
import com.xingchen.friends.model.domain.UserTeam;
import com.xingchen.friends.service.UserTeamService;
import org.springframework.stereotype.Service;

/**
 * @author xingchen
 * @version V1.0
 * @Package com.xingchen.friends.service.impl
 * @date 2022/10/25 23:36
 */
@Service
public class UserTeamServiceImpl extends ServiceImpl<UserTeamMapper, UserTeam>
        implements UserTeamService {

}
