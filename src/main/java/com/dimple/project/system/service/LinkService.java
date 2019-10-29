package com.ruoyi.project.system.link.service;

import com.dimple.project.system.domain.Link;

import java.util.List;

/**
 * @className: 友链Service接口
 * @description:
 * @author: Dimple
 * @date: 2019-10-28
 */
public interface LinkService {
    /**
     * 查询友链
     *
     * @param id 友链ID
     * @return 友链
     */
    Link selectLinkById(Long id);

    /**
     * 查询友链列表
     *
     * @param link 友链
     * @return 友链集合
     */
    List<Link> selectLinkList(Link link);

    /**
     * 新增友链
     *
     * @param link 友链
     * @return 结果
     */
    int insertLink(Link link);

    /**
     * 修改友链
     *
     * @param link 友链
     * @return 结果
     */
    int updateLink(Link link);

    /**
     * 批量删除友链
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    int deleteLinkByIds(String ids);

    /**
     * 删除友链信息
     *
     * @param id 友链ID
     * @return 结果
     */
    int deleteLinkById(Long id);
}