package me.dio.primeiro_projeto.domian.model;

import jakarta.persistence.*;

import java.util.List;


@Entity(name = "tb_user")
public class UserModel {
    @Id
    private Long id;

    private String name;

    @OneToOne(cascade = CascadeType.ALL)
    private AccountModel account;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<FeatureModel> feature;

    @OneToOne(cascade = CascadeType.ALL)
    private CardModel card;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<NewsModel>  news;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AccountModel getAccount() {
        return account;
    }

    public void setAccount(AccountModel account) {
        this.account = account;
    }

    public List<FeatureModel> getFeature() {
        return feature;
    }

    public void setFeature(List<FeatureModel> feature) {
        this.feature = feature;
    }

    public CardModel getCard() {
        return card;
    }

    public void setCard(CardModel card) {
        this.card = card;
    }

    public List<NewsModel> getNews() {
        return news;
    }

    public void setNews(List<NewsModel> news) {
        this.news = news;
    }
}
