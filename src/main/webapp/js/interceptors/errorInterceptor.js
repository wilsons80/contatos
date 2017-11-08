angular.module("lista").factory("errorInterceptor", function ($q, $location) {
	return {
		responseError: function (rejection) {
			console.log("Código de erro");
			console.log(rejection.status);
			if (rejection.status === 404) {
				$location.path("/error");
			}
			return $q.reject(rejection);
		},
		
		response : function(response){
			console.log("Response: ");
			console.log(response);
			if (response.status === 204) {
				$location.path("/error");
			}
			return response
		},
		
		request : function(config){
			console.log("Request: ");
			console.log(config);
			return config
		},
		
		requestError: function(rejection){
			console.log("Código de erro: ");
			console.log(rejection.status);
			return $q.reject(rejection)
		}
	};
});