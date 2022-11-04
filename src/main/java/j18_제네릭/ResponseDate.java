package j18_제네릭;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class ResponseDate<T> {
    private String message;
    private T date;

}
