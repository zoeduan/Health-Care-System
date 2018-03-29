angular.
module('userAdd', []).
component('userAdd', {
	templateUrl: 'user/user-add/user-add.template.html',
	controller: [ '$window','$http','$rootScope',
		function addUserController($window, $http,$rootScope){
			var self = this;
			self.name = 'zoe';
			self.email = 'zoe@test.com';
			self.message = '';
			
			self.add = function(){
				var add_params = {name: self.name, email: self.email};
				$http({
					url:"/demo/add",
					method:"POST",
					params: add_params
				}).then(function success(response){
                    self.message = response.data.message;
                    $rootScope.$emit('USERADD', 'hi');
				}, function error(response){
                    $window.alert(response.data.message);
				});

			}
		}
	]
});