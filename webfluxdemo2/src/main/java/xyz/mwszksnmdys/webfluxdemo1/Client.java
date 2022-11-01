package xyz.mwszksnmdys.webfluxdemo1;

import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;
import xyz.mwszksnmdys.webfluxdemo1.entity.User;

/**
 * @className: Client
 * @author: MWS
 * @date: 2022/9/20 下午8:42
 * @description: Todo
 */
public class Client {
    public static void main(String[] args) {
        // 调用服务器地址
        WebClient webClient = WebClient.create("http://127.0.0.1:39855");

        // 根据id查询
        String id = "1";
        User block = webClient.get().uri("/users/{id}", id).accept(MediaType.APPLICATION_JSON).retrieve().bodyToMono(User.class).block();
        System.out.println(block.getName());

        // 查询所有
        Flux<User> results = webClient.get().uri("/users").accept(MediaType.APPLICATION_JSON).retrieve().bodyToFlux(User.class);
        results.map(stu->stu.getName()).buffer().doOnNext(System.out::println).blockFirst();

    }

}
