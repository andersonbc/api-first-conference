package com.andersonbotelho.api_first_sample;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.andersonbotelho.apifirstsample.api.LecturesApi;
import com.andersonbotelho.apifirstsample.model.LectureRequest;
import com.andersonbotelho.apifirstsample.model.LectureResponse;

@RestController
public class LectureController implements LecturesApi {

    @Override
    public ResponseEntity<LectureResponse> addLecture(LectureRequest lectureRequest) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addLecture'");
    }

    @Override
    public ResponseEntity<Void> deleteLecture(Long lectureId, String apiKey) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteLecture'");
    }

    @Override
    public ResponseEntity<LectureResponse> getLectureById(Long lectureId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getLectureById'");
    }

    @Override
    public ResponseEntity<LectureResponse> updateLecture(LectureRequest lectureRequest) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateLecture'");
    }


}
