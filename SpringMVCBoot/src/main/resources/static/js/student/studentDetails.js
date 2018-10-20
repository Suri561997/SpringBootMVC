var app = angular.module('student', []);

app.controller('studentCtrl', function($scope, $http,$window) {
   $scope.getAllStudentDetails = function(){
	   console.log("inside controller..");
	   $http({
	        method : "GET",
	        url : "getAllstudentDetails"
	    }).then(function mySuccess(response) {
	    	console.log(response.data);
	        $scope.studentsList = response.data
	    }, function myError(response) {
	        $scope.myWelcome = response.statusText;
	    });
   } 
   
   $scope.createStudent = function(){
	   console.log("........................createStudent...........");
	   $http({
	        method : "POST",
	        url : "createStudent"
	    }).then(function mySuccess(response) {
	    	console.log(response.data);
	        $scope.studentsList = response.data
	    }, function myError(response) {
	        $scope.myWelcome = response.statusText;
	    });
   }
   
   $scope.generatePDF = function(){
	   console.log("inside generatePDF controller..");
	   $http({
	        method : "GET",
	        url : "generatePDF",
	        headers: {'content-type': 'application/pdf'}
	    }).then(function mySuccess(response) {
	    	console.log(response.data);
	        //$scope.studentsList = response.data
	    	var file = new Blob([response.data], { type: 'application/pdf' });
	    	var fileurl = URL.createObjectURL(file);
            $window.open(fileurl);
	    }, function myError(response) {
	        $scope.myWelcome = response.statusText;
	    });
   } 
   
});