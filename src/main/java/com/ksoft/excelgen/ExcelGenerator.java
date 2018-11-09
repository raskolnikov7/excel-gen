package com.ksoft;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.xssf.streaming.SXSSFWorkbook;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ExcelGenerator<T> {

    private SXSSFWorkbook workbook;
    private Sheet sheet;

    public SXSSFWorkbook getWorkbook(List<T> objects){
        Field [] allFields = objects.get(0).getClass().getDeclaredFields();
        List<String> fieldNames = Arrays.stream(allFields)
                .filter(f -> !f.isSynthetic())
                .map(f -> f.getName())
                .collect(Collectors.toList());
        return getWorkbook(fieldNames,objects);
    }



    private List<String> getHeaderNames(T obj){

        return null;
    }

    public SXSSFWorkbook getWorkbook( List<String> columns, List<T> objects){

        return null;
    }

}
