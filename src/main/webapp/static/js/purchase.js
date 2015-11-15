/**
 * Created by xuyi on 11/15/15.
 */



//var testData = [
//    {
//        "label": "Jan",
//        "value": "420000"
//    },
//    {
//        "label": "Feb",
//        "value": "810000"
//    },
//    {
//        "label": "Mar",
//        "value": "720000"
//    },
//    {
//        "label": "Apr",
//        "value": "550000"
//    },
//    {
//        "label": "May",
//        "value": "910000"
//    },
//    {
//        "label": "Jun",
//        "value": "510000"
//    },
//    {
//        "label": "Jul",
//        "value": "680000"
//    },
//    {
//        "label": "Aug",
//        "value": "620000"
//    },
//    {
//        "label": "Sep",
//        "value": "610000"
//    },
//    {
//        "label": "Oct",
//        "value": "490000"
//    },
//    {
//        "label": "Nov",
//        "value": "900000"
//    },
//    {
//        "label": "Dec",
//        "value": "730000"
//    }
//];

$(document).ready(function(){
    $(".get-div").click(function(){
        $("#myModal").modal('show');
        var path = $(this).attr("id");
        $.ajax({
            type: "GET",
            url: "rest/purchase/"+path,
            headers: {
                'Accept': 'application/json'
            },
            'dataType': 'json',
            success: function (data,status) {
                c_caption = "购买次数统计";
                c_xAxisName = "时间范围";
                c_yAxisName = "购买次数";
                analyzeChartData(data);
                getChartDataRange(indexBegin);
                $("#myModal").modal('hide');
                $(".page-turn").css("display","block");
            }

        });

    });

});