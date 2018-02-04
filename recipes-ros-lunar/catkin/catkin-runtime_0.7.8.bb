# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

require catkin_${PV}.bb

# This package includes ONLY the python packages AND catkin_find
# The catkin_${PV} package includes all other files
# from the catkin tool.
FILES_${PN} = "${PYTHON_SITEPACKAGES_DIR} ${ros_bindir}/catkin_find"

RDEPENDS_${PN}_class-native = ""
RDEPENDS_${PN} = "\
    ${PYTHON_PN}-catkin-pkg ${PYTHON_PN}-argparse ${PYTHON_PN}-misc ${PYTHON_PN}-multiprocessing \
    ${PYTHON_PN}-shell ${PYTHON_PN}-subprocess ${PYTHON_PN}-xml ${PYTHON_PN}-pkgutil"

# Delete everything but the python packages in order to avoid
# that the QA error [installed-vs-shipped] hits on us.
do_install_append() {
    rm  ${D}${ros_bindir}/catkin_*_*
    rm  ${D}${ros_bindir}/catkin_make
    rm -rf ${D}${ros_datadir}
    rm -rf ${D}${ros_libdir}/pkgconfig
}

# BBCLASSEXTEND += "native"
inherit catkin
