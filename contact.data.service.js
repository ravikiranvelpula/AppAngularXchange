(function () {
    var app = angular.module("ContactApp");
    app.service("contactDataSvc", function ($http) {
        var self = this;
        self.getPosts = function () {
            var promise1 = $http.get('http://localhost:8080/MessangerDemo/webapi/posts/getAllPosts');
            var promise2 = promise1.then(function (response) {
                return response.data;
            });
            return promise2;
        }
        self.saveComment = function (comment) {
            var promise1 = $http.put('http://localhost:8080/MessangerDemo/webapi/comments/updateComment/' + comment.commentId, comment);
            var promise2 = promise1.then(function (response) {
                console.log(response);
                /* return response.data;*/
            });
            return promise2;
        }
    });
})();