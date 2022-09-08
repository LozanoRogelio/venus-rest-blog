package roger.venusrestblog.controller;

import org.springframework.web.bind.annotation.*;
import roger.venusrestblog.data.Post;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping(value = "/api/posts", produces = "application/json")
public class PostsController {

    private List<Post> posts = new ArrayList<>(); // make a method which populates this list after


    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<Post> fetchPosts() {

        return posts;
    }

    @GetMapping("/{id}")
    public Post fetchPostById(@PathVariable long id) {
//        TODO: go get some posts and return them
        switch((int) id) {
            case 1:
                return new Post(1L, "Post 1", "This is Post 1");
            case 2:
                return new Post(2L, "Post 2", "This is Post 2");
            default:
                throw new RuntimeException("Hey man, resource not found");
        }
    }
}
