angular.module("lista").service("operadorasAPI", function($http, config){
	this.getOperadoras = function(){
		return $http.get(config.baseURL + "operadora");
	}
});