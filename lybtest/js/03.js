//$(document).ready(function() {
//	$('#switcher-default').on('click', function() {
//		alert(1);
//		$('p').removeClass('narrow');
//		$('p').removeClass('large');
//	});
//	$('#switcher-narrow').on('click', function() {
//		alert(2);
//		$('#switcher-large').removeClass('large')
//		$('switcher-narrow').addClass('narrow');
//	});
//	$('#switcher-large').on('click', function() {
//		alert(3);
//		$('#switcher-large').removeClass('narrow');
//		$(this).addClass('large');
//	});
//});


//$(document).ready(function() {
//	$('#switcher-default')
//		.addClass('selected')
//		.on('click', function() {
//			$('body').removeClass('narrow');
//			$('body').removeClass('large');
//			$('#switcher button').removeClass('selected');
//			$(this).addClass('selected');
//		});
//	$('#switcher-narrow').on('click', function() {
//		$('body').addClass('narrow');
//		$('body').removeClass('large');
//		$('#switcher button').removeClass('selected');
//		$(this).addClass('selected');
//	});
//	$('#switcher-large').on('click', function() {
//		$('body').removeClass('narrow');
//		$('body').addClass('large');
//		$('#switcher button').removeClass('selected');
//		$(this).addClass('selected');
//	});
//});

//
//$(document).ready(function() {
//	$('#switcher-default')
//		.addClass('selected')
//		.on('click', function() {
//			$('body').removeClass('narrow').removeClass('large');
//		});
//	$('#switcher-narrow').on('click', function() {
//		$('body').addClass('narrow').removeClass('large');
//	});
//	$('#switcher-large').on('click', function() {
//		$('body').removeClass('narrow').addClass('large');
//	});
//	$('#switcher button').on('click', function() {
//		$('#switcher button').removeClass('selected');
//		$(this).addClass('selected');
//	});
//});


//改善代码
//$(document).ready(function() {
//	$('#switcher-default')
//		.addClass('selected')
//		.on('click', function() {
//			$('body').removeClass();
//		});
//	$('#switcher-narrow').on('click', function() {
//		$('body').removeClass().addClass('narrow');
//	});
//	$('#switcher-large').on('click', function() {
//		$('body').removeClass().addClass('large');
//	});
//	$('#switcher button').on('click', function() {
//		$('#switcher button').removeClass('selected');
//		$(this).addClass('selected');
//	});
//});

//$(document).ready(function() {
//	$('#switcher-default').addClass('selected');
//	$('#switcher button').on('click', function() {
//		$('body').removeClass();
//		$('#switcher button').removeClass('selected');
//		$(this).addClass('selected');
//	});
//	$('#switcher-narrow').on('click', function() {
//		$('body').addClass('narrow');
//	});
//	$('#switcher-large').on('click', function() {
//		$('body').addClass('large');
//	});
//});

//$(document).ready(function() {
//	$('#switcher-default').addClass('selected');
//	$('#switcher button').on('click', function() {
//		var bodyClass = this.id.split('-')[1];
//		alert(bodyClass);
//		$('body').removeClass().addClass(bodyClass);
//		$('#switcher button').removeClass('selected');
//		$(this).addClass('selected');
//	});
//});
//$(document).ready(function() {
////	$('#switcher-default').addClass('selected');
////	$('#switcher button').click(function() {
////		var bodyClass = this.id.split('-')[1];
////		$('body').removeClass().addClass(bodyClass);
////		$('#switcher button').removeClass('selected');
////		$(this).addClass('selected');
////	});
//	$('#switcher h3').click(function() {
//	$('#switcher button').toggleClass('hidden');
//});
//});
//$(document).ready(function() {
//	$('#switcher h3').hover(function() {
//		$(this).addClass('hover');
//	}, function() {
//		$(this).removeClass('hover');
//	});
//});
//$(document).ready(function() {
//	$('#switcher').click(function(event) {
//		$('#switcher button').toggleClass('hidden');
//	});
//});
//未完成的代码
//$(document).ready(function() {
//	$('#switcher').click(function(event) {
//			$('#switcher button').toggleClass('hidden');
//	});
//});

//$(document).ready(function() {
//	$('#switcher-default').addClass('selected');
//	$('#switcher button').click(function(event) {
//		var bodyClass = this.id.split('-')[1];
//		$('body').removeClass().addClass(bodyClass);
//		$('#switcher button').removeClass('selected');
//		$(this).addClass('selected');
//		event.stopPropagation();
//	});
//});

