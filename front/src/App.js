import React, { createContext } from 'react';
import { Form } from './componentes/Form';
import { FormGeneral } from './componentes/FormGeneral';
import { List } from './componentes/List';
import { ListaGeneral } from './componentes/ListaGeneral';
import { StoreProvider } from './componentes/StoreProvider';

export const HOST_API = "http://localhost:8080/api";
export const initialState = {
  todo: { list: [], item: {} },
  listGeneral: [] 
    };

export const Store = createContext(initialState)


function App() {
  return <StoreProvider>
    <FormGeneral />
      <ListaGeneral />
  </StoreProvider>
}

export default App;
