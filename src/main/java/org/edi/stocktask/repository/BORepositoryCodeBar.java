package org.edi.stocktask.repository;

import org.edi.freamwork.exception.BusinessException;
import org.edi.initialfantasy.data.ResultDescription;
import org.edi.stocktask.bo.codeBar.ICodeBar;
import org.edi.stocktask.data.StockOpResultCode;
import org.edi.stocktask.mapper.CodeBarMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;

/**
 * @author Fancy
 * @date 2018/7/10
 */
@Component(value="boRepositoryCodeBar")
public class BORepositoryCodeBar implements IBORepositoryCodeBar{

    @Autowired
    private CodeBarMapper codeBarMapper;

    /**
     * 条码解析
     * @param codebar
     * @return
     */
    @Override
    public List<ICodeBar> parseCodeBar(String codebar) {
        if(codebar==null||codebar.isEmpty()){
            throw new BusinessException(StockOpResultCode.STOCK_CODEBAR_IS_NULL,ResultDescription.CODEBAR_IS_NULL);
        }
        List<ICodeBar> listCodeBar;
        HashMap<String,String> codeBar = new HashMap();
        codeBar.put("codebar",codebar);
        codeBarMapper.parseCodeBar(codeBar);
        listCodeBar = codeBarMapper.parseCodeBar(codeBar);
        return listCodeBar;
    }
}
