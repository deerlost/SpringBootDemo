package com.easypoi.controller;


import cn.afterturn.easypoi.excel.ExcelImportUtil;
import cn.afterturn.easypoi.excel.entity.ImportParams;
import com.easypoi.entity.CourseEntity;
import com.easypoi.entity.DemandEntity;
import com.easypoi.entity.HoDicLoadingRoute;
import com.easypoi.entity.HoDicLoadingRoutePartner;
import com.easypoi.entity.HoDicLoadingRouteVo;
import com.easypoi.entity.MsgClient;
import com.easypoi.util.ExeclUtil;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.util.Date;
import java.util.List;

/**
 * @Description TODO
 * @ClassName：TestEasyPOIImport :
 * @Package com.easypoi.controller
 * @anthor：wyang
 * @date：2019/3/18
 * @版本：V1.0
 */
public class TestEasyPOIImport {

    @Test
    public void test2() {
        ImportParams params = new ImportParams();
        params.setTitleRows(1);
        params.setHeadRows(1);
        long start = System.currentTimeMillis();
        List<MsgClient> list = ExcelImportUtil.importExcel(new File("D:\\sourceFile\\ExcelExportMsgClient.xlsx"), MsgClient.class, params);
        System.out.println(System.currentTimeMillis() - start);
        System.out.println(list.size());
        System.out.println(ReflectionToStringBuilder.toString(list.get(0)));


    }

    @Test
    public void test() {
        long start = System.currentTimeMillis();

        /*ImportParams params = new ImportParams();
        params.setTitleRows(1);
        params.setHeadRows(2);

        List<CourseEntity> list = ExcelImportUtil.importExcel(new File("D:/targetFile/课程表.xls"),
                CourseEntity.class, params);*/

        ImportParams params = new ImportParams();
        params.setTitleRows(1);
        params.setHeadRows(2);
        List<HoDicLoadingRouteVo> list = ExcelImportUtil.importExcel(new File("D:/targetFile/测试装车.xls"), HoDicLoadingRouteVo.class, params);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(ReflectionToStringBuilder.toString(list.get(i)));
        }
        System.out.println(System.currentTimeMillis() - start);
        System.out.println(list.size());
        //  System.out.println(ReflectionToStringBuilder.toString(list.get(0)));
    }

    @Test
    public void testUtil() {

        long start = System.currentTimeMillis();
        List<DemandEntity> list = ExeclUtil.importExcel("D:\\excel\\ExcelExportOneToManyHaseNameTest.demandEntityTest.xlsx", 1, 1, DemandEntity.class);

        for (DemandEntity item : list) {
            System.out.println(ReflectionToStringBuilder.toString(item));
        }
        System.out.println(System.currentTimeMillis() - start);
        System.out.println(list.size());
        System.out.println(ReflectionToStringBuilder.toString(list.get(0)));

    }
}