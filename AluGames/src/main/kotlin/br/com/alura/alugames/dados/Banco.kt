package br.com.alura.alugames.dados

import br.com.alura.alugames.modelo.Jogo
import java.sql.Connection
import java.sql.DriverManager
import java.sql.SQLException
import javax.persistence.EntityManager
import javax.persistence.EntityManagerFactory
import javax.persistence.Persistence

object Banco {
//    fun obterConexao(): Connection? {
//        val url = "jdbc:mysql://localhost:3306/alugames"
//        val user = "root"
//        val password = "!mp4r4v3l$"
//        return try {
//            DriverManager.getConnection(url, user, password)
//        } catch (e: SQLException) {
//            e.printStackTrace()
//            null
//        }
//    }

    fun getEntityManager(): EntityManager {
        val factory: EntityManagerFactory = Persistence.createEntityManagerFactory("alugames")
        return factory.createEntityManager()
    }
}