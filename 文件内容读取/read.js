/*var fs = require('fs');
var paths = ".";
var path = require('path');
var xtotal = 1;

var t = function() {

	xtotal--;
	if (xtotal == 0) {
		console.log("执行完毕") //这里是否添加分号;
	}
}
var getS = function(file) {
	fs.stat(file, function(err, stats) {
		if (stats.isFile()) {
			console.info(file);
			t();
		} else {
			fs.readdir(file, function(err, files) {
				if (err) throw err;
				for (var i = 0; i < file.length; i++) {
					xtotal++;
					getS(path.join(file, files[i]));
				}
				t();
			});
		}
	});
}

fs.readdir(paths, function(err, files) {
	if (err) throw err;
	for (var i = 0; i < files.length; i++) {
		xtotal;
		getS(path.join(paths, files[i]));
	}
	t();
});
console.log(fs.readFileSync(, 'utf-8')); * /
/ / console.log(fs.readdir);*/
//fs.readFileSync(,'utf-8');
/*data1 = fs.readFileSync('1.txt','utf-8');
data2 = fs.readFileSync('2.txt','utf-8');
data3 = fs.readFileSync('3.txt','utf-8');
data4 = fs.readFileSync('4.txt','utf-8');
console.log(data2);
console.log('end.');*/
var fs = require('fs');

var a = function(p) {
	fs.readFile('1.txt', 'utf-8', function(err, data) {
		if (err) {
			console.error(err);
		} else {
			p.a = data;
			fs.readFile('2.txt', 'utf-8', function(err, data) {
				if (err) {
					console.error(err);
				} else {
					p.b = data;
					fs.readFile('3.txt', 'utf-8', function(err, data) {
						if (err) {
							console.error(err);
						} else {
							p.c = data;
							fs.readFile('4.txt', 'utf-8', function(err, data) {
								if (err) {
									console.error(err);
								} else {
									p.d = data;
									success(p);
								}
							});
						}
					});
				}
			});
		}
	})
}
/*var b = function(p) {
	fs.readFile('2.txt', 'utf-8', function(err, data) {
		if (err) {
			console.error(err);
		} else {
			p.b = data;
			c(p);
		}
	});
}
var c = function(p) {
	fs.readFile('3.txt', 'utf-8', function(err, data) {
		if (err) {
			console.error(err);
		} else {
			p.c = data;
			d(p);
		}
	});
}
var d = function(p) {
	fs.readFile('4.txt', 'utf-8', function(err, data) {
		if (err) {
			console.error(err);
		} else {
			p.d = data;
			success(p);
		}
	});
}*/
var success = function(a) {
	console.log(a);
}
var fail = function() {
	console.log("false");
}
a({});

/*	function readLines(input, func) {
		var remaining = '';
		input.on('data', function(data) {
			remaining += data;
			var index = remaining.indexOf('\n');
			while (index > -1) {
				var line = remaining.substring(0, index);
				remaining = remaining.substring(index + 1);
				func(line);
				index = remaining.indexOf('\n');
			}
		});
		input.on('end', function() {
			if (remaining.length > 0) {
				func(remaining);
			}
		});
	}
	function func(data) {
		container.push(data);
	}
	var input = fs.createReadStream(__dirname + '/ip_arr.txt');
	readLines(input, func);*/