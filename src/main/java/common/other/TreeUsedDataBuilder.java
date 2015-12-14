package common.other;

import com.google.common.collect.Lists;
import common.entity.Node;

import java.util.List;
import java.util.Map;

/**
 * tree使用数据类，builder模式实现－未使用
 *
 * @Auther wanglp
 * @Time 15/12/13 上午12:11
 * @Email wanglp840@nenu.edu.cn
 */

public class TreeUsedDataBuilder {
    // 根节点
    private Node rootNode;
    // 词
    private List<String> allWordList;
    // 词－权重
    private Map<String, Double> wordWeightMap;
    // 字－code
    private Map<Character, Integer> characterCodeMap;



    public static class Builder{
        private Node rootNode;
        private List<String> allWordList;
        private Map<String, Double> wordWeightMap;
        private Map<Character, Integer> characterCodeMap;

        public Builder(){

        }
        public Builder setRootNode(Node node){
            this.rootNode = node;
            return this;
        }
        public Builder setAllWordList(List<String> allWordList){
            this.allWordList = allWordList;
            return this;
        }
        public Builder setWordWeightMap(Map<String, Double> wordWeightMap){
            this.wordWeightMap = wordWeightMap;
            return this;
        }
        public Builder setCharacterCodeMap(Map<Character, Integer> characterCodeMap){
            this.characterCodeMap = characterCodeMap;
            return this;
        }

        public TreeUsedDataBuilder builder(){
            return new TreeUsedDataBuilder(this);
        }
    }


    public static Builder create(){
        return new Builder();
    }

    private TreeUsedDataBuilder(Builder builder){
        rootNode = builder.rootNode;
        allWordList = builder.allWordList;
        wordWeightMap = builder.wordWeightMap;
        characterCodeMap = builder.characterCodeMap;
    }


    public static void main(String[] args) {
        TreeUsedDataBuilder treeUsedDataBuilder = TreeUsedDataBuilder.create().
                setAllWordList(Lists.newArrayList(" ")).
                setCharacterCodeMap(null).
                builder();
    }
}
