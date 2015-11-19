/**
 * Created by xuyi on 11/15/15.
 */

$(document).ready(function(){
    $(".get-div").click(function(){
        $("#myModal").modal('show');
        var path = $(this).attr("id");
        if(path == "deviceOnline"){
            $("#pie-for-top").css("display","none");
        }
        $.ajax({
            type: "GET",
            url: "rest/channelTune/"+path,
            headers: {
                'Accept': 'application/json'
            },
            'dataType': 'json',
            success: function (data,status) {
                if(path == "deviceOnline"){
                    c_caption = "设备在线数量趋势图";
                    c_xAxisName = "时间范围/天";
                    c_yAxisName = "在线数量";
                }
                else if(path == "channelWatched"){
                    c_caption = "收视频道Top";
                    c_xAxisName = "频道编号";
                    c_yAxisName = "观看次数";
                }
                analyzeChartData(data);
                getChartDataRange(indexBegin);
                if(path == "channelWatched"){
                    $("#pie-for-top").css("display","block");
                    showPieChart(data);
                }
                $("#myModal").modal('hide');
                $(".page-turn").css("display","block");
            }

        });

    });

});

function showPieChart(charData){
    var maxPiePart = 17;
    var restValue = Number(0);
    var count = 0;
    var pieData = [];
    console.log(charData);
    for(data in charData) {
        console.log(data);
        if (count < maxPiePart) {
            pieData.push(charData[data]);
        }
        else {
            restValue += Number(charData[data]["value"]);
        }
        count++;
    }

    console.log(restValue);
    if(count >= maxPiePart){
        var restData = {};
        restData["lable"] = "其他";
        restData["value"] = restValue;
        pieData.push(restData);
    }

    FusionCharts.ready(function(){
        var revenueChart = new FusionCharts({
            "type": "pie3d",
            "renderAt": "pieContainer",
            "width": $("#pieContainer").width() * 0.95,
            "height": 500,
            "dataFormat": "json",
            "dataSource": {
                "chart": {
                    "caption": "收视频道Top",
                    "subCaption": "数据来源:云数据管理(1)",
                    "paletteColors": "#0075c2,#1aaf5d,#f2c500,#f45b00,#8e0000,#999999",
                    "bgColor": "#ffffff",
                    "showBorder": "0",
                    "use3DLighting": "0",
                    "showShadow": "0",
                    "enableSmartLabels": "0",
                    "startingAngle": "0",
                    "showPercentValues": "1",
                    "showPercentInTooltip": "0",
                    "decimals": "1",
                    "captionFontSize": "14",
                    "subcaptionFontSize": "14",
                    "subcaptionFontBold": "0",
                    "toolTipColor": "#ffffff",
                    "toolTipBorderThickness": "0",
                    "toolTipBgColor": "#000000",
                    "toolTipBgAlpha": "80",
                    "toolTipBorderRadius": "2",
                    "toolTipPadding": "5",
                    "showHoverEffect":"1",
                    "showLegend": "1",
                    "legendBgColor": "#ffffff",
                    "legendBorderAlpha": '0',
                    "legendShadow": '0',
                    "legendItemFontSize": '10',
                    "legendItemFontColor": '#666666',
                    "theme": "fint"
                },
                "data":pieData

            }
        });
        revenueChart.render();
    })
}