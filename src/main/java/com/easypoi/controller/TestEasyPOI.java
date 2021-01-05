package com.easypoi.controller;


import cn.afterturn.easypoi.entity.ImageEntity;
import cn.afterturn.easypoi.entity.vo.MapExcelConstants;
import cn.afterturn.easypoi.excel.ExcelExportUtil;
import cn.afterturn.easypoi.excel.entity.ExportParams;
import cn.afterturn.easypoi.excel.entity.TemplateExportParams;
import cn.afterturn.easypoi.excel.entity.enmus.ExcelType;
import cn.afterturn.easypoi.excel.entity.params.ExcelExportEntity;
import cn.afterturn.easypoi.pdf.PdfExportUtil;
import cn.afterturn.easypoi.pdf.entity.PdfExportParams;
import com.alibaba.fastjson.JSONObject;
import com.easypoi.entity.CourseEntity;
import com.easypoi.entity.HoDicLoadingRoutePartner;
import com.easypoi.entity.HoDicLoadingRouteVo;
import com.easypoi.entity.StudentEntity;
import com.easypoi.entity.TeacherEntity;
import com.easypoi.util.ExcelExportHeaderStyleTest;
import com.easypoi.util.ExeclUtil;
import com.itextpdf.text.Document;
import com.makotojava.learn.springboot.util.StreamUtilExample;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Workbook;
import org.junit.Before;
import org.junit.Test;
import org.springframework.ui.ModelMap;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;


/**
 * @Description TODO
 * @ClassName：TestEasyPOI :
 * @Package com.easypoi.controller
 * @anthor：wyang
 * @date：2019/1/23
 * @版本：V1.0
 */

public class TestEasyPOI {

