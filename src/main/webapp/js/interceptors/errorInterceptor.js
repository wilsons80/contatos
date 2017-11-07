angular.module("lista").factory("errorInterceptor", function ($q, $location) {
	return {
		responseError: function (rejection) {
			if (rejection.status === 500) {
				$location.path("/error");
			}
			return $q.reject(rejection);
		}
	};
});