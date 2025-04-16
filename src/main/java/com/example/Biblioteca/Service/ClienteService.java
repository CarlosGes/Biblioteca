package com.example.Biblioteca.Service;

import com.example.Biblioteca.DTO.ClienteDTO;
import com.example.Biblioteca.Entity.Cliente;
import com.example.Biblioteca.Repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;
@Service
public class ClienteService {
    @Autowired
    private ClienteRepository clienteRepository;


    public List<Cliente> getAll(){
        return clienteRepository.findAll();
    }

    public Cliente fromDTO(ClienteDTO clienteDTO){
        Cliente cliente = new Cliente();
        cliente.setIdCliente(clienteDTO.getIdCliente());
        cliente.setNome(clienteDTO.getNome());
        cliente.setSobrenome((clienteDTO.getSobrenome()));
        cliente.setCpf(clienteDTO.getCpf());


        return cliente;
    }

    public ClienteDTO toDTO(Cliente cliente){
        ClienteDTO clienteDTO = new ClienteDTO();
        clienteDTO.setIdCliente(clienteDTO.getIdCliente());
        clienteDTO.setNome(clienteDTO.getNome());
        cliente.setSobrenome(clienteDTO.getSobrenome());
        clienteDTO.setCpf(clienteDTO.getCpf());

        return clienteDTO;
    }


    public Optional<ClienteDTO> getById(Long id){
        Optional<Cliente> optionalCliente = clienteRepository.findById(id);
        if(optionalCliente.isPresent()){
            return Optional.of(this.toDTO(optionalCliente.get()));
        }else {
            return Optional.empty();
        }

    }

    public ClienteDTO saveDto(ClienteDTO clienteDTO){
        Cliente cliente = this.fromDTO(clienteDTO);
        Cliente clienteBd = clienteRepository.save(cliente);
        return this.toDTO(clienteBd);
    }

    public Optional<ClienteDTO> updateCliente(Long id, ClienteDTO clienteDTO){
        Optional<Cliente> optionalCliente = clienteRepository.findById(id);
        if(optionalCliente.isPresent()){
            Cliente cliente = optionalCliente.get();
            cliente.setNome(clienteDTO.getNome());
            cliente.setSobrenome(clienteDTO.getSobrenome());
            cliente.setCpf(clienteDTO.getCpf());


            Cliente clienteUpdate = clienteRepository.save(cliente);

            return Optional.of(this.toDTO(clienteUpdate));
        }else {
            return Optional.empty();
        }
    }

    public boolean delete(Long id){
        if(clienteRepository.existsById(id)){
            clienteRepository.deleteById(id);
            return true;
        }else {
            return false;
        }
    }
}
