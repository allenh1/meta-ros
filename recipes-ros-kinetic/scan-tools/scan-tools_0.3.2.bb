# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Laser scan processing tools."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD & LGPL-3"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native laser-ortho-projector laser-scan-matcher laser-scan-sparsifier laser-scan-splitter ncd-parser polar-scan-matcher scan-to-cloud-converter"
SRC_URI = "https://github.com/ros-gbp/scan_tools-release/archive/release/kinetic/scan_tools/0.3.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "f1947658f56ede9830726b8c0878f11b"
SRC_URI[sha256sum] = "64e88ee545cbf17c8373709ea7e8e3fa2e07034ebebd567122b34f75b318ad6f"
S = "${WORKDIR}/scan_tools-release-release-kinetic-scan_tools-0.3.2-0"

inherit catkin
