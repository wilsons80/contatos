angular.module("lista").filter("upper", function(){
	return function(input){
		if(!input) return input;
		return input.toUpperCase();
	};
});