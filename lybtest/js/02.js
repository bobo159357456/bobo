$(document).ready(function() {
	//奇数行显示灰色背景
//	$('tr:even').addClass('alt');
	//解决当存在两个表格，每个表格的第一行都显示灰色背景
	$('tr:nth-child(odd)').addClass('alt');
//	$('td:contains(Henry)').addClass('highlight');
	$('a').filter(function() {
	return this.hostname && this.hostname != location.hostname;
	}).addClass('external');
//	$('td:contains(Henry)').next().addClass('highlight');
//	$('td:contains(Henry)').nextAll().addClass('highlight');
//	$('td:contains(Henry)').nextAll().addBack()
//	.addClass('highlight');
//	$('td:contains(Henry)').parent().children()
//	.addClass('highlight');
//	$('td:contains(Henry)').parent().find('td:eq(1)')
//	.addClass('highlight').end().find('td:eq(2)')
//	.addClass('highlight');
	$('td:contains(Henry)') //取得包含Henry的所有单元格
	.parent() //取得它的父元素
	.find('td:eq(1)') //在父元素中查找第2个单元格
	.addClass('highlight') //为该单元格添加hightlight类
	.end() //恢复到包含Henry的单元格的父元素
	.find('td:eq(2)') //在父元素中查找第3个单元格
	.addClass('highlight'); //为该单元格添加hightlight类
//	$('tr > td:last-child').addClass('year');
//$('td:nth-child(3)').addClass('year');
//	$('td:contains(Tragedy)').addClass('year');
	$('tr:contains(Tragedy)').filter('tr:eq(0)').addClass('special');
	
});