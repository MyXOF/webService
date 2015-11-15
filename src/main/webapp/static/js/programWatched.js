/**
 * Created by xuyi on 11/15/15.
 */

$(document).ready(function(){
    $(".get-div").click(function(){
        $("#myModal").modal('show');
        var path = $(this).attr("id");
        $.ajax({
            type: "GET",
            url: "rest/programWatched/"+path,
            headers: {
                'Accept': 'application/json'
            },
            'dataType': 'json',
            success: function (data,status) {
                if(path == "time"){
                    c_caption = "收视时长趋势图";
                    c_xAxisName = "时间范围/天";
                    c_yAxisName = "观看时间/秒";
                }
                else if(path == "channelChange"){
                    c_caption = "平均换台次数";
                    c_xAxisName = "时间范围/天";
                    c_yAxisName = "换台次数";
                }
                analyzeChartData(data);
                getChartDataRange(indexBegin);
                $("#myModal").modal('hide');
                $(".page-turn").css("display","block");
            }

        });

    });


});