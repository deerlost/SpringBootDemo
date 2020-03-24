package com.easypoi.entity;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Description TODO 好莱客项目
 * @ClassName：TestEntity :
 * @Package com.easypoi.entity
 * @anthor：wyang
 * @date：2019/12/21
 * @版本：V1.0
 */
public class TestEntity {

    private Map  tMap ;

    private List tList;

    public Map gettMap() {
        return tMap =new HashMap();
    }

    public TestEntity settMap(Map tMap) {
        this.tMap = tMap;
        return this;
    }

    public List gettList() {
        return tList;
    }

    public TestEntity settList(List tList) {
        this.tList = tList;
        return this;
    }
}
