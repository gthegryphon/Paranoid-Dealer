package dev.chambers.DAOs;

import dev.entities.Deck;

public class DeckDAO{
    public Deck getDeckByID(int sessionID){
        try(Connection conn = ConnectionUtil.createConnection()){
            String sql = "select * from decks where session_id=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, session_id);            
            ResultSet rs = ps.executeQuery;
            if(rs.next()){
                deck = new Deck(sessionID, rs.getString("decklist"));
                return deck;
            }else{return new Deck();}
        }
        catch(SQLException e){
            e.printStackTrace();
            return new Deck();
        }
    }
    public Deck createDeck(){
        String emptyDeck = "000000000000000000000000000000000000000000000000000";//51 digits, one per action card
        try(Connection conn = ConnectionUtil.createConnection()){
            String sql = "insert into decks values(default, ?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, emptyDeck);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                //need to fix to actually grab generated session id
                Deck deck = new deck(rs.getInt("session_id"),emptyDeck);
                return deck;
                
            }
            else{return new Deck();}

        }catch(SQLException e){
            e.printStackTrace();
            return new Deck();
        }
    }
    public boolean saveDeck(Deck deck){
        try(Connection conn = ConnectionUtil.createConnection()){
            String sql = "update decks set decklist=? where session_id=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1,deck.deckList);
            ps.setInt(2,deck.sessionID);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                return true;
            }
            else{
                return false;
            }
            
        }catch(SQLException e){
            e.printStackTrace();
            return false;
        }
    }
    public boolean deleteDeck(int sessionID){
        try(Connection conn = ConnectionUtil.createConnection()){
            String sql = "delete from decks where session_id=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, sessionID);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                return true;
            }else{
                return false;
            }
        }catch(SQLException e){
            e.printStackTrace();
            return false;
        }
    }
}