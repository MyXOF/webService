<html>
<head>
	<meta charset="UTF-8">
	<script src='lib/js/jquery-1.8.0.min.js' type='text/javascript'></script>
</head>
<body>
<h2>Hello World!</h2>
<h2>Doge</h2>
<button id="button1">button-get</button>
<button id="button2">button-post</button>
<script type="text/javascript">
	$(document).ready(function(){
		$("#button1").click(function(){
			$.get("rest/example/daemon/status",function(data,status){
				 alert("Data: " + data.sucess + "\nStatus: " + status);
				});
		});
		$("#button2").click(function(){
			$.ajax({
	            type: "POST",
	            url: "rest/example/list",
	           	headers: { 
        		'Accept': 'application/json',
        		'Content-Type': 'application/json' 
    			},
    			'data': JSON.stringify({ "bar": "John", "foo": "2pm" }),
    			'dataType': 'json',
	            success: function (data,status) {
	                alert(data,status);
	            }
	        });
		});

	});
</script>
</body>
</html>
