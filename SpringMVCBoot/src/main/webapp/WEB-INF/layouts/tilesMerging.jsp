<!DOCTYPE html>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<html>
<head>
<title><tiles:getAsString name="title" /></title>

<meta charset="utf-8">

<meta name="viewport" content="width=device-width, initial-scale=1">

<!-- For Bootstrap -->

<link rel="stylesheet" type="text/css" href="css/bootstrap/bootstrap.min.css">

<script type="text/javascript" src="js/jquery/jquery.min.js"></script>

<script type="text/javascript" src="js/jquery/popper.min.js"></script>

<script type="text/javascript" src="js/jquery/bootstrap.min.js"></script>

<!-- For Angular JS -->

<script type="text/javascript" src="js/angular/angular.min.js"></script>

<!-- For Common Validations -->

<script type="text/javascript" src="js/commonValidations/validation.js"></script>


<!-- For DataTable -->

<script type="text/javascript" src="js/datatable/jquery-3.3.1.js"></script>

<script type="text/javascript" src="js/datatable/dataTables.min.js"></script>

<script type="text/javascript" src="js/datatable/buttons.min.js"></script>

<script type="text/javascript" src="js/datatable/flash.min.js"></script>

<script type="text/javascript" src="js/datatable/jszip.min.js"></script>

<script type="text/javascript" src="js/datatable/pdfmake.min.js"></script>

<script type="text/javascript" src="js/datatable/vfs_fonts.js"></script>

<script type="text/javascript" src="js/datatable/html5.min.js"></script>

<script type="text/javascript" src="js/datatable/print.min.js"></script>


</head>
 
<body>
    <table width="100%">
        <tr>
            <td colspan="2">
                <tiles:insertAttribute name="header" />
            </td>
        </tr>
        <tr>
            <td>
                 <tiles:insertAttribute name="menu" />
             </td>
            <td>
                 <tiles:insertAttribute name="body" />
             </td>
        </tr>
        <tr>
            <td colspan="2">
                 <tiles:insertAttribute name="footer" />
            </td>
        </tr>
    </table>
</body>
</html>