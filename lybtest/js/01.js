$(document).ready(function(){
	//在含有poem-stanza中加入新类highlight,从而可以引用highlight类的样式
	$('div.poem-stanza').addClass('highlight');
	$('#selected-plays > li').addClass('horizontal');
	$('#selected-plays li:not(.horizontal)').addClass('sub-level');
	$('a[href^="mailto:"]').addClass('mailto');
//	$('a[href$=".pdf"]').addClass('pdflink');
	$('a[href^="http"][href*="henry"]')
	.addClass('henrylink');
	//关于> 指向所有li元素 但不改变li元素下的元素
//	$('#selected-plays > li:eq(1) ul li').addClass('special');

	//关于> 指向所有li元素 改变li元素下的所有元素
	
//	$('#selected-plays li').addClass('special');
//$('#selected-plays ul > li').addClass('special');
//$('#selected-plays ul ul >li').removeClass('special');
$('#selected-plays > li > ul > li').addClass('special');

	/*选择包含链接（ <a> ）的所有列表项（ <li> 元素） ，为每个选中的列表项的同辈列
表项元素添加 afterlink 类；*/
	$('a').parent().siblings().not('li:has(a)').addClass('afterlink');
//$('#selected-plays > li > ul > li:has(a)').nextAll().not('li:has(a)').addClass('afterlink');
	$('a[href$=".pdf"]').parent().parent().addClass('tragedy');
	
});
//function addHighlightClass(){
//	$('div.poem-stanza').addClass('highlight');
//}
//$(document).ready(addHighlightClass);