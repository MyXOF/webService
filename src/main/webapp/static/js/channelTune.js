/**
 * Created by xuyi on 11/15/15.
 */

$(document).ready(function(){
    $(".get-div").click(function(){
        $("#myModal").modal('show');
        var path = $(this).attr("id");
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
                $("#myModal").modal('hide');
                $(".page-turn").css("display","block");
            }

        });

    });
});
