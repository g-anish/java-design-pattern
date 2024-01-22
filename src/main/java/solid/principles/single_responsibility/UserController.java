package solid.principles.single_responsibility;

import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;

//Handles incoming JSON requests that work on User
public class UserController {

    private UserPersistenceService persistenceService = new UserPersistenceService();
    
    //Create a new user
    public String createUser(String userJson) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        User user = mapper.readValue(userJson, User.class);

        /*
        Change : Added UserValidator class
        instead of validating here
        - Any future change in validation, doesn't affect this class
         */

        UserValidator validator = new UserValidator();
        boolean valid = validator.validateUser(user);
        
        if(!valid) {
            return "ERROR";
        }

        persistenceService.saveUser(user);
        
        return "SUCCESS";
    } 

}