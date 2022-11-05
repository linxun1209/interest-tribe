package com.xingchen.friends.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xingchen.friends.model.domain.Team;
import com.xingchen.friends.model.domain.User;
import com.xingchen.friends.model.dto.TeamQuery;
import com.xingchen.friends.model.request.TeamJoinRequest;
import com.xingchen.friends.model.request.TeamQuitRequest;
import com.xingchen.friends.model.request.TeamUpdateRequest;
import com.xingchen.friends.model.vo.TeamUserVO;

import java.util.List;

/**
 * @author xingchen
 * @version V1.0
 * @Package com.xingchen.friends.service
 * @date 2022/10/25 23:25
 */
public interface TeamService extends IService<Team> {

    /**
     * 创建队伍
     *
     * @param team
     * @param loginUser
     * @return
     */
    long addTeam(Team team, User loginUser);

    /**
     * 搜索队伍
     *
     * @param teamQuery
     * @param isAdmin
     * @return
     */
    List<TeamUserVO> listTeams(TeamQuery teamQuery, boolean isAdmin);

    /**
     * 更新队伍
     * @param teamUpdateRequest
     * @param loginUser
     * @return
     */
//    boolean updateTeam(TeamUpdateRequest teamUpdateRequest, User loginUser);
//

    /**
     * 加入队伍
     *
     * @param teamJoinRequest
     * @return
     */
    boolean joinTeam(TeamJoinRequest teamJoinRequest, User loginUser);

    /**
     * 退出队伍
     *
     * @param teamQuitRequest
     * @param loginUser
     * @return
     */
    boolean quitTeam(TeamQuitRequest teamQuitRequest, User loginUser);

    /**
     * 删除（解散）队伍
     *
     * @param id
     * @param loginUser
     * @return
     */
    boolean deleteTeam(long id, User loginUser);

    boolean updateTeam(TeamUpdateRequest teamUpdateRequest, User loginUser);
}



