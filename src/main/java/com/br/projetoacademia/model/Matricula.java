	package com.br.projetoacademia.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "matriculas")
public class Matricula {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull
	@Column(name = "data_inicio", nullable = false)
	private LocalDate dataInicioMatricula;
	
	@NotNull
	@Column(name = "data_fim", nullable = false)
	private LocalDate dataFimMatricula;
	
	@Enumerated(EnumType.STRING)
	@Column(length = 20, nullable = false)
	private StatusMatricula status;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "aluno_id", nullable = false)
	private Aluno aluno;
	
	@NotNull
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "plano_id", nullable = false)
	private Plano plano;
	
	@OneToMany(mappedBy = "matricula", fetch = FetchType.LAZY)
	private List<Pagamento> pagamentos;
	
    @Column(name = "data_criacao", updatable = false)
	private LocalDateTime dataCriacao;
    
    @Column(name = "data_atualizacao")
	private LocalDateTime dataAtualizacao;
	
    @PrePersist
    public void prePersist() {
        this.dataCriacao = LocalDateTime.now();
    }

    @PreUpdate
    public void preUpdate() {
        this.dataAtualizacao = LocalDateTime.now();
    }
    
}
