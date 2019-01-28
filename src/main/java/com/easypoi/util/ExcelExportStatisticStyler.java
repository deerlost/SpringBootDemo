package com.easypoi.util;


import cn.afterturn.easypoi.excel.entity.params.ExcelExportEntity;
import cn.afterturn.easypoi.excel.export.styler.ExcelExportStylerDefaultImpl;
import org.apache.poi.ss.usermodel.*;

/**
 * @Description TODO
 * @ClassName：ExcelExportStatisticStyler :
 * @Package com.easypoi.util
 * @anthor：wyang
 * @date：2019/1/28
 * @版本：V1.0
 */
public class ExcelExportStatisticStyler extends ExcelExportStylerDefaultImpl {
    private CellStyle numberCellStyle;

    public ExcelExportStatisticStyler(Workbook workbook) {
        super(workbook);
        createNumberCellStyler();
    }
    @Override
    public CellStyle getHeaderStyle(short color) {

        CellStyle headerStyle = this.workbook.createCellStyle();

        headerStyle.setAlignment(HorizontalAlignment.CENTER);
        headerStyle.setVerticalAlignment(VerticalAlignment.CENTER);
        //   headerStyle.setWrapText(true);//自动换行
        headerStyle.setFillForegroundColor(IndexedColors.WHITE.getIndex());
        headerStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);

        Font font = workbook.createFont();
        //font.setColor(HSSFColor.BLACK.index);
        //font.setBoldweight(HSSFFont.BOLDWEIGHT_BOLD);
        font.setFontHeightInPoints((short) 20);
        font.setFontName("华文中宋");
        //font.setBoldweight(HSSFFont.BOLDWEIGHT_BOLD);//粗体显示
        //font.setColor(HSSFColor.WHITE.index);
        headerStyle.setFont(font);

        return headerStyle;
    }

    private void createNumberCellStyler() {
        numberCellStyle = workbook.createCellStyle();
        numberCellStyle.setAlignment(HorizontalAlignment.CENTER);
        numberCellStyle.setVerticalAlignment(VerticalAlignment.CENTER);
        numberCellStyle.setDataFormat((short) BuiltinFormats.getBuiltinFormat("0.00"));
        numberCellStyle.setWrapText(true);
    }

    @Override
    public CellStyle getStyles(boolean noneStyler, ExcelExportEntity entity) {
        if (entity != null
                && (entity.getName().contains("int") || entity.getName().contains("double"))) {
            return numberCellStyle;
        }
        return super.getStyles(noneStyler, entity);
    }
}
