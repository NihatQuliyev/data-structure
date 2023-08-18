package factory;

import enums.Exceptions;
import enums.SortEnum;
import exception.GeneralException;
import service.SortAlgorithm;
import service.impl.IBubbleSortAlgorithm;
import service.impl.IMergeSortAlgorithm;
import service.impl.IQuickSortAlgorithm;
import service.impl.IShakerSortAlgorithm;

public class SortFactory {
     public SortAlgorithm creatSortingAlgorithm (SortEnum enums) {
        switch (enums){
            case BUBBLE:
                return new IBubbleSortAlgorithm();
            case SHAKER:
                return new IShakerSortAlgorithm();
            case MERGE:
                return new IMergeSortAlgorithm();
            case QUICK:
                return new IQuickSortAlgorithm();
            default:
                throw new GeneralException(Exceptions.NOT_FOND_SORT_ALGORITHM_EXCEPTION);
        }
    }
}
