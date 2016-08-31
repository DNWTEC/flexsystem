<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

		<script type="text/javascript" src="js/lib/jquery.min.js"></script>
		<script type="text/javascript" src="js/lib/jquery.jqGrid.min.js"></script>
		<script type="text/javascript" src="js/afes/operator/offerList.js"></script>
	
		<link rel="stylesheet" type="text/css" href="css/lib/bootstrap/bootstrap.css">
		<link rel="stylesheet" type="text/css" href="css/lib/ui.jqgrid.css">
		<!-- Website CSS style -->
</head>
<body>
    <div class="section">
      <div class="container">
        <div class="row">
          <div class="col-md-12">
            <h1 class="text-left">Operator OfferList&nbsp;</h1>
          </div>
        </div>
        <p></p>
        <div class="row">
          <div class="col-md-9">
          	<table id="offerList"></table>
          </div>
          <div class="col-md-3">
            <div class="panel panel-primary text-left">
              <div class="panel-body">
                <form class="form-horizontal" role="form">
                  <div class="form-group">
                    <label class="col-sm-2 control-label">제목</label>
                    <div class="col-sm-10">
                      <input class="form-control" id="focusedInput" type="text" value="Click to focus...">
                    </div>
                  </div>
                  <div class="form-group">
                    <label for="inputPassword" class="col-sm-2 control-label">주제</label>
                    <div class="col-sm-10">
                      <input class="form-control" id="disabledInput" type="text" placeholder="Disabled input here..." disabled="">
                    </div>
                  </div>
                  <div class="form-group">
                    <label for="inputPassword" class="col-sm-2 control-label">카테고리</label>
                    <div class="col-sm-5">
                      <select class="form-control" id="sel1">
                        <option>문화</option>
                        <option>과학</option>
                        <option>예술</option>
                        <option>수학</option>
                      </select>
                    </div>
                  </div>
                  <div class="row">
                    <div class="col-md-12 text-center">
                      <a class="btn btn-success">등록</a>
                    </div>
                  </div>
                </form>
              </div>
              <ul class="list-group"></ul>
            </div>
          </div>
        </div>
      </div>
    
  </div>
  

</body>
</html>