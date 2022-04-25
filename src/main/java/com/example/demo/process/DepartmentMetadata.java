package com.example.demo.process;

import java.io.Serializable;

public class DepartmentMetadata implements Serializable {

    public DepartmentMetadata(Boolean isAssignmentRequired, Boolean isDepartmentHeadReviewRequired) {
        this.isAssignmentRequired = isAssignmentRequired;
        this.isDepartmentHeadReviewRequired = isDepartmentHeadReviewRequired;
    }

    public Boolean isAssignmentRequired;
    public Boolean isDepartmentHeadReviewRequired;

    public Boolean getIsAssignmentRequired() {
        return this.isAssignmentRequired;
    }

    public Boolean getIsDepartmentHeadReviewRequired() {
        return this.isDepartmentHeadReviewRequired;
    }

    public void setIsAssignmentRequired(Boolean isAssignmentRequired) {
        this.isAssignmentRequired = isAssignmentRequired;
    }

    public void setIsDepartmentHeadReviewRequired(Boolean isDepartmentHeadReviewRequired) {
        this.isDepartmentHeadReviewRequired = isDepartmentHeadReviewRequired;
    }

}
