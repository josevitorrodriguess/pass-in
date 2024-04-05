package evento.com.passin.domain.event.exceptions;

import evento.com.passin.domain.event.Event;

public class EventFullException extends  RuntimeException{

    public EventFullException(String message){
        super(message);
    }
}
