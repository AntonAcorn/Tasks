package ObserverPattern;
//Сущность, которую мы наблюдаем = издатель =
// интерфейс, определяющий методы для добавления, удаления и оповещения наблюдателей;
// = observable;
public interface Observed {
    public void addObserver(Observer observer);

    public void removeObserver(Observer observer);

    public void notifyObserver();
}
