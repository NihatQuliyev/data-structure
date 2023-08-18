package util;

import enums.SearchEnum;
import enums.SortEnum;
import service.SortAlgorithm;
import factory.SearchFactory;
import factory.SortFactory;
import service.SearchService;

public class MainUtil {
    public static void main(String[] args) {
        int[] input = RandomUtil.inputArr(7, 10);
        SortFactory sortingFactory = new SortFactory();
        SortAlgorithm sortingAlgorithm = sortingFactory.creatSortingAlgorithm(SortEnum.QUICK);
        sortingAlgorithm.show(input);
        sortingAlgorithm.sort(input);
        sortingAlgorithm.show(input);

        SearchFactory searchFactory = new SearchFactory();
        SearchService searchingService = searchFactory.createSearchService(SearchEnum.BINARY);
        System.out.println(searchingService.search(input, 5));


    }
}