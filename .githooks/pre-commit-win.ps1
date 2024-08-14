$max_size_mb = 1
$max_size_bytes = $max_size_mb * 1024 * 1024

$large_files = git diff --cached --name-only | ForEach-Object {
    $file = $_
    if (Test-Path $file) {
        $file_size = (Get-Item $file).length
        if ($file_size -gt $max_size_bytes) {
            $file
        }
    }
}

if ($large_files) {
    Write-Error "Some files are too large (over ${max_size_mb}MB):"
    $large_files | ForEach-Object { Write-Error $_ }
    exit 1
}