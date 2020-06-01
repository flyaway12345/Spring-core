import com.haggardinnovations.repository.HibernateSpeakerRepositoryImpl;
import com.haggardinnovations.repository.SpeakerRepository;
import com.haggardinnovations.service.SpeakerService;
import com.haggardinnovations.service.SpeakerServiceImpl;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan({"com.haggardinnovations"})
public class AppConfig {

//    @Bean(name="speakerService")
//    @Scope(value= BeanDefinition.SCOPE_SINGLETON)
//    public SpeakerService getSpeakerService(){
//        //SpeakerServiceImpl service = new SpeakerServiceImpl(getSpeakerRepository());
//        SpeakerServiceImpl service = new SpeakerServiceImpl();
//     //   service.setRepository(getSpeakerRepository());
//        return service;
//    }

//    @Bean(name="speakerRepository")
//    public SpeakerRepository getSpeakerRepository(){
//        return new HibernateSpeakerRepositoryImpl();
//    }
}
