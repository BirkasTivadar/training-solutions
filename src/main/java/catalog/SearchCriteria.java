package catalog;

public final class SearchCriteria {
    private String contributor;
    private String title;

    private SearchCriteria(String title, String contributor) {
        this.title = title;
        this.contributor = contributor;
    }

    public static SearchCriteria createByBoth(String title, String contributor) {
        if (title == null || contributor == null) {
            throw new IllegalArgumentException();
        }
        return new SearchCriteria(title, contributor);
    }

    public static SearchCriteria createByContributor(String contributor) {
        if (contributor == null) {
            throw new IllegalArgumentException();
        }
        return new SearchCriteria(null, contributor);
    }

    public static SearchCriteria createByTitle(String title) {
        if (title == null) {
            throw new IllegalArgumentException();
        }
        return new SearchCriteria(title, null);
    }

    public boolean hasContributor() {
        return this.getContributor() != null;
    }

    public boolean hasTitle() {
        return this.getTitle() != null;
    }

    public String getContributor() {
        return contributor;
    }

    public String getTitle() {
        return title;
    }
}
