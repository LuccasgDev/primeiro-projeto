package me.dio.primeiro_projeto.domian.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name = "tb_feature")
public class FeatureModel extends BaseItem{}