//$(document).ready(function() {
//	$('#switcher').click(function(event) {
//		if ($(event.target).is('button')) {
//			var bodyClass = event.target.id.split('-')[1];
//			$('body').removeClass().addClass(bodyClass);
//			$('#switcher button').removeClass('selected');
//			$(event.target).addClass('selected');
//			event.stopPropagation();
//		}
//	});
//});

//$(document).ready(function() {
//	$('#switcher-default').addClass('selected');
//	$('#switcher').click(function(event) {
//		if ($(event.target).is('button')) {
//			var bodyClass = event.target.id.split('-')[1];
//			$('body').removeClass().addClass(bodyClass);
//			$('#switcher button').removeClass('selected');
//			$(event.target).addClass('selected');
//		} else {
//			$('#switcher button').toggleClass('hidden');
//		}
//	});
//})
 

//$('#switcher').on('click', 'button', function() {
//	var bodyClass = event.target.id.split('-')[1];
//	$('body').removeClass().addClass(bodyClass);
//	$('#switcher button').removeClass('selected');
//	$(this).addClass('selected');
//});

//$(document).ready(function() {
//	$('#switcher').click(function(event) {
//		if (!$(event.target).is('button')) {
//			$('#switcher button').toggleClass('hidden');
//		}
//	});
//	$('#switcher-narrow, #switcher-large').click(function() {
//		$('#switcher').off('click');
//	});
//});

//$(document).ready(function() {
//	$('#switcher').on('click.collapse', function(event) {
//		if (!$(event.target).is('button')) {
//			$('#switcher button').toggleClass('hidden');
//		}
//	});
//	$('#switcher-narrow, #switcher-large').click(function() {
//		$('#switcher').off('click.collapse');
//	});
//});

//$(document).ready(function() {
//	var toggleSwitcher = function(event) {
//		if (!$(event.target).is('button')) {
//			$('#switcher button').toggleClass('hidden');
//		}
//	};
//	$('#switcher').on('click.collapse', toggleSwitcher);
//});

//$(document).ready(function() {
//	var toggleSwitcher = function(event) {
//		if (!$(event.target).is('button')) {
//			$('#switcher button').toggleClass('hidden');
//		}
//	};
//	$('#switcher').on('click', toggleSwitcher);
//	$('#switcher button').click(function() {
//		$('#switcher').off('click', toggleSwitcher);
//		if (this.id == 'switcher-default') {
//			$('#switcher').on('click', toggleSwitcher);
//		}
//	});
//});
//$(document).ready(function() {
//	$('#switcher').trigger('click');
//	$('#switcher').click(function(){
//		alert(111);
//	});
//});

//$(document).ready(function() {
//	var triggers = {
//		D: 'default',
//		N: 'narrow',
//		L: 'large'
//	};
//	$(document).keyup(function(event) {
//		var key = String.fromCharCode(event.which);
//		if (key in triggers) {
//			$('#switcher-' + triggers[key]).click();
//		}
//	});
//});

$(document).ready(function() {
	//在样式转换器按钮上启用悬停效果
	$('#switcher').hover(function() {
		$(this).addClass('hover');
	}, function() {
		$(this).removeClass('hover');
	});
	//让样式转换器能够扩展和折叠
	var toggleSwitcher = function(event) {
		if (!$(event.target).is('button')) {
			$('#switcher button').toggleClass('hidden');
		}
	};
	$('#switcher').on('click', toggleSwitcher);
	//模拟一次单击，以便开始时处理折叠状态
	$('#switcher').click();
	//setBodyClass()用于修改页面样式
	//样式转换器的状态也会被更新
	var setBodyClass = function(className) {
		$('body').removeClass().addClass(className);
		$('#switcher button').removeClass('selected');
		$('#switcher-' + className).addClass('selected');
		$('#switcher').off('click', toggleSwitcher);
		if (className == 'default') {
			$('#switcher').on('click', toggleSwitcher);
		}
	};
	//开始的时候先选中switcher-default按钮
	$('#switcher-default').addClass('selected');
	//映射键码和对应的按钮
	var triggers = {
		D: 'default',
		N: 'narrow',
		L: 'large'
	};
	//当按钮被单击时调用setBodyClass()
	$('#switcher').click(function(event) {
		if ($(event.target).is('button')) {
			var bodyClass = event.target.id.split('-')[1];
			setBodyClass(bodyClass);
		}
	});
	//当按下相应按键时调用setBodyClass()
	$(document).keyup(function(event) {
		var key = String.fromCharCode(event.keyCode);
		if (key in triggers) {
			setBodyClass(triggers[key]);
		}
	});
});