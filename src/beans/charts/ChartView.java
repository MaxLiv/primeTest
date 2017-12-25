package beans.charts;
import javax.annotation.PostConstruct;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;

import org.primefaces.model.chart.*;

@ManagedBean
public class ChartView implements Serializable {

    private LineChartModel areaModel;
    private BarChartModel barModel;
    private LineChartModel lineModel1;

    @PostConstruct
    public void init() {
        createAreaModel();
        createBarModel();
        createLineModels();
    }

    private void createBarModel() {
        barModel = initBarModel();

        barModel.setTitle("Щільність розподілу ймовірності проектів");
        barModel.setLegendPosition("ne");

        Axis xAxis = barModel.getAxis(AxisType.X);
        xAxis.setLabel("Кількість голосів");

        Axis yAxis = barModel.getAxis(AxisType.Y);
        yAxis.setLabel("Оцінка");
        yAxis.setMin(0);
        yAxis.setMax(10);
    }

    private BarChartModel initBarModel() {
        BarChartModel model = new BarChartModel();

        ChartSeries y2014 = new ChartSeries();
        y2014.setLabel("2014");
        y2014.set("67", 1);
        y2014.set("86", 1);
        y2014.set("106", 1);
        y2014.set("126", 3);
        y2014.set("146", 1);
        y2014.set("166", 7);

        ChartSeries y2015 = new ChartSeries();
        y2015.setLabel("2015");
        y2015.set("66", 1);
        y2015.set("81", 4);
        y2015.set("97", 3);
        y2015.set("113", 0);
        y2015.set("144", 3);

        model.addSeries(y2014);
        model.addSeries(y2015);

        return model;
    }

    private void createLineModels() {
        lineModel1 = initLinearModel();
        lineModel1.setTitle("Прогнозування медичних даних на основі моделі F – перетворення");
        lineModel1.setLegendPosition("e");
        Axis yAxis = lineModel1.getAxis(AxisType.Y);
        Axis xAxis = lineModel1.getAxis(AxisType.X);
        yAxis.setMin(0);
        yAxis.setMax(160);
        xAxis.setMin(0);
        xAxis.setMax(13);
    }

    private LineChartModel initLinearModel() {
        LineChartModel model = new LineChartModel();

        LineChartSeries series1 = new LineChartSeries();
        series1.setLabel("Series 1");

        series1.set(1, 62117/945);
        series1.set(2, 2510/21);
        series1.set(3, 62117/1890);
        series1.set(4, 3344/245);
        series1.set(5, 20064/1715);
        series1.set(6, 3344/49);
        series1.set(7, 95999/945);
        series1.set(8, 163763/1890);
        series1.set(9, 11294/315);
        series1.set(10, 1004/63);
        series1.set(11, 502/63);
        series1.set(12, 3344/1715);

//        LineChartSeries series2 = new LineChartSeries();
//        series2.setLabel("Series 2");
//
//        series2.set(1, 6);
//        series2.set(2, 3);
//        series2.set(3, 2);
//        series2.set(4, 7);
//        series2.set(5, 9);

        model.addSeries(series1);
//        model.addSeries(series2);

        return model;
    }

    public LineChartModel getAreaModel() {
        return areaModel;
    }

    public BarChartModel getBarModel() {
        return barModel;
    }

    public LineChartModel getLineModel1() {
        return lineModel1;
    }

    private void createAreaModel() {
        areaModel = new LineChartModel();

        LineChartSeries boys = new LineChartSeries();
        boys.setFill(true);
        boys.setLabel("Boys");
        boys.set("2004", 120);
        boys.set("2005", 100);
        boys.set("2006", 44);
        boys.set("2007", 150);
        boys.set("2008", 25);

        LineChartSeries girls = new LineChartSeries();
        girls.setFill(true);
        girls.setLabel("Girls");
        girls.set("2004", 52);
        girls.set("2005", 60);
        girls.set("2006", 110);
        girls.set("2007", 90);
        girls.set("2008", 120);

        areaModel.addSeries(boys);
        areaModel.addSeries(girls);

        areaModel.setTitle("Area Chart");
        areaModel.setLegendPosition("ne");
        areaModel.setStacked(true);
        areaModel.setShowPointLabels(true);

        Axis xAxis = new CategoryAxis("Years");
        areaModel.getAxes().put(AxisType.X, xAxis);
        Axis yAxis = areaModel.getAxis(AxisType.Y);
        yAxis.setLabel("Births");
        yAxis.setMin(0);
        yAxis.setMax(300);
    }

}
