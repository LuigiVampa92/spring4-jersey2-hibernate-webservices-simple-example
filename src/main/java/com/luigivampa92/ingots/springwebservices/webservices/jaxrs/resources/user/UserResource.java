package com.luigivampa92.ingots.springwebservices.webservices.jaxrs.resources.user;

import com.luigivampa92.ingots.springwebservices.data.model.UserModel;
import com.luigivampa92.ingots.springwebservices.data.service.UserDataService;
import com.luigivampa92.ingots.springwebservices.rest.model.User;
import com.luigivampa92.ingots.springwebservices.rest.model.UserListResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import java.util.ArrayList;
import java.util.List;

@Path("/user")
@Component
public class UserResource {

    @Autowired
    private UserDataService userDataService;

    @GET
    @Path("/all")
    @Produces("application/json")
    public UserListResponse getAll() {
        List<UserModel> models = userDataService.getAllUsers();
        List<User> users = new ArrayList<>();

        for(UserModel model: models) {
            users.add(model.toUser());
        }

        return new UserListResponse(users);
    }
}
