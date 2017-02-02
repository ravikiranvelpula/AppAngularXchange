(function () {
    var app = angular.module("ContactApp");
    app.controller("ContactCtrl", ContactCtrl);

    function ContactCtrl(contactDataSvc) {
        var self = this;
        self.editMode = false;
        self.editModeComment = false;
        contactDataSvc.getPosts().then(function (data) {
            self.posts = data;
        });
        this.toggleEditModeComment = function () {
            this.editModeComment = !this.editModeComment;
        }
        this.toggleEditMode = function () {
            this.editMode = !this.editMode;
        }
        this.selectedPost = function (index) {
            this.post = this.posts[index];
            this.postIndex = index;
            this.successMessage = undefined;
        }
        this.selectedComment = function (index) {
            this.comment = this.post.comments[index];
            this.commentIndex = index;
            this.successMessage = undefined;
        }
        this.saveComment = function () {
                this.toggleEditModeComment();
                var comment = this.comment;
                contactDataSvc.saveComment(comment).then(function () {
                    self.successMessage = "Successfully Updated";
                })
            }
            /* this.saveComment = function () {
                 this.toggleEditModeComment();
                 var post = this.post;
                 contactDataSvc.savePost(post);
             }*/
    }
})();