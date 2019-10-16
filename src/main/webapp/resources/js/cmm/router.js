"user strict";
function Session(x) {
	sessionStorage.setItem('ctx',x);
	sessionStorage.setItem('js',x+'/resources/css');
	sessionStorage.setItem('js',x+'/resources/img');
	sessionStorage.setItem('js',x+'/resources/js');
	return{
		ctx : ()=>{return sessionStorage.getItem('ctx');},
		js : ()=>{return sessionStorage.getItem('js');},
		css : ()=>{return sessionStorage.getItem('css');},
		img : ()=>{return sessionStorage.getItem('img');}
		
	};
};