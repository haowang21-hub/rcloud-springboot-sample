
<a name="definitions"></a>
## Definitions

<a name="dict"></a>
### Dict

|Name|Schema|
|---|---|
|**crtDt**  <br>*optional*|string (date-time)|
|**dictId**  <br>*optional*|integer (int32)|
|**dictIdentify**  <br>*optional*|string|
|**dictName**  <br>*optional*|string|
|**dictType**  <br>*optional*|integer (int32)|
|**nt**  <br>*optional*|string|
|**updDt**  <br>*optional*|string (date-time)|


<a name="7417fc7b174f8f9f3bbd52721a622f37"></a>
### PagerResult«Dict»
分页结果


|Name|Description|Schema|
|---|---|---|
|**data**  <br>*optional*|查询页结果|< [Dict](#dict) > array|
|**total**  <br>*optional*|结果总数|integer (int32)|


<a name="f301dd7c835a0fb0891c0f3149eed477"></a>
### ResponseMessage«Dict»

|Name|Schema|
|---|---|
|**body**  <br>*optional*|[Dict](#dict)|
|**code**  <br>*optional*|integer (int32)|
|**message**  <br>*optional*|object|
|**success**  <br>*optional*|boolean|
|**timestamp**  <br>*optional*|integer (int64)|


<a name="d3a4c6bda9cd52e645d4274854174394"></a>
### ResponseMessage«List«Dict»»

|Name|Schema|
|---|---|
|**body**  <br>*optional*|< [Dict](#dict) > array|
|**code**  <br>*optional*|integer (int32)|
|**message**  <br>*optional*|object|
|**success**  <br>*optional*|boolean|
|**timestamp**  <br>*optional*|integer (int64)|


<a name="a992ef7e80eb996e6b77fee4ff546595"></a>
### ResponseMessage«PagerResult«Dict»»

|Name|Schema|
|---|---|
|**body**  <br>*optional*|[PagerResult«Dict»](#7417fc7b174f8f9f3bbd52721a622f37)|
|**code**  <br>*optional*|integer (int32)|
|**message**  <br>*optional*|object|
|**success**  <br>*optional*|boolean|
|**timestamp**  <br>*optional*|integer (int64)|


<a name="d53a2c1e07a660f2c3f1b54e6a7c98bb"></a>
### ResponseMessage«int»

|Name|Schema|
|---|---|
|**body**  <br>*optional*|integer (int32)|
|**code**  <br>*optional*|integer (int32)|
|**message**  <br>*optional*|object|
|**success**  <br>*optional*|boolean|
|**timestamp**  <br>*optional*|integer (int64)|


<a name="4e3465260d0b339c0ae101c8a6821732"></a>
### ResponseMessage«object»

|Name|Schema|
|---|---|
|**body**  <br>*optional*|object|
|**code**  <br>*optional*|integer (int32)|
|**message**  <br>*optional*|object|
|**success**  <br>*optional*|boolean|
|**timestamp**  <br>*optional*|integer (int64)|


<a name="e56f22700c5363524be3f11fbc4b11fc"></a>
### 词典信息

|Name|Description|Schema|
|---|---|---|
|**dictIdentify**  <br>*optional*|词典标识  <br>**Example** : `"graph.river"`|string|
|**dictName**  <br>*optional*|词典名称  <br>**Example** : `"图谱河流"`|string|
|**dictType**  <br>*optional*|词典类型  <br>**Example** : `1`|integer (int32)|



