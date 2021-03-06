
package com.github.fawwaz.heroku.service;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "Api", targetNamespace = "http://service.heroku.fawwaz.github.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Api {


    /**
     * 
     * @param arg0
     * @return
     *     returns boolean
     * @throws InterruptedException_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "deleteUser", targetNamespace = "http://service.heroku.fawwaz.github.com/", className = "com.github.fawwaz.heroku.service.DeleteUser")
    @ResponseWrapper(localName = "deleteUserResponse", targetNamespace = "http://service.heroku.fawwaz.github.com/", className = "com.github.fawwaz.heroku.service.DeleteUserResponse")
    public boolean deleteUser(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0)
        throws InterruptedException_Exception
    ;

    /**
     * 
     * @param arg3
     * @param arg2
     * @param arg4
     * @param arg1
     * @param arg0
     * @return
     *     returns boolean
     * @throws InterruptedException_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "updatePost", targetNamespace = "http://service.heroku.fawwaz.github.com/", className = "com.github.fawwaz.heroku.service.UpdatePost")
    @ResponseWrapper(localName = "updatePostResponse", targetNamespace = "http://service.heroku.fawwaz.github.com/", className = "com.github.fawwaz.heroku.service.UpdatePostResponse")
    public boolean updatePost(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        String arg2,
        @WebParam(name = "arg3", targetNamespace = "")
        String arg3,
        @WebParam(name = "arg4", targetNamespace = "")
        String arg4)
        throws InterruptedException_Exception
    ;

    /**
     * 
     * @param arg3
     * @param arg2
     * @param arg4
     * @param arg1
     * @param arg0
     * @return
     *     returns boolean
     * @throws InterruptedException_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "addComment", targetNamespace = "http://service.heroku.fawwaz.github.com/", className = "com.github.fawwaz.heroku.service.AddComment")
    @ResponseWrapper(localName = "addCommentResponse", targetNamespace = "http://service.heroku.fawwaz.github.com/", className = "com.github.fawwaz.heroku.service.AddCommentResponse")
    public boolean addComment(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        String arg2,
        @WebParam(name = "arg3", targetNamespace = "")
        String arg3,
        @WebParam(name = "arg4", targetNamespace = "")
        String arg4)
        throws InterruptedException_Exception
    ;

    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<com.github.fawwaz.heroku.service.Comment>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "listComment", targetNamespace = "http://service.heroku.fawwaz.github.com/", className = "com.github.fawwaz.heroku.service.ListComment")
    @ResponseWrapper(localName = "listCommentResponse", targetNamespace = "http://service.heroku.fawwaz.github.com/", className = "com.github.fawwaz.heroku.service.ListCommentResponse")
    public List<Comment> listComment(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param arg3
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns boolean
     * @throws InterruptedException_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "updateUser", targetNamespace = "http://service.heroku.fawwaz.github.com/", className = "com.github.fawwaz.heroku.service.UpdateUser")
    @ResponseWrapper(localName = "updateUserResponse", targetNamespace = "http://service.heroku.fawwaz.github.com/", className = "com.github.fawwaz.heroku.service.UpdateUserResponse")
    public boolean updateUser(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        String arg2,
        @WebParam(name = "arg3", targetNamespace = "")
        String arg3)
        throws InterruptedException_Exception
    ;

    /**
     * 
     * @param arg0
     * @return
     *     returns com.github.fawwaz.heroku.service.User
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getUser", targetNamespace = "http://service.heroku.fawwaz.github.com/", className = "com.github.fawwaz.heroku.service.GetUser")
    @ResponseWrapper(localName = "getUserResponse", targetNamespace = "http://service.heroku.fawwaz.github.com/", className = "com.github.fawwaz.heroku.service.GetUserResponse")
    public User getUser(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getSemuaUser", targetNamespace = "http://service.heroku.fawwaz.github.com/", className = "com.github.fawwaz.heroku.service.GetSemuaUser")
    @ResponseWrapper(localName = "getSemuaUserResponse", targetNamespace = "http://service.heroku.fawwaz.github.com/", className = "com.github.fawwaz.heroku.service.GetSemuaUserResponse")
    public String getSemuaUser();

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "login", targetNamespace = "http://service.heroku.fawwaz.github.com/", className = "com.github.fawwaz.heroku.service.Login")
    @ResponseWrapper(localName = "loginResponse", targetNamespace = "http://service.heroku.fawwaz.github.com/", className = "com.github.fawwaz.heroku.service.LoginResponse")
    public boolean login(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1);

    /**
     * 
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "listUnpublishedPost", targetNamespace = "http://service.heroku.fawwaz.github.com/", className = "com.github.fawwaz.heroku.service.ListUnpublishedPost")
    @ResponseWrapper(localName = "listUnpublishedPostResponse", targetNamespace = "http://service.heroku.fawwaz.github.com/", className = "com.github.fawwaz.heroku.service.ListUnpublishedPostResponse")
    public boolean listUnpublishedPost();

    /**
     * 
     * @param arg0
     * @return
     *     returns boolean
     * @throws InterruptedException_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "deletePost", targetNamespace = "http://service.heroku.fawwaz.github.com/", className = "com.github.fawwaz.heroku.service.DeletePost")
    @ResponseWrapper(localName = "deletePostResponse", targetNamespace = "http://service.heroku.fawwaz.github.com/", className = "com.github.fawwaz.heroku.service.DeletePostResponse")
    public boolean deletePost(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0)
        throws InterruptedException_Exception
    ;

    /**
     * 
     * @param arg0
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "publishPost", targetNamespace = "http://service.heroku.fawwaz.github.com/", className = "com.github.fawwaz.heroku.service.PublishPost")
    @ResponseWrapper(localName = "publishPostResponse", targetNamespace = "http://service.heroku.fawwaz.github.com/", className = "com.github.fawwaz.heroku.service.PublishPostResponse")
    public boolean publishPost(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @return
     *     returns java.util.List<com.github.fawwaz.heroku.service.Post>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getAllPost", targetNamespace = "http://service.heroku.fawwaz.github.com/", className = "com.github.fawwaz.heroku.service.GetAllPost")
    @ResponseWrapper(localName = "getAllPostResponse", targetNamespace = "http://service.heroku.fawwaz.github.com/", className = "com.github.fawwaz.heroku.service.GetAllPostResponse")
    public List<Post> getAllPost();

    /**
     * 
     * @param arg0
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "searchPost", targetNamespace = "http://service.heroku.fawwaz.github.com/", className = "com.github.fawwaz.heroku.service.SearchPost")
    @ResponseWrapper(localName = "searchPostResponse", targetNamespace = "http://service.heroku.fawwaz.github.com/", className = "com.github.fawwaz.heroku.service.SearchPostResponse")
    public boolean searchPost(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param arg3
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns boolean
     * @throws InterruptedException_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "addPost", targetNamespace = "http://service.heroku.fawwaz.github.com/", className = "com.github.fawwaz.heroku.service.AddPost")
    @ResponseWrapper(localName = "addPostResponse", targetNamespace = "http://service.heroku.fawwaz.github.com/", className = "com.github.fawwaz.heroku.service.AddPostResponse")
    public boolean addPost(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        String arg2,
        @WebParam(name = "arg3", targetNamespace = "")
        String arg3)
        throws InterruptedException_Exception
    ;

    /**
     * 
     * @return
     *     returns java.util.List<com.github.fawwaz.heroku.service.User>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getAllUser", targetNamespace = "http://service.heroku.fawwaz.github.com/", className = "com.github.fawwaz.heroku.service.GetAllUser")
    @ResponseWrapper(localName = "getAllUserResponse", targetNamespace = "http://service.heroku.fawwaz.github.com/", className = "com.github.fawwaz.heroku.service.GetAllUserResponse")
    public List<User> getAllUser();

    /**
     * 
     * @param arg3
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns boolean
     * @throws InterruptedException_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "createUser", targetNamespace = "http://service.heroku.fawwaz.github.com/", className = "com.github.fawwaz.heroku.service.CreateUser")
    @ResponseWrapper(localName = "createUserResponse", targetNamespace = "http://service.heroku.fawwaz.github.com/", className = "com.github.fawwaz.heroku.service.CreateUserResponse")
    public boolean createUser(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        String arg2,
        @WebParam(name = "arg3", targetNamespace = "")
        String arg3)
        throws InterruptedException_Exception
    ;

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns boolean
     * @throws InterruptedException_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "deleteComment", targetNamespace = "http://service.heroku.fawwaz.github.com/", className = "com.github.fawwaz.heroku.service.DeleteComment")
    @ResponseWrapper(localName = "deleteCommentResponse", targetNamespace = "http://service.heroku.fawwaz.github.com/", className = "com.github.fawwaz.heroku.service.DeleteCommentResponse")
    public boolean deleteComment(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1)
        throws InterruptedException_Exception
    ;

}
