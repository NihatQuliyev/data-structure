package factory;

import enums.Exceptions;
import enums.SearchEnum;
import exception.GeneralException;
import service.SearchService;
import service.impl.IBinarySearchAlgorithm;
import service.impl.ILinearSearchAlgorithm;

public class SearchFactory {
    public SearchService createSearchService(SearchEnum searchAlgorithm) {
        switch (searchAlgorithm){
            case LINEAR:
                return new ILinearSearchAlgorithm();
            case BINARY:
                return new IBinarySearchAlgorithm();
            default:
                throw new GeneralException(Exceptions.NOT_FOND_SEARCH_ALGORITHM_EXCEPTION);
        }
    }
}
