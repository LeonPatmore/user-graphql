## Test

Go to `http://localhost:8080/graphiql?path=/graphql`.

Run the following query:

```graphql
{ user(id: 1) { id name { first last } address { postcode firstLine } } }
```