    public static void main(String[] args) {
        try {
         /*   Scanner sc = new Scanner(System.in);

            while(sc.hasNext()){
                int n  =  sc.nextInt();
                String[] sArray = new String[n];
                for(int i = 0; i < n;i++){
                    String str = sc.nextLine();
                    int m = str.length();
                    if(m%8 !=0){
                        for(int j=0;j<8-m%8;j++){
                            str+=0;
                        }
                    }
                    sArray[i]=str;

                }
                for(int k = 0;k<n;k++){
                    for(int j=0;j<sArray[k].length();j+=8){
                        System.out.println(sArray[k].substring(j,j+8));
                    }
                }

            }*/
              testHo();
            //testExportExcel_1();
            //testExportPDF_1();

            //fe_map();
            // one();
            // test();
            // String str = download();
//           testSplitCollection();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public static void testHo() {
        ExportParams params = new ExportParams("好莱客运输路线维护", "1");
        params.setFixedTitle(false);
        params.setStyle(ExcelExportHeaderStyleTest.class);

        params.setHeaderHeight((short) 10);
        params.setHeaderColor(IndexedColors.GREY_25_PERCENT.getIndex());
        params.setTitleHeight((short) 15);
        params.setSecondTitleHeight((short) 10);

        HoDicLoadingRouteVo vo = JSONObject.parseObject("{\"createTime\":1577171466869,\"createUserId\":579,\"deliveryMethod\":\"配送\",\"ftyCode\":\"3210\",\"ftyName\":\"好莱客惠州工厂\",\"hoDicLoadingRoutePartnerList\":[{\"createTime\":1577266279615,\"createUserId\":583,\"hoLoadingRoutePartnerExt0\":\"\",\"hoLoadingRoutePartnerExt1\":\"\",\"hoLoadingRoutePartnerExt2\":\"\",\"isDelete\":0,\"isFixedSequences\":0,\"loadingRouteCode\":\"A2\",\"loadingRouteId\":8286,\"loadingSequence\":1,\"modifyTime\":1577266279615,\"modifyUserId\":583,\"partnerCode\":\"13200001\",\"partnerName\":\"13200001\"},{\"createTime\":1577266279617,\"createUserId\":583,\"hoLoadingRoutePartnerExt0\":\"\",\"hoLoadingRoutePartnerExt1\":\"\",\"hoLoadingRoutePartnerExt2\":\"\",\"isDelete\":0,\"isFixedSequences\":0,\"loadingRouteCode\":\"A2\",\"loadingRouteId\":8287,\"loadingSequence\":2,\"modifyTime\":1577266279617,\"modifyUserId\":583,\"partnerCode\":\"12903100\",\"partnerName\":\"12903100\"},{\"createTime\":1577266279618,\"createUserId\":583,\"hoLoadingRoutePartnerExt0\":\"\",\"hoLoadingRoutePartnerExt1\":\"\",\"hoLoadingRoutePartnerExt2\":\"\",\"isDelete\":0,\"isFixedSequences\":0,\"loadingRouteCode\":\"A2\",\"loadingRouteId\":8288,\"loadingSequence\":3,\"modifyTime\":1577266279618,\"modifyUserId\":583,\"partnerCode\":\"12002201\",\"partnerName\":\"12002201\"},{\"createTime\":1577266279620,\"createUserId\":583,\"hoLoadingRoutePartnerExt0\":\"\",\"hoLoadingRoutePartnerExt1\":\"\",\"hoLoadingRoutePartnerExt2\":\"\",\"isDelete\":0,\"isFixedSequences\":0,\"loadingRouteCode\":\"A2\",\"loadingRouteId\":8289,\"loadingSequence\":4,\"modifyTime\":1577266279620,\"modifyUserId\":583,\"partnerCode\":\"11102103\",\"partnerName\":\"11102103\"}],\"hoLoadingRouteExt0\":\"\",\"hoLoadingRouteExt1\":\"\",\"hoLoadingRouteExt2\":\"\",\"isDelete\":0,\"loadingGroupCode\":\"\",\"loadingGroupName\":\"\",\"loadingRouteCode\":\"A2\",\"loadingRouteName\":\"测试指令顺序出库\",\"modifyTime\":1577266279602,\"modifyUserId\":583}\n", HoDicLoadingRouteVo.class);
        List<HoDicLoadingRouteVo> headList = new ArrayList<HoDicLoadingRouteVo>(Arrays.asList(vo));
        List<HoDicLoadingRoutePartner> itemList = vo.getHoDicLoadingRoutePartnerList();

        Workbook workbook = ExcelExportUtil.exportExcel(params, HoDicLoadingRouteVo.class, headList);


        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(ResourceUtils.getURL("classpath:").getPath()+"/测试.xls");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            workbook.write(fos);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Before
    public void initData() {

    }

    @Test
    public void testArray() {
        CourseEntity course = new CourseEntity("1", "西天取经小班", "D:\\sourceFile\\argentina.jpg");


    }

    public static void testSplitCollection() {
        StreamUtilExample streamUtilExample = new StreamUtilExample();

        List<String> list = streamUtilExample.getStringList();

        List<? extends List<?>> subSets = ExeclUtil.splitCollection(list, 2);


        for (List<?> item : subSets) {
            item.forEach(System.out::println);
            System.out.println("=========");
        }

    }

    //System.out.println("第一种结束");
       /* Iterable<List<String>> subList = Iterables.partition(intList, 2);
        Iterator<List<String>> iterator = subList.iterator();

        //Iterator<? extends List<?>> iterable = ExeclUtil.splitCollection(list, 2);

        if (iterator.hasNext()) {
            List<String> item = iterator.next();
            item.forEach(System.out::println);


        }
*/

    public static void testExportPDF_1() throws Exception {
        //   ExportParams params = new ExportParams("0328课程表", "日期：2016-03-28", "六年一班");
        // params.setHeight((short) 100);
        // params.setTitleHeight((short) 50);
        PdfExportParams params = new PdfExportParams("0328课程表", null);
       /* params.setStyle(ExcelExportHeaderStyleTest.class);

        params.setHeaderHeight((short) 20);
        params.setHeaderColor(IndexedColors.GREY_25_PERCENT.getIndex());*/
        params.setTitleHeight((short) 30);
        params.setSecondTitleHeight((short) 15);

        CourseEntity course = new CourseEntity("1", "西天取金小班", "D:\\sourceFile\\argentina.jpg");
        TeacherEntity teacher = new TeacherEntity("唐僧");
        StudentEntity student = new StudentEntity("孙悟空", 1, new SimpleDateFormat("yyyy-MM-dd").parse("1995-06-01"), new SimpleDateFormat("yyyy-MM-dd").parse("2014-06-01"));
        StudentEntity student1 = new StudentEntity("猪九戒", 1, new SimpleDateFormat("yyyy-MM-dd").parse("1995-06-01"), new SimpleDateFormat("yyyy-MM-dd").parse("2014-06-01"));
        course.setMathTeacher(teacher);
        course.setStudents(Arrays.asList(student, student1));

        List<CourseEntity> courseEntityList = new ArrayList<>();
        courseEntityList.add(course);


        File file = new File("D:/excel/test.pdf");
        file.createNewFile();
        Document document = PdfExportUtil.exportPdf(params, CourseEntity.class, courseEntityList, new FileOutputStream(file));

    }


    public static void testExportExcel_1() throws Exception {

        /**
         * ExportParams 导出Excel的类
         */
        ExportParams params = new ExportParams("0328课程表", "日期：2016-03-28", "六年一班");
        params.setFixedTitle(false);
        //  ExportParams params = new ExportParams("0328课程表", "日期：2016-03-28", "六年一班");
        //  params.setHeight((short) 100);
        // params.setTitleHeight((short) 50);

        params.setStyle(ExcelExportHeaderStyleTest.class);

        params.setHeaderHeight((short) 10);
        params.setHeaderColor(IndexedColors.GREY_25_PERCENT.getIndex());
        params.setTitleHeight((short) 15);
        params.setSecondTitleHeight((short) 10);


        CourseEntity course = new CourseEntity("1", "西天取金小班", "D:\\sourceFile\\argentina.jpg");
        TeacherEntity teacher = new TeacherEntity("唐僧", 30);
        StudentEntity student = new StudentEntity("孙悟空", 1, new SimpleDateFormat("yyyy-MM-dd").parse("1995-06-01"), new SimpleDateFormat("yyyy-MM-dd").parse("2014-06-01"));
        StudentEntity student1 = new StudentEntity("猪九戒", 1, new SimpleDateFormat("yyyy-MM-dd").parse("1995-06-01"), new SimpleDateFormat("yyyy-MM-dd").parse("2014-06-01"));
        course.setMathTeacher(teacher);
        course.setStudents(Arrays.asList(student, student1));

        List<CourseEntity> courseEntityList = new ArrayList<>();
        courseEntityList.add(course);

        Workbook workbook = ExcelExportUtil.exportExcel(params, CourseEntity.class, courseEntityList);


        /*List<ExcelExportEntity> entity = new ArrayList<ExcelExportEntity>();
        entity.add(new ExcelExportEntity("姓名", "name"));
        entity.add(new ExcelExportEntity("性别", "sex"));

        List<Map<String, String>> list = new ArrayList<Map<String, String>>();
        Map<String, String> map;
        for (int i = 0; i < 10; i++) {
            map = new HashMap<String, String>();
            map.put("name", "1" + i);
            map.put("sex", "2" + i);
            list.add(map);
        }

        Workbook wb = ExcelExportUtil.exportExcel(new ExportParams(
                "测试", "测试"), entity, list);*/

        // FileOutputStream fos = new FileOutputStream("D:/targetFile/" + System.currentTimeMillis() + ".xls");
        FileOutputStream fos = new FileOutputStream("D:/targetFile/课程表2.xls");
        workbook.write(fos);
        fos.close();

    }


    public static void test() throws Exception {
        TemplateExportParams param = new TemplateExportParams("D:/sourceFile/test.xls");

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("inputdate", "2010-01-02");
        map.put("department", "财政局");
        map.put("batch", "146546741321");
        map.put("suppliers", "电子芯片中的用户区内容：物料编码、批次号、物料名称、入库日期、供应商");
        ImageEntity image = new ImageEntity();
        image.setHeight(200);
        image.setWidth(500);
        image.setUrl("D:/sourceFile/argentina.jpg");
        // map.put("image", image);

        Workbook workbook = ExcelExportUtil.exportExcel(param, map);

        workbook = ExeclUtil.addImage(workbook, "D:/sourceFile/argentina.jpg");
        File savefile = new File("D:/targetFile/");
        if (!savefile.exists()) {
            savefile.mkdirs();
        }


        FileOutputStream fos = new FileOutputStream("D:/targetFile/1.xls");
        workbook.write(fos);
        fos.close();
    }

    public static void fe_map() throws Exception {
        TemplateExportParams params = new TemplateExportParams("D:/sourceFile/专项支出用款申请书_map.xls");
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("date", "2014-12-25");
        map.put("money", 2000000.00);
        map.put("upperMoney", "贰佰万");
        map.put("company", "执笔潜行科技有限公司");
        map.put("bureau", "财政局");
        map.put("person", "JueYue");
        map.put("phone", "1879740****");
        ImageEntity image = new ImageEntity();
        image.setHeight(200);
        image.setWidth(500);
        image.setUrl("D:/sourceFile/argentina.jpg");
        map.put("image", image);
        List<Map<String, Object>> listMap = new ArrayList<Map<String, Object>>();
        for (int i = 0; i < 4; i++) {
            Map<String, Object> lm = new HashMap<String, Object>();
            lm.put("id", i + 1 + "");
            lm.put("zijin", i * 10000 + "");
            lm.put("bianma", "A001");
            lm.put("mingcheng", "设计");
            lm.put("xiangmumingcheng", "EasyPoi " + i + "期");
            lm.put("quancheng", "开源项目");
            lm.put("sqje", i * 10000 + "");
            lm.put("hdje", i * 10000 + "");
            listMap.add(lm);
        }
        map.put("maplist", listMap);

        Workbook workbook = ExcelExportUtil.exportExcel(params, map);
        File savefile = new File("D:/targetFile/");
        if (!savefile.exists()) {
            savefile.mkdirs();
        }
        FileOutputStream fos = new FileOutputStream("D:/targetFile/专项支出用款申请书_map.xls");
        workbook.write(fos);
        fos.close();
    }

    public static void one() throws Exception {
        TemplateExportParams params = new TemplateExportParams("D:/sourceFile/exportTemp_image.xlsx", true);
        Map<String, Object> map = new HashMap<String, Object>();
        // sheet 2
        map.put("month", 10);
        Map<String, Object> temp;
        for (int i = 1; i < 8; i++) {
            temp = new HashMap<String, Object>();
            temp.put("per", i * 10);
            temp.put("mon", i * 1000);
            temp.put("summon", i * 10000);
            ImageEntity image = new ImageEntity();
            image.setHeight(200);
            image.setWidth(500);
            image.setUrl("D:/sourceFile/argentina.jpg");
            temp.put("image", image);
            map.put("i" + i, temp);
        }
        Workbook book = ExcelExportUtil.exportExcel(params, map);
        File savefile = new File("D:/targetFile/");
        if (!savefile.exists()) {
            savefile.mkdirs();
        }
        FileOutputStream fos = new FileOutputStream("D:/targetFile/exportTemp_image.xlsx");
        book.write(fos);
        fos.close();

    }

    public static String download() {
        ModelMap modelMap = new ModelMap();
        List<ExcelExportEntity> entity = new ArrayList<ExcelExportEntity>();
        ExcelExportEntity excelentity = new ExcelExportEntity("姓名", "name");
        excelentity.setNeedMerge(true);
        entity.add(excelentity);
        entity.add(new ExcelExportEntity("性别", "sex"));
        excelentity = new ExcelExportEntity(null, "students");
        List<ExcelExportEntity> temp = new ArrayList<ExcelExportEntity>();
        temp.add(new ExcelExportEntity("姓名", "name"));
        temp.add(new ExcelExportEntity("性别", "sex"));
        excelentity.setList(temp);
        entity.add(excelentity);

        List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
        Map<String, Object> map;
        for (int i = 0; i < 10; i++) {
            map = new HashMap<String, Object>();
            map.put("name", "1" + i);
            map.put("sex", "2" + i);

            List<Map<String, Object>> tempList = new ArrayList<Map<String, Object>>();
            tempList.add(map);
            tempList.add(map);
            map.put("students", tempList);

            list.add(map);
        }

        ExportParams params = new ExportParams("2412312", "测试", ExcelType.XSSF);
        params.setFreezeCol(2);
        modelMap.put(MapExcelConstants.MAP_LIST, list);
        modelMap.put(MapExcelConstants.ENTITY_LIST, entity);
        modelMap.put(MapExcelConstants.PARAMS, params);
        modelMap.put(MapExcelConstants.FILE_NAME, "EasypoiMapExcelViewTest");
        return MapExcelConstants.EASYPOI_MAP_EXCEL_VIEW;

    }

}
