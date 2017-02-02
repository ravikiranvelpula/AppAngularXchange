(function () {
    var app = angular.module("ContactApp");
    app.service("appServiceSvc", function contactApp(appTitleSvc) {
        this.name = appTitleSvc;
        this.author = "Avinash";
        this.buildDate = new Date().toDateString();
    });
})();