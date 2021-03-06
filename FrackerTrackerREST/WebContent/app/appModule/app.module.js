angular.module('appModule', ['ngRoute', 'authModule', 'ftModule', 'navModule'])
.config(function($routeProvider){
	console.log($routeProvider)
	$routeProvider
	.when('/',{
		template : '<landing></landing>'
	})
	.when('/login',{
		template : '<login></login>'
	})
	.when('/register',{
		template: '<register></register>'
	})
	.when('/home', {
		template: '<home></home>'
	})
	.when('/drillsites',{
		template:'<drillsites></drillsites>'
	})
	.otherwise({
		template: '<not-found-component></not-found-component>'
	})
})