package main.Materia.Controllers;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import main.Materia.Models.NodeGraphGeneric;
import main.Materia.Models.User;

public class RecommendationEngine {

    public RecommendationEngine() {
    }

    public List<User> recommendFriends(NodeGraphGeneric<User> user, Graph2 graph) {
        List<User> recommendations = new ArrayList<>();
        for (NodeGraphGeneric<User> profile : graph.getUsers()) {
            NodeGraphGeneric<User> potentialFriend = profile;
            if (!user.getFriends().contains(potentialFriend) && !user.getUser().equals((potentialFriend.getUser()))) {
                double similarity = calculateSimilarity(user.getUser(), potentialFriend.getUser());
                if (similarity > 0.3) {
                    recommendations.add(potentialFriend.getUser());
                }
            }
        }
        return recommendations;
    }

    public double calculateSimilarity(User user1, User user2) {
        Set<String> interest1 = new HashSet<>(user1.getInterests());
        Set<String> interest2 = new HashSet<>(user2.getInterests());
        Set<String> intersection = new HashSet<>(interest1);
        intersection.retainAll(interest2);
        Set<String> union = new HashSet<>(interest1);
        union.addAll(interest2);

        double resp = (double) intersection.size() / union.size();
        System.out.println("Valor - " + resp);
        return resp;

    }

}
