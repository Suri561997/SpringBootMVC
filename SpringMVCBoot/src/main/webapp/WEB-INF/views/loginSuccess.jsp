<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>

<link rel="stylesheet" type="text/css" href="css/menu.css">

<script type="text/javascript" src="js/student/studentDetails.js"></script>

<!-- <script type="text/javascript">
	$(document).ready(function() {
		//alert("Success Suri..");
		$('#studentDetailsTable').DataTable({
			dom : 'Bfrtip',
			buttons : [ 'copy', 'csv', 'excel', 'pdf', 'print' ]
		});
	});
</script> -->

<body ng-app="student" ng-controller="studentCtrl">

	<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
		<a class="navbar-brand" href="#">Navbar</a>
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#collapsibleNavbar">
			<span class="navbar-toggler-icon"></span>
		</button>
		<div class="collapse navbar-collapse" id="collapsibleNavbar">
			<ul class="navbar-nav">
				<li class="nav-item"><a class="nav-link" href="#">Link 1</a></li>
				<li class="nav-item"><a class="nav-link" href="#"
					ng-click="getAllStudentDetails()">Get Student Data</a></li>
				<li class="nav-item"><a class="nav-link" href="#"
					ng-click="generatePDF()">Link 3</a></li>
			</ul>
		</div>
	</nav>

	<div class="container-fluid mt-3">
		<div class="row">
			<div class="col-md-4">
				<div class="card">
					<div class="card-header">Student Form</div>
					<div class="card-body">
						<form:form id="studentForm" modelAttribute="stdDetails" action="showSuccessPage" method="POST">
							
							<label>Student ID <span style="color: red;">*</span></label>
							<form:input path="studentID" ng-model="studentID" id="studentID"
								cssClass="form-control" maxlength="5"
								onkeyup="integersOnly(this)" />
								
							<label>Student Name :</label>
							<form:input path="studentName" id="studentName"
								ng-model="studentName" cssClass="form-control" maxlength="30"
								onkeyup="validateCharacters(this)" />
								
							<label>Student Age</label>
							<form:input path="studentAge" id="studentAge"
								ng-model="studentAge" cssClass="form-control" maxlength="2"
								onkeyup="integersOnly(this)" />
								
							<label>Student College Name : </label>
							<form:input path="studentCollegeName" id="studentCollegeName"
								ng-model="studentCollegeName" cssClass="form-control"
								maxlength="40" />
								
							<label>Student Department</label>
							<form:select path="studentDepartment" id="studentDepartment"
								ng-model="studentDepartment" cssClass="form-control">
								<form:option value="0">--Select--</form:option>
								<form:option value="CSE">CSE</form:option>
								<form:option value="EEE">EEE</form:option>
								<form:option value="ECE">ECE</form:option>
								<form:option value="Mech">Mech</form:option>
								<form:option value="Civil">Civil</form:option>
								</form:select>
								
							<label>Student Academic-Year</label>
							<form:select path="studentAcademicYear" id="studentAcademicYear"
								ng-model="studentAcademicYear" cssClass="form-control">
								<form:option value="0">--Select--</form:option>
								<form:option value="2018-19">2018-19</form:option>
								<form:option value="2017-18">2017-18</form:option>
								<form:option value="2016-17">2016-17</form:option>
							</form:select>
							
							<label>Student Address</label>
							<form:textarea path="studentAddress" id="studentAddress"
								ng-model="studentAddress" cssClass="form-control" maxlength="40" />
								
						</form:form>
					</div>
					
					<div class="card-footer">
						<input type="button" value="Submit" class="btn btn-sm"
							ng-click="createStudent()">
						<!-- ng-click="createStudent()" -->
					</div>
				</div>
			</div>

			<div class="col-md-8">
				<!-- ng-if="studentsList.length > 0" -->
				<table class="table table-striped table-bordered table-hover" id="studentDetailsTable">
					<thead>
					    <tr>
					     <th colspan="8" style="text-align: center;">Student Details</th>
					    </tr>
						<tr>
						    <th>Sl.No</th>
							<th>Student ID</th>
							<th>Student Name</th>
							<th>Student Age</th>
							<th>Student College Name</th>
							<th>Student Department</th>
							<th>Student Academic-Year</th>
							<th>Student Address</th>
							<!-- <th colspan="2">Action</th> -->
						</tr>
					</thead>
					<tbody>
						<tr ng-repeat="student in studentsList">
						    <td>{{$index+1}}</td>
							<td>{{student.studentID}}</td>
							<td>{{student.studentName}}</td>
							<td>{{student.studentAge}}</td>
							<td>{{student.studentCollegeName}}</td>
							<td>{{student.studentDepartment}}</td>
							<td>{{student.studentAcademicYear}}</td>
							<td>{{student.studentAddress}}</td>
							<!-- <td><a ng-click="editStudent('{{student.studentID}}')"
								class="edit-button">Edit</a></td>
							<td><a ng-click="deleteStudent('{{student.studentID}}')"
								class="delete-button">Delete</a></td> -->
						</tr>
					</tbody>
				</table>
			</div>
		</div>
	</div>

</body>
