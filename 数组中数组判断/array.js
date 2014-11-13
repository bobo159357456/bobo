var a = {
	"a": "1",
	"b": "2"
};
var b = {
	"a": {
		"a1": "1",
		"a2": "2",
		"a3": "3"
	},
	"b": "11"
};
var c = ["1", "2", "3"];
//var b = ["1","a":{"1","2"},"3","4","5"];
//var d = b[1];
// var c =[];
// c = a.split(",");
console.log(a);
console.log(b.a.a3);
console.log(c.length + "," + c[1] + "," + c);
//console.log(b);

for (var i = 0; i < c.length; i++) {
	console.log("insert into table (a,b,c) values (" +"'"+c[i]+"'"+ ")");
	}