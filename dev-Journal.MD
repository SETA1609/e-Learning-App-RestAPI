# day 21.10.23

- Initial commit: project was created in github.
- Uml diagram was made to have a first view of the project (This will change in the dev cycle as needed)

# day 22.10.23

- First commit: Springboot project was initialized with some profiles.
- some entities and Repositories were made.

# day 23.10.23

- continue with repositories and entities.

# day 24.10.23

- To resolve the previously mention bug, was and autoconfig disable to let the project continue. (At the date wasnt
  known that the bug was because a faulty entity)
- Postgres database was implemented with Docker compose, there were some errors as some entities werent properly
  defined.

# day 26.10.23

- Issue with embedded database was found, as one of the native classes of java was called module too. It was decided to
  called the class ModulE for the moment.
- It was found that the table annotation from lombok is not working at the moment sql schema should be manually given
  in.

# day 27.10.23

- I wasn't in the best condition and started doing dtos for the future requests

# day 29.10.23

- new profiles were set (qa) and the dll create-drop was implemented in the meantime.
- schema was change to .txt until each entity is properly defined.
- repositories were packed with their entities.
- description for myModules, courses and units were encapsulated in a new entity that would have the description in the
  three selected languages (DE, ES, EN)
- Dtos were continued now there are some dtos for creating new entries
- services were declared
- Todo list was started
- Controllers were declared

# day 31.10.23

- sick day
- exceptions package was made and some exceptions were defined and declared
- Controller annotations were given with a - as placeholder for the role and id of the user

---------

# day 18.11.23

- coming back in project
- ticket response and new request were worked on
- ticket entity was change to have enums for status, type and priority
- ticket and msg are going to be fetched through direct queries now
- starting migrating a previous spring security application

# day 19.11.23

- some experimentation was done with spring security jwt tokens + Oauth2 
- TODO myUser has 2 tables at the moment more time is needed to check solution
- public and private keys for development were set for asynchronicity of tokens