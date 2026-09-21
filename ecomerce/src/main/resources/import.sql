-- Categoria
INSERT INTO categoria (id, nome, descricao) VALUES (1, 'Eletrônicos', 'Produtos eletrônicos em geral');
INSERT INTO categoria (id, nome, descricao) VALUES (2, 'Informática', 'Computadores e acessórios');
INSERT INTO categoria (id, nome, descricao) VALUES (3, 'Livros', 'Livros técnicos e literatura');
INSERT INTO categoria (id, nome, descricao) VALUES (4, 'Vestuário', 'Roupas e acessórios');
INSERT INTO categoria (id, nome, descricao) VALUES (5, 'Alimentos', 'Produtos alimentícios');

-- Produto
INSERT INTO produto (id, nome, descricao, estoque, preco, categoria_id) VALUES (1, 'Smartphone Galaxy', 'Smartphone Android 128GB', 50, 1999.90, 1);
INSERT INTO produto (id, nome, descricao, estoque, preco, categoria_id) VALUES (2, 'Notebook Dell', 'Notebook i5 8GB RAM', 20, 3499.00, 2);
INSERT INTO produto (id, nome, descricao, estoque, preco, categoria_id) VALUES (3, 'Livro Clean Code', 'Livro sobre boas práticas de programação', 15, 89.90, 3);
INSERT INTO produto (id, nome, descricao, estoque, preco, categoria_id) VALUES (4, 'Camiseta Polo', 'Camiseta polo masculina', 100, 59.90, 4);
INSERT INTO produto (id, nome, descricao, estoque, preco, categoria_id) VALUES (5, 'Café Gourmet', 'Pacote de café gourmet 500g', 80, 24.90, 5);

-- Cliente
INSERT INTO cliente (id, nome, email, telefone) VALUES (1, 'João Silva', 'joao.silva@email.com', '(14) 99999-1111');
INSERT INTO cliente (id, nome, email, telefone) VALUES (2, 'Maria Oliveira', 'maria.oliveira@email.com', '(14) 99999-2222');
INSERT INTO cliente (id, nome, email, telefone) VALUES (3, 'Carlos Souza', 'carlos.souza@email.com', '(14) 99999-3333');
INSERT INTO cliente (id, nome, email, telefone) VALUES (4, 'Ana Pereira', 'ana.pereira@email.com', '(14) 99999-4444');
INSERT INTO cliente (id, nome, email, telefone) VALUES (5, 'Pedro Santos', 'pedro.santos@email.com', '(14) 99999-5555');

-- Pedido
INSERT INTO pedido (id, data, status, valor_total, cliente_id) VALUES (1, '2026-01-10 10:00:00', 'CONCLUIDO', 1999.90, 1);
INSERT INTO pedido (id, data, status, valor_total, cliente_id) VALUES (2, '2026-01-12 14:30:00', 'PENDENTE', 3499.00, 2);
INSERT INTO pedido (id, data, status, valor_total, cliente_id) VALUES (3, '2026-01-15 09:15:00', 'CONCLUIDO', 89.90, 3);
INSERT INTO pedido (id, data, status, valor_total, cliente_id) VALUES (4, '2026-01-18 16:45:00', 'CANCELADO', 59.90, 4);
INSERT INTO pedido (id, data, status, valor_total, cliente_id) VALUES (5, '2026-01-20 11:20:00', 'PENDENTE', 24.90, 5);

-- ItemPedido
INSERT INTO item_pedido (id, quantidade, valor_unitario, pedido_id, produto_id) VALUES (1, 1, 1999.90, 1, 1);
INSERT INTO item_pedido (id, quantidade, valor_unitario, pedido_id, produto_id) VALUES (2, 1, 3499.00, 2, 2);
INSERT INTO item_pedido (id, quantidade, valor_unitario, pedido_id, produto_id) VALUES (3, 1, 89.90, 3, 3);
INSERT INTO item_pedido (id, quantidade, valor_unitario, pedido_id, produto_id) VALUES (4, 1, 59.90, 4, 4);
INSERT INTO item_pedido (id, quantidade, valor_unitario, pedido_id, produto_id) VALUES (5, 1, 24.90, 5, 5);

-- Pagamento
INSERT INTO pagamento (id, valor, data, status, tipo, pedido_id) VALUES (1, 1999.90, '2026-01-10 10:05:00', 'APROVADO', 'CARTAO_CREDITO', 1);
INSERT INTO pagamento (id, valor, data, status, tipo, pedido_id) VALUES (2, 3499.00, '2026-01-12 14:35:00', 'PENDENTE', 'BOLETO', 2);
INSERT INTO pagamento (id, valor, data, status, tipo, pedido_id) VALUES (3, 89.90, '2026-01-15 09:20:00', 'APROVADO', 'PIX', 3);
INSERT INTO pagamento (id, valor, data, status, tipo, pedido_id) VALUES (4, 59.90, '2026-01-18 16:50:00', 'CANCELADO', 'CARTAO_DEBITO', 4);
INSERT INTO pagamento (id, valor, data, status, tipo, pedido_id) VALUES (5, 24.90, '2026-01-20 11:25:00', 'PENDENTE', 'PIX', 5);