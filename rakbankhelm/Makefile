.PHONY: all package install uninstall clean

all: install

package:
	@echo "Packaging the Helm chart..."
	helm package ./rakbank
	@echo "Package complete."

install: package
	@echo "Deploying the application from the package..."
	helm install rakbank ./rakbank-*.tgz
	@echo "Deployment complete."

uninstall:
	@echo "Uninstalling the application..."
	helm uninstall rakbank
	@echo "Uninstallation complete."

clean:
	@echo "Cleaning up packaged files..."
	rm -f rakbank-*.tgz
	@echo "Clean up complete."

