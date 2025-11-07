package opgit.githubpractice.converter;


import lombok.extern.slf4j.Slf4j;
import opgit.githubpractice.dto.TokenDto;
import opgit.githubpractice.entity.Token;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class TokenConverter {
    public TokenDto convert(Token token) {
        return new TokenDto();
    }

    public Token convert(TokenDto tokenDto) {
        return new Token();
    }

    public String someMethod(){
        return "Okey";
    }
}
