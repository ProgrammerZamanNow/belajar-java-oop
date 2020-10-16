package programmer.zaman.now.application;

import programmer.zaman.now.data.CreateUserRequest;
import programmer.zaman.now.util.ValidationUtil;

public class ReflectionApp {
  public static void main(String[] args) {

    CreateUserRequest request = new CreateUserRequest();
    request.setUsername("eko");
    request.setPassword("eko");
    request.setName("eko");

    ValidationUtil.validationReflection(request);

  }
}
