# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "swri_serial_util"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "boost catkin-native"
SRC_URI = "https://github.com/swri-robotics-gbp/marti_common-release/archive/release/lunar/swri_serial_util/2.0.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "82cf8c6a047c39a86c87b366dd76633f"
SRC_URI[sha256sum] = "8f2d27cc2aafbde4ee562a91e87f803ea1bee8f6deca26660be2d4178f7d6583"
S = "${WORKDIR}/marti_common-release-release-lunar-swri_serial_util-2.0.0-0"

inherit catkin
