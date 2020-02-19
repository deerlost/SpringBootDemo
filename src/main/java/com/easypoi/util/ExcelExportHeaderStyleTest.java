package com.easypoi.util;

import cn.afterturn.easypoi.excel.export.styler.ExcelExportStylerDefaultImpl;
import cn.afterturn.easypoi.excel.export.styler.IExcelExportStyler;
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.ss.usermodel.BorderStyle;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.VerticalAlignment;
import org.apache.poi.ss.usermodel.Workbook;

/**
 * @Description TODO
 * @ClassName：ExcelExportHeaderStyleTest :
 * @Package com.easypoi.util
 * @anthor：wyang
 * @date：2019/1/28
 * @版本：V1.0
 */
public class ExcelExportHeaderStyleTest extends ExcelExportStylerDefaultImpl implements IExcelExportStyler {

    public ExcelExportHeaderStyleTest(Workbook workbook) {
        super(workbook);
    }

    @Override
    public CellStyle getHeaderStyle(short i) {

        CellStyle headerStyle = this.workbook.createCellStyle();

        headerStyle.setAlignment(HorizontalAlignment.CENTER);
        headerStyle.setVerticalAlignment(VerticalAlignment.CENTER);
        headerStyle.setFillForegroundColor(IndexedColors.WHITE.getIndex());
        headerStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);

        Font font = workbook.createFont();
        font.setFontHeightInPoints((short) 20);
        font.setFontName("华文中宋");
        //粗体显示
        font.setBoldweight(HSSFFont.BOLDWEIGHT_BOLD);
       // font.setColor(HSSFColor.WHITE.index);
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
        fontTitle.setFontName("华文中宋");
        fontTitle.setFontHeightInPoints((short) 11);
        cellStyle.setFont(fontTitle);

        return cellStyle;
    }

}
