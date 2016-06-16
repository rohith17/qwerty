app.controller("myController",function($scope,$http){
	
	var url="http://localhost:8088/DemoProject/ProductServlet";
	
	$http.get(url)
	.success(function(response){
		$scope.categories=response;
	})
	.error(function(msg){
		$scope.categories=msg;
	});
	
	
});


