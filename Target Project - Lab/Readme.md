<p>
	Update Project di lab 31/5/2017
</p>
<p>
	Updated content:
	<ul>
		<li>
			<p>Menu registrasi member pada <i>class main</i></p>
			<p>Perubahan:</p>
			<ul>
				<li>
					Dijadikan sebagai sebuah method dengan nama <i>RegistMember</i>
				</li>
				<li>
					Method tersebut dideklarasikan dan disimpan di <i>class member</i>
				</li>
				<li>
					<i>Class main</i> hanya memanggil methodnya saja
				</li>
			</ul>
			<p>Class/Mehod yang diubah:</p>
			<ul>
				<li>
					<i>Class main</i> -> <i>main.java</i>
				</li>
				<li>
					<i>Class member</i> -> <i>member.java</i>
				</li>
			</ul>
		</li>
		<li>
			<p>Validasi input pada <i>method RegistMember</i></p>
			<p>Menambahkan validasi untuk data-data yang harus diisi (Nama, Email, Tahun Lahir)</p>
			<p>Perubahan:</p>
			<ul>
				<li>
					<p>Validasi untuk <i>Nama</i></p>
					<ul>
						<li>
							<i>Nama</i> <b>tidak boleh kosong</b>
						</li>
						<li>
							<i>Nama</i> hanya boleh <b>minimal 3 karakter</b>
						</li>
					</ul>
				</li>
				<li>
					<p>Validasi untuk <i>Email</i></p>
					<ul>
						<li>
							<i>Email</i> tidak boleh kosong
						</li>
						<li>
							<p><i>Email</i> harus sesuai dengan format yang telah ditentukan</p>
							<p>
								Misal: "user@subdomain.domain"
							</p>
						</li>
					</ul>
				</li>
			</ul>
			<p>Class/Method yang diubah:</p>
			<ul>
				<li>
					<i>Method RegistMember</i> -> <i>Class member</i>
				</li>
				<li>
					<i>Class member</i> -> <i>member.java</i>
				</li>
			</ul>
		</li>
	</ul>
</p>