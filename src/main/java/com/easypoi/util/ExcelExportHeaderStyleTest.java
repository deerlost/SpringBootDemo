package com.easypoi.util;

import cn.afterturn.easypoi.excel.export.styler.AbstractExcelExportStyler;
import cn.afterturn.easypoi.excel.export.styler.IExcelExportStyler;
import org.apache.poi.ss.usermodel.*;

/**
 * @Description TODO
 * @ClassName：ExcelExportHeaderStyleTest :
 * @Package com.easypoi.util
 * @anthor：wyang
 * @date：2019/1/28
 * @版本：V1.0
 */
public class ExcelExportHeaderStyleTest extends AbstractExcelExportStyler implements IExcelExportStyler {
    public ExcelExportHeaderStyleTest(Workbook workbook) {
        super.createStyles(workbook);
    }

    @Override
    public CellStyle getHeaderStyle(short i) {

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

    @Override
    public CellStyle getTitleStyle(short i) {
        CellStyle cellStyle = this.workbook.createCellStyle();
        cellStyle.setFillForegroundColor(IndexedColors.GREY_25_PERCENT.index);
        cellStyle.setAlignment(HorizontalAlignment.CENTER);
        cellStyle.setVerticalAlignment(VerticalAlignment.CENTER);
        cellStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);

        //边框
        cellStyle.setBorderTop(BorderStyle.THIN);
        cellStyle.setBorderBottom(BorderStyle.THIN);
        cellStyle.setBorderLeft(BorderStyle.THIN);
        cellStyle.setBorderRight(BorderStyle.THIN);

        Font fontTitle = this.workbook.createFont();
        //font.setColor(HSSFColor.BLACK.index);
        fontTitle.setFontName("华文中宋");
        fontTitle.setFontHeightInPoints((short) 11);
        //font.setBoldweight(HSSFFont.BOLDWEIGHT_BOLD);
        // 把字体应用到当前的样式
        cellStyle.setFont(fontTitle);

        return cellStyle;
    }
}
