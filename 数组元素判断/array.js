var a = "a,b,c,d";
console.log(a.split(","));
//定义一个新的数组 数组名为newarr
var newarr = new Array();
//a的分隔赋值给数组newarr
newarr = a.split(",");
console.log(newarr[0]+","+newarr.length);
// console.log([a,b,c].toString());

if (contains(newarr,"b")) {
	console.log("找到了！");
}else{
	console.log("没找到！");
}
//定义一个方法,a:数组,obj:元素
function contains(a,obj){
	for (var i = 0; i < a.length; i++) {
		if (a[i]===obj) {
			return true;
		};
	}
	return false;
}