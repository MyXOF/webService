/**
 * Created by xuyi on 11/16/15.
 */

var currentChartData;
var dataColumMax = 3;
var indexBegin = 0;
var indexCurrent = 0;
var indexEnd;
var c_caption;
var c_xAxisName;
var c_yAxisName;

$(document).ready(function(){
    $("#purchase-before").click(function(){
        getChartDataRange(--indexCurrent);
    });

    $("#purchase-after").click(function(){
        getChartDataRange(++indexCurrent);
    });
});

function analyzeChartData(data){
    currentChartData = data;
    var len = data.length;
    indexBegin = 0;
    indexCurrent = 0;
    indexEnd = Math.floor(len / dataColumMax) - 1;
    if(len % dataColumMax != 0){
        indexEnd++;
    }
}

function getChartDataRange(index){
    if(index < 0){
        indexCurrent = 0;
        return;
    }
    if(index > indexEnd){
        indexCurrent = indexEnd;
        return;
    }

    var dataShow = [];
    for(var i = 0; i < dataColumMax;i++){
        var len = currentChartData.length;
        var indexData = indexCurrent * dataColumMax + i;
        if(indexData < len){
            dataShow.push(currentChartData[indexData]);
        }
        else{
            break;
        }

    }
    showChart(dataShow);

}

function showChart(charData){
    FusionCharts.ready(function(){
        var revenueChart = new FusionCharts({
            "type": "column2d",
            "renderAt": "chartContainer",
            "width": $("#columContainer").width() * 0.95,
            "height": 500,
            "dataFormat": "json",
            "dataSource": {
                "chart": {
                    "caption": c_caption,
                    "subCaption": "数据来源:云数据管理(1)",
                    "xAxisName": c_xAxisName,
                    "yAxisName": c_yAxisName,
                    "theme": "fint"
                },
                "data":charData

            }
        });
        revenueChart.render();
    })
}
