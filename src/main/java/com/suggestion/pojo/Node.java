package com.suggestion.pojo;

import com.google.common.base.Joiner;
import com.google.common.collect.Lists;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * 搜索树节点类
 *
 * @Auther wanglp
 * @Time 16/01/01 下午11:31
 * @Email wanglp840@nenu.edu.cn
 */

@Getter
@Setter
public class Node {

    public int nodeId;
    // 转换条件
    public List<Path> pathList = Lists.newArrayList();
    // 匹配字节点的ruleId
    public List<Integer> matchRuleIdList = Lists.newArrayList();

    // 方便调试用
    public char tmpValue;

    public Node(int nodeId) {
        this.nodeId = nodeId;
    }


    @Override
    public String toString() {
        return "Node{" +
                "nodeId=" + nodeId +
                ",value=" + tmpValue +
                ", pathList=" + Joiner.on(" ").join(pathList) +
                ", matchRuleIdList=" + matchRuleIdList +
                '}';
    }
}
