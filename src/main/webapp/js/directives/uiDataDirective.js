angular.module("lista").directive("uiData", function($filter){
	return {
		require: "ngModel",
		link : function(scope, element, attrs, ctrl){
			var _formateData = function(date){
				date = date.replace(/[^0-9]+/g, "");
				if(date.length > 2){
					date = date.substring(0,2) + "/" + date.substring(2);
				}
				if(date.length > 5){
					date = date.substring(0,5) + "/" + date.substring(5,9);
				}
				return date;
			};
			
			element.bind("keyup", function(){
				ctrl.$setViewValue(_formateData(ctrl.$viewValue));
				ctrl.$render();
			});
			
			//envia para o scopo apenas quando o usuário digitar toda a data
			ctrl.$parsers.push(function(value){
				if(value.length === 10){
					var dataArray = value.split("/");
					var novaData = new Date(dataArray[2], dataArray[1]-1, dataArray[0]);
					return $filter("date")(novaData, "dd/MM/yyyy");
				}
			});
			
			//formata o valor em objeto Date
			ctrl.$formatters.push(function(value){
				return $filter("date")(value, "dd/MM/yyyy");
			});
		}
	};
});