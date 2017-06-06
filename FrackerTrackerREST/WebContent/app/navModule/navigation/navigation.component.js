angular.module("navModule").component("navComponent", {
	templateUrl : 'app/navModule/navigation/navigation.component.html',
	controller : function(authService, $location) {
		var vm = this;

		vm.homeNav = function() {

		}

	},
	controllerAs : 'vm'
});
