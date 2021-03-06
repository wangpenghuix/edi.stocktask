package repository;

import junit.framework.Assert;
import junit.framework.TestCase;
import org.edi.stocktask.bo.stockreport.StockReport;
import org.edi.stocktask.bo.stocktask.IStockTask;
import org.edi.stocktask.repository.BORepositoryCodeBar;
import org.edi.stocktask.repository.IBORepositoryStockReport;
import org.edi.stocktask.repository.IBORepositoryStockTask;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @author Fancy
 * @date 2018/7/30
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-mybatis.xml")
public class TestBoRepositoryStockReport extends TestCase{


    @Autowired
    private IBORepositoryStockTask boRepositoryStockTask;

    @Autowired
    private IBORepositoryStockReport boRepositoryStockReport;


    @Autowired
    private BORepositoryCodeBar boRepositoryCodeBar;

    HashMap<String,Object> paramMap = new HashMap<>();

    private Integer B1DocEntry = 1;


    private IStockTask stockTask;
    private StockReport stockReport;
    private List<StockReport> stockReports = new ArrayList<>();

    private StockReport getStockReport() throws Exception {
        HashMap<String,Object> paramMap = new HashMap<>();
        List<IStockTask> stockTasks = boRepositoryStockTask.fetchStockTask(paramMap);
        if (stockTasks.size() > 0) {
            if (stockTasks != null) {
                stockTask = stockTasks.get(0);
            }
            if (stockReport == null) {
                stockReport = StockReport.createStockReport(stockTask);
            }
        }
        return stockReport;
    }



    /**
     * 库存任务
     * @return
     * */

    @Test
    public void testfetchStockTask() throws Exception{
        HashMap<String,Object> paramMap = new HashMap<>();
        List<IStockTask> stockTasks = boRepositoryStockTask.fetchStockTask(paramMap);
        if(stockTasks.size() > 0){
            if(stockTask == null){
                stockTask = stockTasks.get(0);
            }
        }
        Assert.assertEquals(stockTask.getObjectCode(),getStockReport().getObjectCode());
    }





    @Test
    public void testFetchStockTaskByCondition() throws Exception{
       List<IStockTask>  stockTaskList = boRepositoryStockTask.fetchStockTaskByCondition(155,"202");
       assertEquals(stockTaskList.get(0).getObjectKey().toString(),"155");

    }




    @Test
    public void testSaveStockReport() {
        HashMap<String,Object> paramMap = new HashMap<>();
        List<IStockTask> stockTasks = boRepositoryStockTask.fetchStockTask(paramMap);
        if (stockTasks.size() > 0) {
            if (stockTasks != null) {
                stockTask = stockTasks.get(5);
            }
            if (stockReport == null) {
                stockReport = StockReport.createStockReport(stockTask);
            }
            boRepositoryStockReport.saveStockReport("",stockReport);
            Assert.assertEquals(stockReport.getBaseDocumentType(), stockTask.getDocumentType());
            Assert.assertEquals(stockReport.getBaseDocumentEntry(), stockTask.getDocumentEntry());

        }

    }

    @Test
    public void testDeleteStockReport(){
        boRepositoryStockReport.deleteStockReport(5);
        StockReport stockReport = boRepositoryStockReport.fetchStockReport(5);
        assertEquals(stockReport,null);
    }



    @Test
    public void testFetchUnSyncStockReport(){
        List<StockReport> stockReportList = boRepositoryStockReport.fetchUnSyncStockReport();
        if(stockReportList.size() > 0){
            if(stockReport == null){
                stockReport = stockReportList.get(0);
            }
        }
        assertEquals(stockReport.getB1DocEntry().toString(),"0");
    }



    @Test
    public void testFetchStockReportByCondition(){
        List<StockReport> stockReportList = boRepositoryStockReport.fetchStockReportByCondition("大连威海公司","","");
        if(stockReportList.size() > 0){
            if(stockReport == null){
                stockReport = stockReportList.get(0);
            }
        }
        assertEquals(stockReport.getBydUUID(),"3697459");

      }

    @Test
    public void testFetchStockReportByEntry() throws Exception {
        StockReport stockReport = boRepositoryStockReport.fetchStockReport(getStockReport().getDocEntry());
        //StockReport stockReport = boRepositoryStockReport.fetchStockReportByEntry()
        Assert.assertEquals(getStockReport().getDocEntry(),stockReport.getDocEntry());
        Assert.assertEquals(getStockReport(),stockReport);


    }


    @Test
    public void testUpdateDocStatus() throws Exception{
        //boRepositoryStockReport.updateStockReportDocStatus(B1DocEntry, getStockReport().getDocEntry());
        StockReport stockReport  = getStockReport();
        stockReport.setB1DocEntry(B1DocEntry);
        stockReport.setDocumentStatus("C");
        boRepositoryStockReport.updateStockReportDocStatus(stockReport);
        stockReport = boRepositoryStockReport.fetchStockReport(this.stockReport.getDocEntry());
        Assert.assertEquals("C",stockReport.getDocumentStatus());
        Assert.assertEquals(B1DocEntry,stockReport.getB1DocEntry());
    }


}