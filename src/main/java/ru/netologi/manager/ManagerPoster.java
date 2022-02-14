package ru.netologi.manager;

public class ManagerPoster {

    private Film[] posters = new Film[0];
    private int filmsLimit = 10;

    public ManagerPoster() {
    }

    public ManagerPoster(int filmsLimit) {
        this.filmsLimit = filmsLimit;
    }

    public void addFilms(Film poster) {
        int length = posters.length + 1;
        Film[] tmp = new Film[length];
        System.arraycopy(posters, 0, tmp, 0, posters.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = poster;
        posters = tmp;
    }

    public Film[] findAll() {
        return posters;
    }

    public Film[] findLast() {
        int resultLength = Math.min(filmsLimit, posters.length);
        Film[] result = new Film[resultLength];
        for (int i = 0; i < result.length; i++) {
            int index = posters.length - i - 1;
            result[i] = posters[index];
        }
        return result;
    }
}