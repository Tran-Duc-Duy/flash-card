package org.example.sevice;

import org.example.ConnectionSource;
import org.example.domain.FlashCard;

import java.math.BigInteger;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ServiceFactory {

    /*public FlashCardSevice flashCardService(){
        return new FlashCardSevice() {
            private final ConnectionSource connectionSource = ConnectionSource.instance();
            @Override
            public FlashCard getFlashCardById(BigInteger Id) {
                try (final Connection connection = connectionSource.createConnection();
                     final PreparedStatement preparedStatement = connection.prepareStatement(
                             "select * from FLASHCARD " + "where ID = ?")
                ) {
                    preparedStatement.setLong(1, Long.parseLong(String.valueOf(Id)));
                    try (final ResultSet resultSet = preparedStatement.executeQuery()) {
                        while (resultSet.next()) {
                            return new FlashCard(
                                    BigInteger.valueOf(resultSet.getInt(1)),
                                    resultSet.getString(2),
                                    resultSet.getString(3),
                                    resultSet.getString(4),
                                    resultSet.getString(5),
                                    resultSet.getDouble(6)
                            );
                        }
                        return null;
                    }
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
            private List<FlashCard> getFlashCards( List<FlashCard> flashCards, PreparedStatement preparedStatement) throws SQLException {
                try (final ResultSet resultSet = preparedStatement.executeQuery()) {
                    while (resultSet.next()) {
                        flashCards.add(new FlashCard(
                                BigInteger.valueOf(resultSet.getInt(1)),
                                resultSet.getString(2),
                                resultSet.getString(3),
                                resultSet.getString(4),
                                resultSet.getString(5),
                                resultSet.getDouble(6)
                        ));
                    }
                }
                return flashCards;
            }

            public List<FlashCard> createArrayForAll(String by) {
                final List<FlashCard> flashCards = new ArrayList<>();

                try (final Connection connection = connectionSource.createConnection();
                     final PreparedStatement preparedStatement = connection.prepareStatement(
                             "select * from FLASHCARD  ORDER BY "+by
                     )) {
                    return getFlashCards( flashCards, preparedStatement);
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }

            @Override
            public List<FlashCard> getAllSortByName() {
                return createArrayForAll("NAME");
            }

            @Override
            public List<FlashCard> getAllSortByMean() {
                return createArrayForAll("MEAN");
            }

            @Override
            public List<FlashCard> getAllSortByID() {
                return createArrayForAll("ID");

            }

            @Override
            public List<FlashCard> getAllSortByTimeWait() {
                return createArrayForAll("TIMEWAIT");
            }
        };
    }*/
}