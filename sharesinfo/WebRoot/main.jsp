<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>衡泰股票系统-股票查询</title>
<link rel="stylesheet" type="text/css"
	href="bootstrap/css/bootstrap.min.css">
	<script type="text/javascript" src="js/jquery-1.11.1.js"></script>
	<script type="text/javascript" src="bootstrap/js/bootstrap.min.js"></script>
	<script type="text/javascript" src="js/search.js"></script>
</head>
<body style="margin: 10px;">
	<div class="container-fluid" style="margin-top: 20px;">
		<div class="row-fluid">
			<div class="span2"></div>

			<div class="span8">
				<div class="navbar-inner" style="margin: 10px auto;">
					<p class="text-center text-info"
						style="margin: 10px; font-size: 20px;">衡泰股票系统</p>
				</div>
				<div class="span2"
					style="height: 800px; border: 1px, solid, #ccc; background-color: #fafafa">
					<div class="accordion-group">
						<div class="accordion-heading">
							<a class="accordion-toggle" data-toggle="collapse"
								href="#collapseTwo">数据查询</a>
						</div>
					</div>
					<div id="collapseTwo" class="accordion-body collapse">
						<div class="accordion-inner">
							<a href="toMain.do">股票查询</a>
						</div>
					</div>
				</div>
				<div class="span8" style="position: relative">
					<div class="input-append">
						<input id="content" class="input" type="text" autocomplete="off"
							data-provide="typeahead" />
						<button id="btn_search" class="btn btn-primary"
							onclick="search(this.id);">查找</button>
					</div>

					<button class="btn btn-primary" type="button"
						style="float: right; margin-left: 10px;"
						onclick="location.href='toAdd.do'">录入</button>
					<button class="btn btn-primary" id="output" type="button"
						style="float: right;">导出</button>

					<table class="table table-bordered table-striped"
						style="margin-top: 20px;">
						<thead>
							<tr>
								<th>股票代码</th>
								<th>股票名称</th>
								<th>交易市场</th>
								<th>发行价格（元/股）</th>
								<th>发行市盈率</th>
								<th>上市日期</th>
								<th>到期日</th>
								<th>操作</th>
							</tr>
						</thead>
						<tbody id="tbody_data">

						</tbody>
					</table>
				</div>
			</div>

			<div class="span2"></div>
		</div>
	</div>

	<div id="deletetip" class="modal hide fade" role="dialog"
		aria-labelledby="myModalLabel" aria-hidden="true">
		<div class="modal-header">
			<button type="button" class="close" data-dismiss="modal"
				aria-hidden="true">×</button>
			<h4 id="myModalLabel">删除提示</h4>
		</div>
		<div class="modal-body">
			<p>确认删除该条股票的所有信息吗？</p>
		</div>
		<div class="modal-footer">
			<button class="btn" data-dismiss="modal" aria-hidden="true">取消</button>
			<button class="btn btn-primary">确定</button>
		</div>
	</div>


</body>

</html>