package catalog;

import java.util.ArrayList;
import java.util.List;

public class Catalog {

    protected List<CatalogItem> catalogItems = new ArrayList<>();


    public List<CatalogItem> catalogItems() {
        return catalogItems;
    }

    public void addItem(CatalogItem item) {
        catalogItems.add(item);
    }

    public void deleteItemByRegistrationNumber(String registrationNumber) {
        CatalogItem deleteItem = null;
        for (CatalogItem catalogItem : catalogItems) {
            if (catalogItem.getRegistrationNumber().equals(registrationNumber)) {
                deleteItem = catalogItem;
            }
        }
        catalogItems.remove(deleteItem);
    }

    public List<CatalogItem> getAudioLibraryItems() {
        List<CatalogItem> audioItems = new ArrayList<>();
        for (CatalogItem catalogItem : catalogItems) {
            if (catalogItem.hasAudioFeature()) {
                audioItems.add(catalogItem);
            }
        }
        return audioItems;
    }

    public List<CatalogItem> getPrintedLibraryItems() {
        List<CatalogItem> printedItems = new ArrayList<>();
        for (CatalogItem catalogItem : catalogItems) {
            if (catalogItem.hasPrintedFeature()) {
                printedItems.add(catalogItem);
            }
        }
        return printedItems;
    }


    public int getAllPageNumber() {
        int allPageNumber = 0;
        for (CatalogItem catalogItem : catalogItems) {
            if (catalogItem.hasPrintedFeature()) {
                allPageNumber += catalogItem.numberOfPagesAtOneItem();
            }
        }
        return allPageNumber;
    }

    public int getFullLength() {
        int fullLength = 0;
        for (CatalogItem catalogItem : catalogItems) {
            if (catalogItem.hasAudioFeature()) {
                fullLength += catalogItem.fullLengthAtOneItem();
            }
        }
        return fullLength;
    }

    public double averagePageNumberOver(int startPage) {
        if (startPage < 1) {
            throw new IllegalArgumentException("Page number must be positive");
        }
        int db = 0;
        int pages = 0;
        for (CatalogItem catalogItem : catalogItems) {
            if (catalogItem.hasPrintedFeature() && catalogItem.numberOfPagesAtOneItem() >= startPage) {
                pages += catalogItem.numberOfPagesAtOneItem();
                db++;
            }
        }
        if (db < 1) {
            throw new IllegalArgumentException("No page");
        }
        return pages / db;
    }

    public List<CatalogItem> findByCriteria(SearchCriteria searchCriteria) {
        List<CatalogItem> finds = new ArrayList<>();
        if (searchCriteria.hasTitle() && searchCriteria.hasContributor()) {
            for (CatalogItem catalogItem : catalogItems) {
                if (catalogItem.getContributors().contains(searchCriteria.getContributor()) &&
                        catalogItem.getTitles().contains(searchCriteria.getTitle())) {
                    finds.add(catalogItem);
                }
            }
        } else if (searchCriteria.hasContributor()) {
            for (CatalogItem catalogItem : catalogItems) {
                if (catalogItem.getContributors().contains(searchCriteria.getContributor())) {
                    finds.add(catalogItem);
                }
            }
        } else if (searchCriteria.hasTitle()) {
            for (CatalogItem catalogItem : catalogItems) {
                if (catalogItem.getTitles().contains(searchCriteria.getTitle())) {
                    finds.add(catalogItem);
                }
            }
        }
        return finds;
    }
}
