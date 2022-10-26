package ObserverPattern;

import java.util.List;

//интерфейс, с помощью которого наблюдатель получает оповещение; Observer = подписчик
public interface Observer {
    public void handleEvent(List<String> vacancies);
}
