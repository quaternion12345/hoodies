FROM node:16

RUN mkdir -p /usr/src/app

WORKDIR /usr/src/app

ENV PATH /usr/src/app/node_modules/.bin:$PATH

COPY package*.json ./

RUN npm install --force

COPY ./ ./

EXPOSE 3000

CMD ["npm", "run", "start"]
