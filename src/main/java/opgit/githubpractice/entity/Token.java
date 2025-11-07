package opgit.githubpractice.entity;

import lombok.Data;
import lombok.Getter;

@Data
public class Token {
    private int id;
    private String address;
    private String title;
    private String symbol;
    private String logo;

}
