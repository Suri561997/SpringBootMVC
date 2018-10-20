var app = angular.module("login", []);

/*app.config(function($routeProvider) {
    $routeProvider
    .when("/", {
        templateUrl : "",
        controller : "loginCtrl"
    })
    .when("/showSuccessPage", {
    	templateUrl : "showSuccessPage"
    })
    .otherwise({
    	templateUrl : '/'
    });
});*/

app.controller("loginCtrl", function($scope,$http,$window,$location) {
	
    $scope.validateCredentials = function(){
    	   // alert($scope.userName);
    	    //alert($scope.password);
    	    
    	    $http({
    	        method : "GET",
    	        url : "validateCredentials",
    	        params : {
    	        	"userName" : $scope.userName,
    	        	"password" : $scope.password
    	        }
    	    }).then(function mySuccess(response) {
    	    	console.log(response);
    	    	console.log(response.data);
    	    	console.log(response.status);
    	    	console.log(response.message);
    	    	if(response.status === 200){
    	    		//$location.path('views/loginSuccess.jsp');
    	    		//$window.location.href = 'views/loginSuccess.jsp';
    	    		$window.location.href = 'showSuccessPage';
    	    		console.log("success");
    	    	}
    	        //$scope.myWelcome = response.data;
    	    }, function myError(response) {
    	    	console.log(response);
    	    	console.log(response.data);
    	    	console.log(response.status);
    	    	if(response.status != 200){
    	    		//$location.path('views/loginSuccess.jsp');
    	    		//$window.location.href = 'views/loginSuccess.jsp';
    	    		//$window.location.href = '/';
    	    		$location.path('/');
    	    		console.log("success");
    	    	}
    	    });
    };
});