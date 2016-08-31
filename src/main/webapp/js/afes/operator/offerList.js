/**
 * 
 */


function getOfferList() {
	$.ajax({
		type: "GET",
		url: 'offerDatas.do',
		dataType:"json",
		data: {
		},
		success: function(data) {
			console.log(JSON.stringify(data));
			$('#offerList').jqGrid('setGridParam', {data: data}).trigger('reloadGrid');		
		},
		error: function () {
			alert('not really');
		}
	});
}

$( document ).ready(function() {
	jQuery.browser = {};
	(function () {
	    jQuery.browser.msie = false;
	    jQuery.browser.version = 0;
	    if (navigator.userAgent.match(/MSIE ([0-9]+)\./)) {
	        jQuery.browser.msie = true;
	        jQuery.browser.version = RegExp.$1;
	    }
	})();
	
	$("#offerList").jqGrid({
//		datatype: "json",
	   	colModel:[
	   		{name:'id',index:'id', width:60, sorttype:"int"},
	   		{name:'invdate',index:'invdate', width:90, sorttype:"date"},
	   		{name:'name',index:'name', width:100},
	   		{name:'amount',index:'amount', width:80, align:"right",sorttype:"float"},
	   		{name:'tax',index:'tax', width:80, align:"right",sorttype:"float"},		
	   		{name:'note',index:'note', width:150, sortable:false}		
	   	],
	   	rowNum:20,
//	   	rowList:[10,20,30],
//	   	pager: '#pager3',
//	   	sortname: 'id',
	    viewrecords: true,
	    sortorder: "desc",
	    loadonce: true,
	    caption: "Load Once Example"
	});
	
	getOfferList();
	
});