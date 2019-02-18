/*
	Copyright 2017 IBM Corp.
	Licensed under the Apache License, Version 2.0 (the "License");
	you may not use this file except in compliance with the License.
	You may obtain a copy of the License at
	http://www.apache.org/licenses/LICENSE-2.0
	Unless required by applicable law or agreed to in writing, software
	distributed under the License is distributed on an "AS IS" BASIS,
	WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
	See the License for the specific language governing permissions and
	limitations under the License.
*/

package com.ibm.cloud.appid.android.testing.helpers;

public class Consts {
	public static final String ACCESS_TOKEN = "eyJhbGciOiJSUzI1NiIsInR5cCI6IkpXVCIsImtpZCI6ImFwcElkLTM5YTM3ZjU3LWEyMjctNGJmZS1hMDQ0LTkzYjZlNjA2MGI2MS0yMDE4LTA4LTAyVDExOjU3OjQzLjQwMSJ9.eyJpc3MiOiJodHRwczovL2FwcGlkLW9hdXRoLnN0YWdlMS5ldS1nYi5ibHVlbWl4Lm5ldCIsImV4cCI6MTU1MDUxMTU3MiwiYXVkIjpbIjkxZDZmYWEyMDBlOGFkMTgyODk2MzE1OTlhM2YzYTVkNWNhZjBiMjciXSwidmVyc2lvbiI6InY0Iiwic3ViIjoiMzExYTlmNzQtNDM5ZC00NzQxLTkzNDctYWU1NjVhMGViMTM3IiwiYW1yIjpbImZhY2Vib29rIl0sImlhdCI6MTU1MDUwNzk2MiwidGVuYW50IjoiMzlhMzdmNTctYTIyNy00YmZlLWEwNDQtOTNiNmU2MDYwYjYxIiwic2NvcGUiOiJvcGVuaWQgYXBwaWRfZGVmYXVsdCBhcHBpZF9yZWFkcHJvZmlsZSBhcHBpZF9yZWFkdXNlcmF0dHIgYXBwaWRfd3JpdGV1c2VyYXR0ciBhcHBpZF9hdXRoZW50aWNhdGVkIn0.EfGjgYEk9uU8-IvuOaXEs4FYElOB8C-azCM9n8wIW1c-TAejDfjtQyqtPjh7BFmPveFbMmijXopDpRNvIpu0uH7l6XYlgmDSKW29t2gwy791xiTkqmOMuU4tN4c4OxEOHr-6pQB-xH3iXAUdEfR5Pu9Yzp8y1TxhtVj6M2y6hRnkPt3mmSRkkaWmTWcXkno8D3YFPIqV0G3hOWSg3ZFjwwcZHtANglQkLXfHR76xwwg31GSzjJbMJc0X7KaI6veJBhd_vgEcdtLhAR6dnLc4MVABkUzcv5ZEio6AX7i7EHBqHQQfwyvu4vDlmwNd_3E-FkXMh0RwAuiKh1GJN6_94w";
	public static final String ID_TOKEN = "eyJhbGciOiJSUzI1NiIsInR5cCI6IkpXVCIsImtpZCI6ImFwcElkLTM5YTM3ZjU3LWEyMjctNGJmZS1hMDQ0LTkzYjZlNjA2MGI2MS0yMDE4LTA4LTAyVDExOjU3OjQzLjQwMSJ9.eyJpc3MiOiJodHRwczovL2FwcGlkLW9hdXRoLnN0YWdlMS5ldS1nYi5ibHVlbWl4Lm5ldCIsImF1ZCI6WyI5MWQ2ZmFhMjAwZThhZDE4Mjg5NjMxNTk5YTNmM2E1ZDVjYWYwYjI3Il0sImV4cCI6MTU1MDUxMTU3MiwidGVuYW50IjoiMzlhMzdmNTctYTIyNy00YmZlLWEwNDQtOTNiNmU2MDYwYjYxIiwiaWF0IjoxNTUwNTA3OTYyLCJ2ZXJzaW9uIjoidjQiLCJlbWFpbCI6ImRvbmxvbnF3ZXJ0eUBnbWFpbC5jb20iLCJuYW1lIjoiRG9uIExvbiIsImdlbmRlciI6Im1hbGUiLCJsb2NhbGUiOiJlbl9VUyIsInBpY3R1cmUiOiJodHRwczovL3BsYXRmb3JtLWxvb2thc2lkZS5mYnNieC5jb20vcGxhdGZvcm0vcHJvZmlsZXBpYy8_YXNpZD0zNzc0NDAxNTkyNzU2NTkmaGVpZ2h0PTUwJndpZHRoPTUwJmV4dD0xNTUzMDk5OTYwJmhhc2g9QWVTQUhzdTBwQ3FDOW9YbSIsInN1YiI6IjMxMWE5Zjc0LTQzOWQtNDc0MS05MzQ3LWFlNTY1YTBlYjEzNyIsImlkZW50aXRpZXMiOlt7InByb3ZpZGVyIjoiZmFjZWJvb2siLCJpZCI6IjM3NzQ0MDE1OTI3NTY1OSJ9XSwiYW1yIjpbImZhY2Vib29rIl0sImF6cCI6IjkxZDZmYWEyMDBlOGFkMTgyODk2MzE1OTlhM2YzYTVkNWNhZjBiMjcifQ.gsvpqADwkYTU0BCcTYdQiH7UcU4I8LtGpNrg9FmsvjcVP4NQv-6Ydagh3Z-7Ch2LEo9-w_EIPPSgxLtl11J1GS2Tm5fTnZDR-5Z8xN01vLWw2Y0yVfU6EOKC3jImN6HRKdJrU5nzHJqe1S-JNmGex7doIEQvKlMkajijz4mWW8-ZWEqcW5xqBIxnjaYv3szflkLg_QDJyPWLiILtExTTz6uLRXpdLD49SC5WAvhpfKGUdX_QlLWojQJHaclTKHoeewR3-6RBay0IO_FG9z7iZno3KU_c-0uf2krpeGklIJXZJ6WtWOBy2XUzn3YUU_AzMm9iMGEFseWuNr2TBYerIg";
	public static final String V3_ID_TOKEN = "eyJhbGciOiJSUzI1NiIsInR5cCI6IkpXVCIsImtpZCI6ImFwcElkLTM5YTM3ZjU3LWEyMjctNGJmZS1hMDQ0LTkzYjZlNjA2MGI2MS0yMDE4LTA4LTAyVDExOjU3OjQzLjQwMSJ9.eyJpc3MiOiJhcHBpZC1vYXV0aC5zdGFnZTEuZXUtZ2IuYmx1ZW1peC5uZXQiLCJhdWQiOiI5MWQ2ZmFhMjAwZThhZDE4Mjg5NjMxNTk5YTNmM2E1ZDVjYWYwYjI3IiwiZXhwIjoyNTUwNTExNTcyLCJ0ZW5hbnQiOiIzOWEzN2Y1Ny1hMjI3LTRiZmUtYTA0NC05M2I2ZTYwNjBiNjEiLCJpYXQiOjE1NTA1MDc5NjIsImVtYWlsIjoiZG9ubG9ucXdlcnR5QGdtYWlsLmNvbSIsIm5hbWUiOiJEb24gTG9uIiwiZ2VuZGVyIjoibWFsZSIsImxvY2FsZSI6ImVuX1VTIiwicGljdHVyZSI6Imh0dHBzOi8vcGxhdGZvcm0tbG9va2FzaWRlLmZic2J4LmNvbS9wbGF0Zm9ybS9wcm9maWxlcGljLz9hc2lkPTM3NzQ0MDE1OTI3NTY1OSZoZWlnaHQ9NTAmd2lkdGg9NTAmZXh0PTE1NTMwOTk5NjAmaGFzaD1BZVNBSHN1MHBDcUM5b1htIiwic3ViIjoiMzExYTlmNzQtNDM5ZC00NzQxLTkzNDctYWU1NjVhMGViMTM3IiwiaWRlbnRpdGllcyI6W3sicHJvdmlkZXIiOiJmYWNlYm9vayIsImlkIjoiMzc3NDQwMTU5Mjc1NjU5In1dLCJhbXIiOlsiZmFjZWJvb2siXX0.oxbln_lAna0C7LLJdljbB4aoKXfoEZ_2znBM-UP98GmAG037FGXJocNlSJQZaASTRvyKaHoDueH_3GemzssTICKJYHrfhnTHUHzw_sn5u4KFQBDgOjp9dyawd-0SYbITnMx8DoBM7UBHyxBQ6gnXeXcVgIg5DNlTXNDZlwLwzs0LTYHyEEGhtOnU761d2pbdahps5UHpI_njeeDOFdDQNn1Kgb2eySFGqCOOpFqQIJeNqZmaV333RQsePl2VM_g1dL9l6qIH88joALq-YBfAxLBQft1R3EkxW3u5cQm4UbkZkfSEgKJ1BEO_W4g7q4xL_rMeLos0Yq0HWl24S7TcaA";
	public static final String REFRESH_TOKEN = "ENCODEDREFRESHTOKEN";
	public static final String ISSUER = "https://appid-oauth.stage1.eu-gb.bluemix.net";
	public static final String AUDIENCE = "91d6faa200e8ad18289631599a3f3a5d5caf0b27";
	public static final String TENANT = "39a37f57-a227-4bfe-a044-93b6e6060b61";
	public static final String JWK = "{\n" + "  \"keys\": [\n" + "    {\n" + "      \"kty\": \"RSA\",\n" + "      \"use\": \"sig\",\n" + "      \"n\": \"ALePj2tZTsUDtGlBKMPU1GjbdpVdKPITqDyLM4YhktHzrB2tt690Sdkr5g8wTFflhMEsNARxQnDr7ZywIgsCvpAqv8JSzuoIu-N8hp3FJeGvMJ_4Fh7mlrxh_KVE7Xv1zbqCGSrmsiWsA-Y0Fxt4QEcPlPd_BDh1W7_vm5WuP0sCNsclziq9t7UIrIrvHXFRA9nuxMsM2OfaisU0T9PczfO16EuJW6jflmP6J3ewoJ1AT1SbX7e98ecyD2Ke5I0ta33yk7AVCLtzubJz2NCDGPTWRivqFC0J1OkV90jzme4Eo7zs-CDK-ItVCkV4mgX6Caknd_j2hucGN4fMUDviWwE\",\n" + "      \"e\": \"AQAB\",\n" + "      \"kid\": \"appId-1533805626000-39a37f57-a227-4bfe-a044-93b6e6060b61\"\n" + "    },\n" + "    {\n" + "      \"kty\": \"RSA\",\n" + "      \"use\": \"sig\",\n" + "      \"n\": \"ALnYtiiOJBatW7w9D3lrot21pogKjYIV9ZEytCKQitAmHpH2MoL9h4Tps7xP1lmd5HVOJoUomZg_S5pS8OlVfa74kVfkozZNuQAJKRNmblRFrv4AjIUCaaKAs4S7qYlGjTA3KhBqqIGOdYeyPLbjyzzzN9vwlK1g2kS2pBtJk_ONP5CHh343FEbdC_5p0A3OvSpn-ce8gn2n0czVyIL5_kxI5oCaNPHdnXrJGhOgARvwMNI8J88pCEJEjuMHZa7sHQIh5-zqKRiONJ7XzeVmOr7q4ySbXcPhDLu2KXSk-At18QvPiUIQ2DZmO9DO4fpsM8MWaZDuX-5Sd-uozGW4fhM\",\n" + "      \"e\": \"AQAB\",\n" + "      \"kid\": \"appId-39a37f57-a227-4bfe-a044-93b6e6060b61-2018-08-02T11:57:43.401\"\n" + "    }\n" + "  ]\n" + "}";
	public static final String Kid ="appId-39a37f57-a227-4bfe-a044-93b6e6060b61-2018-08-02T11:57:43.401";
	public static final String ACCESS_TOKEN_JWK = "eyJhbGciOiJSUzI1NiIsInR5cCI6IkpPU0UiLCJraWQiOiJhcHBJZC0zOWEzN2Y1Ny1hMjI3LTRiZmUtYTA0NC05M2I2ZTYwNjBiNjEtMjAxOC0wOC0wMlQxMTo1Nzo0My40MDEifQ.eyJuYmYiOjE1NTA1MTk2NjEsImV4cCI6NDEwMTAzNjk0MiwiaXNzIjoiaHR0cHM6Ly9hcHBpZC1vYXV0aC5zdGFnZTEuZXUtZ2IuYmx1ZW1peC5uZXQiLCJhdWQiOlsiOTFkNmZhYTIwMGU4YWQxODI4OTYzMTU5OWEzZjNhNWQ1Y2FmMGIyNyJdLCJ0ZW5hbnQiOiIzOWEzN2Y1Ny1hMjI3LTRiZmUtYTA0NC05M2I2ZTYwNjBiNjEiLCJzY29wZSI6ImFwcGlkX2RlZmF1bHQgYXBwaWRfcmVhZHByb2ZpbGUgYXBwaWRfcmVhZHVzZXJhdHRyIGFwcGlkX3dyaXRldXNlcmF0dHIiLCJqdGkiOiIxMmQwNGRjZC1iZjU3LTQwYWMtOTIwNC00MDk1N2FhODg0MDgifQ.5OEkcSrKjvP-YCagOIMAWaVy7PAZNvzqn4OVqBSMP_Z7eFYMaVemTtZKtlHk4sVHSRa4q9vvIclqZjbER6lEKFind8kruihx22_witD-XRE0oBU569uveDlBaaMSke-2CV4PzzYIrclDD8cQaPKsMRsm1fTGrXJ5V3qR-jAC__L8Mhk2Fqw9GRZjZ3bSHTvukfnbEa_TXtSldvlUd9KyjQe9Ib_JpbPRncd2O3uCZM68LC1WgzO2vA8WqOHDB3aBpvkXfLwBBu0VLE2kJqQ4wd8JNSAz1MlYe70xc0P_gbTDP3IbvKPMikJGzHcTCRI4SbRS5Tzde84kjWvWpzYJ3w";
	public static final String ACCESS_TOKEN_JWK_PUBLIC_KEY = "{\n" +
					"  \"keys\": [\n" +
					"    {\n" +
					"      \"kty\": \"RSA\",\n" +
					"      \"n\": \"8TTB9xTreJjRxkxqTKQ0RnZXmmPkrChk5tjWNkXToJ-Rr3cvwODILatS1AK5S1PYvmZ6mgHtAO1MCUPEAkbqor0iQCSy6OnVudYm0a8J59oUMSZ5XYPNZRaTzArWUHP68DUCL083QeRkPlPY0_RooAEoOt2A-8sIZ7ASW65KjKO4LNo8A7Q28h_MwklW2VqzECC3oyCvHsThI_WPBPAVyJPMV4YMaomywyXwKlNcXP4MbDK1pHLB_0sFea6ZMZA7hgJPNGCev_1bzql8g9lNwzedfGqfINnppg7sIBh2-hlSfZzKpBLwIZlFzW3wm4q4Fi8w9FZ3T8mFxmQVkpKi9Q\",\n" +
					"      \"e\": \"AQAB\",\n" +
					"      \"use\": \"sig\",\n" +
					"      \"kid\": \"appId-39a37f57-a227-4bfe-a044-93b6e6060b61-2018-08-02T11:57:43.401\"\n" +
					"    }\n" +
					"  ]\n" +
					"}";
	public static final String APP_ANON_ACCESS_TOKEN = "eyJhbGciOiJSUzI1NiIsInR5cCI6IkpXVCIsImtpZCI6ImFwcElkLTM5YTM3ZjU3LWEyMjctNGJmZS1hMDQ0LTkzYjZlNjA2MGI2MS0yMDE4LTA4LTAyVDExOjU3OjQzLjQwMSJ9.eyJpc3MiOiJodHRwOi8vMTAuMC4yLjI6NjAwMiIsImV4cCI6MTU1MzA5NzcyNywiYXVkIjpbIjkxZDZmYWEyMDBlOGFkMTgyODk2MzE1OTlhM2YzYTVkNWNhZjBiMjciXSwidmVyc2lvbiI6InY0Iiwic3ViIjoiM2Y2MGZkOWEtZTdiNi00ZDM1LWFkZjctMGM4MDQwMGRhZDJlIiwiYW1yIjpbImFwcGlkX2Fub24iXSwiaWF0IjoxNTUwNTA1NzI3LCJ0ZW5hbnQiOiIzOWEzN2Y1Ny1hMjI3LTRiZmUtYTA0NC05M2I2ZTYwNjBiNjEiLCJzY29wZSI6Im9wZW5pZCBhcHBpZF9kZWZhdWx0IGFwcGlkX3JlYWRwcm9maWxlIGFwcGlkX3JlYWR1c2VyYXR0ciBhcHBpZF93cml0ZXVzZXJhdHRyIn0.Fs-BLoIos8tGaevtpIc0aCih-PG3hy-55ZfJl7orcXHWB2ELo_9M6-fNU6N6f1vpOSQ9NgyL3QsA1ytPvE70LZ0Qslkj4bvB5QwGfftrJaNhgHO_UV-YwxJRdMf0Scg3deaHM-wqz4u9d49spCZhQArlc1kT_n5o8JtjpsUwSA6fAws7fakYi4_jCeyK1UFDk6ErpOgEudi_RP1kNlGWML6EoNsDN2MikjFRy82c3wx0xWKowfGi1kKGpnk1zKY0EPNP_1Dbjt-maWbzCKnszYtBr_38o6cL99-Yo6NEncdpJe78307OXeohc-U4co2CgG5qVhwfIdnDIW9rW4Vjfg";
	public static final String APP_ANON_Kid ="appId-39a37f57-a227-4bfe-a044-93b6e6060b61-2018-08-02T11:57:43.401";
	public static final String APP_ANON_JWK ="{\"keys\":[{\"kty\":\"RSA\",\"use\":\"sig\",\"n\":\"AJ-E8O4KJT6So_lUkCIkU0QKW7QjMp9vG7S7vZx0M399idZ4mP7iWWW6OTvjLHpDTx7uapiwRQktDNx3GHigJDmbbu8_VtS5K6J6be1gVrvu6pxmZtrz8PazlH5WYxkuUIfUYpzyfUubZzqzuVWqQO0W9kOhFN7HILAxb1WsQREX-iLg14MGGafrQnJgXHBAwSH0OOJr7v-nRz8AFCAicN8v0uIar9lRA7JRHQCZtpI_lkSGKKBQT1Zae9-9YlWbZlfXErQS1uYoAb3j3uaLbJVO7SNjQqEsRTjYxfpBsTtkvJmwcwA0wV2gBO3JR6K6ep0Y_KyMR8w9Fd_lvJqdltU\",\"e\":\"AQAB\",\"kid\":\"appId-1504685961000-c2d3da94-c901-4392-8f27-d90efd28b5b7\"}]}";
}
