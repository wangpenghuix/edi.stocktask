package org.edi.stocktask.repository;

import com.sun.tools.javac.jvm.Code;
import org.edi.stocktask.bo.codeBar.ICodeBar;
import org.edi.stocktask.bo.stockreport.StockReportItem;

import java.util.List;

/**
 * @author Fancy
 * @date 2018/7/10
 */
public interface IBORepositoryCodeBar {

    /**
     * 解析条码
     * @param codeBar 条码值
     * @param baseType 基于订单类型
     * @param baseEntry 基于订单号
     * @param baseLine 基于订单行号
     * @return 获取解析结果
     */
    public List<ICodeBar> parseCodeBar(String codeBar,String baseType,int baseEntry,int baseLine);

    /**
     * 批量解析条码
     * @param codeBars 条码集合
     * @return
     */
    public List<StockReportItem> parseBatchCodeBar(List<String> codeBars);

}
