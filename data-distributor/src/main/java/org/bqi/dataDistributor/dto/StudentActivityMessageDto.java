package org.bqi.dataDistributor.dto;

import lombok.Data;

@Data
public class StudentActivityMessageDto {
    private String timeStamp;
    private String studentId;
    private String what;
    private String unit;
    private String count;
    private String operation;
}
