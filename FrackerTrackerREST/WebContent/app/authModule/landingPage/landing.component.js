angular.module('authModule').component('landing',{
	templateUrl: 'app/authModule/landingPage/landing.component.html',
	controller : function(authService, $location){
		var vm = this;
		
		
		vm.login = function(){
			$location.path('/login');
		}
		
		vm.create = function(){
			$location.path('/register')
		}
	},
	controllerAs : 'vm'

})