package com.example.restservice;

import lombok.AllArgsConstructor;
import lombok.ToString;
import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.IanaLinkRelations;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

import static org.springframework.hateoas.server.core.DummyInvocationUtils.methodOn;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;

@RestController
@AllArgsConstructor
@ToString
public class UserController {
    private UserRepository userRepository;
    private final UserModelAssembler userModelAssembler;


    @GetMapping("/users")
    CollectionModel<EntityModel<Users>> all() {

        List<EntityModel<Users>> users = userRepository.findAll().stream() //
                .map(userModelAssembler::toModel) //
                .collect(Collectors.toList());

        return CollectionModel.of(users, linkTo(methodOn(UserController.class).all()).withSelfRel());
    }
    @PostMapping("/users")
    ResponseEntity<?> newUser(@RequestBody Users newUsers) {

        EntityModel<Users> entityModel = userModelAssembler.toModel(userRepository.save(newUsers));

        return ResponseEntity //
                .created(entityModel.getRequiredLink(IanaLinkRelations.SELF).toUri()) //
                .body(entityModel);
    }
    @GetMapping("/users/{id}")
    EntityModel<Users> one(@PathVariable Long id) {

        Users users = userRepository.findById(id) //
                .orElseThrow(() -> new UserNotFoundException(id));

        return userModelAssembler.toModel(users);
    }
    @PutMapping("/users/{id}")
    ResponseEntity<?> replaceUser(@RequestBody Users newUsers, @PathVariable Long id) {

        Users updatedUsers = userRepository.findById(id) //
                .map(user -> {
                    user.setName(newUsers.getName());
                    user.setBirthDate(newUsers.getBirthDate());
                    user.setEmail(newUsers.getEmail());
                    return userRepository.save(user);
                }) //
                .orElseGet(() -> {
                    newUsers.setId(id);
                    return userRepository.save(newUsers);
                });

        EntityModel<Users> entityModel = userModelAssembler.toModel(updatedUsers);

        return ResponseEntity //
                .created(entityModel.getRequiredLink(IanaLinkRelations.SELF).toUri()) //
                .body(entityModel);
    }
    @DeleteMapping("/users/{id}")
    ResponseEntity<?> deleteUser(@PathVariable Long id) {

        userRepository.deleteById(id);

        return ResponseEntity.noContent().build();
    }

}


