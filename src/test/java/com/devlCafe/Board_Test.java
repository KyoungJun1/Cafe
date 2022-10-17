package com.devlCafe;

import com.devlCafe.repository.BOARDRepository;
import com.devlCafe.vo.BOARD_VO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Optional;

@RunWith(SpringRunner.class)
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@DataJpaTest
public class Board_Test {

    @Autowired
    BOARDRepository boardRepository;

    @PersistenceContext
    private EntityManager em;

    @Test
    public void sysout(){
        System.out.println("hello");
    }


    @Test
    @Rollback(false)
    public void insertBoardTest(){
        List<BOARD_VO> list = new ArrayList<>();
        for(int i=0;i<500; i++){
            BOARD_VO BOARD = BOARD_VO.builder()
                    .USER_ID("test_user_id")
                    .BOARD_TYPE("자유") // 자유, 정보, 공략
                    .BOARD_TITLE("test_title")
                    .BOARD_CONTENT("test_content test_content ")
                    .build();
            list.add(BOARD);
        }
        for(BOARD_VO board : list){
            System.out.println(board.toString());
        }
        boardRepository.saveAll(list);
    }



    @Test
    @Rollback(false)
    public void updateBoardTest(){
        List<BOARD_VO> list = new ArrayList<>();
        for(int i=1;i<500;i++){
            if(i%2==1){
                if(boardRepository.findById(i).isEmpty()){
                    System.out.println("해당 인덱스 값이 없습니다.");
                    return;
                } else {
                    long timeNow = Calendar.getInstance().getTimeInMillis();
                    java.sql.Timestamp ts = new java.sql.Timestamp(timeNow);
                    Optional<BOARD_VO> temp = boardRepository.findById(i);
                    BOARD_VO board = temp.get();
                    board.setBOARD_TITLE("test_title_update3");
                    board.setBOARD_CONTENT("test_content_update3 test_content_update3 ");
                    board.setBOARD_MODIFYDATE(ts);
                    list.add(board);
                }
            }
        }
        boardRepository.saveAll(list);
    }

    @Test
    @Rollback(false)
    public void deleteBoardTest(){
        for(int i=471; i<=500;i++){
            boardRepository.deleteById(i);
        }
    }

    @Test // 테스트는 무조건 리턴타입 void
    public void selectBoardTest(){
        TypedQuery<BOARD_VO> query = em.createQuery("SELECT b FROM BOARD_VO b", BOARD_VO.class);
        List<BOARD_VO> list = query.getResultList();
        for(BOARD_VO vo : list){
            System.out.println(vo.toString());
        }
    }



}
